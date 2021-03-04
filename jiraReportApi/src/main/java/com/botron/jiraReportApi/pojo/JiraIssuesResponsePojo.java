package com.botron.jiraReportApi.pojo;

import java.util.List;

public class JiraIssuesResponsePojo {
	private List<Issues> issues;

	public JiraIssuesResponsePojo() {
		// TODO Auto-generated constructor stub
	}

	public JiraIssuesResponsePojo(List<Issues> issues) {
		super();
		this.issues = issues;
	}

	public List<Issues> getIssues() {
		return issues;
	}

	public void setIssues(List<Issues> issues) {
		this.issues = issues;
	}

}
