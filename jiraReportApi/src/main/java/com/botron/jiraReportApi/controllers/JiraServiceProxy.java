package com.botron.jiraReportApi.controllers;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "jira", url="https://jira.atlassian.com")
public interface JiraServiceProxy {
	
	@GetMapping("rest/api/2/search?jql=issuetype%20IN%20(Bug,%20Documentation,%20Enhancement)%20AND%20UPDATED%20%3E%20startOfWeek()")
	public String getIssuesInformation();
	
}
