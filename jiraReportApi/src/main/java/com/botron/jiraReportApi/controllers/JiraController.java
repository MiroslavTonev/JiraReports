package com.botron.jiraReportApi.controllers;

import java.io.FileWriter;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.botron.jiraReportApi.pojo.JiraIssuesResponsePojo;
import com.botron.jiraReportApi.pojo.JiraRequestPojo;
import com.botron.jiraReportApi.pojo.RequestPojo;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

@RestController
public class JiraController {

	@Autowired
	@Qualifier("jsonMapper")
	private ObjectMapper mapper;
	@Autowired
	@Qualifier("xmlMapper")
	private XmlMapper xmlMapper;
	private final String REQUEST_URL_DEFAULT = "https://jira.atlassian.com/rest/api/2/search?jql=issuetype IN (Bug, Documentation, Enhancement) AND UPDATED > startOfWeek()";
	private final String REQUEST_URL = "https://jira.atlassian.com/rest/api/2/search";
	private final String JQL = "issuetype IN (Bug, Documentation, Enhancement) AND UPDATED > startOfWeek()";
	
	@PostMapping(path = "/getIssues", produces = "application/json", consumes = "application/json")
	public JiraIssuesResponsePojo getJiraInfo(@RequestBody RequestPojo requestPojo) {
		RestTemplate restTemplate = new RestTemplate();
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		JiraRequestPojo jiraRequestPojo = new JiraRequestPojo(JQL, requestPojo.getStartAt(), requestPojo.getMaxResults());
		HttpEntity<JiraRequestPojo> requestEntity = new HttpEntity<JiraRequestPojo>(jiraRequestPojo, headers);
		
		
		ResponseEntity<JiraIssuesResponsePojo> restRequest = restTemplate.postForEntity(
				REQUEST_URL,requestEntity,JiraIssuesResponsePojo.class);

		JiraIssuesResponsePojo resultPojo = restRequest.getBody();
		mapResponse(resultPojo,requestPojo);
		return resultPojo;
	}
	
	@PostMapping(path = "/getIssuesDefaultCount", produces = "application/json", consumes = "application/json")
	public JiraIssuesResponsePojo getJiraInfoDefaultCount(@RequestBody RequestPojo requestPojo) {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<JiraIssuesResponsePojo> restRequest = restTemplate.getForEntity(
				REQUEST_URL_DEFAULT,JiraIssuesResponsePojo.class);

		JiraIssuesResponsePojo resultPojo = restRequest.getBody();
		mapResponse(resultPojo,requestPojo);
		return resultPojo;
	}
	
	private void mapResponse(JiraIssuesResponsePojo resultPojo, RequestPojo requestPojo) {
		try (FileWriter writer = new FileWriter(requestPojo.getFileDestination() + requestPojo.getFileName() + "."
				+ requestPojo.getFileType().name().toLowerCase())) {
			switch (requestPojo.getFileType().name().toLowerCase()) {
			case "xml":
				writer.write(xmlMapper.writerWithDefaultPrettyPrinter().writeValueAsString(resultPojo));
				break;

			default:
				writer.write(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(resultPojo));
				break;
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
