package com.botron.jiraReportApi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

@Configuration
public class ApplicationConfiguration {

	@Bean("jsonMapper")
	@Primary
	public ObjectMapper getObjectMapper() {
		return new ObjectMapper();
	}
	
	@Bean("xmlMapper")
	public XmlMapper getXmlMapper() {
		return new XmlMapper();
	}
}
