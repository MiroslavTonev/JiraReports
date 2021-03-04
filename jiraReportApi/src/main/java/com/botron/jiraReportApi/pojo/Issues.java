package com.botron.jiraReportApi.pojo;

public class Issues {
	private String key;
	private Fields fields;
	
	public Issues() {
		// TODO Auto-generated constructor stub
	}

	public Issues(String key, Fields fields) {
		super();
		this.key = key;
		this.fields = fields;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public Fields getFields() {
		return fields;
	}

	public void setFields(Fields fields) {
		this.fields = fields;
	}
	
	
	
	
}
