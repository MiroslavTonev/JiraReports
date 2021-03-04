package com.botron.jiraReportApi.pojo;

public class JiraRequestPojo {
	private String jql;
	private int startAt;
	private int maxResults;
	
	public JiraRequestPojo() {
		// TODO Auto-generated constructor stub
	}

	public JiraRequestPojo(String jql, int startAt, int maxResults) {
		super();
		this.jql = jql;
		this.startAt = startAt;
		this.maxResults = maxResults;
	}

	public String getJql() {
		return jql;
	}

	public void setJql(String jql) {
		this.jql = jql;
	}

	public int getStartAt() {
		return startAt;
	}

	public void setStartAt(int startAt) {
		this.startAt = startAt;
	}

	public int getMaxResults() {
		return maxResults;
	}

	public void setMaxResults(int maxResults) {
		this.maxResults = maxResults;
	}
	
	
	
	
	
}
