package com.botron.jiraReportApi.pojo;

public class Fields {
	private Priority priority;
	private Reporter reporter;
	private Issuetype issuetype;
	private String created;
	private String description;
	private String summary;

	public Fields() {
		// TODO Auto-generated constructor stub
	}

	public Fields(Priority priority, Reporter reporter, Issuetype issuetype, String created, String description,
			String summary) {
		super();
		this.priority = priority;
		this.reporter = reporter;
		this.issuetype = issuetype;
		this.created = created;
		this.description = description;
		this.summary = summary;
	}

	public Priority getPriority() {
		return priority;
	}

	public void setPriority(Priority priority) {
		this.priority = priority;
	}

	public Reporter getReporter() {
		return reporter;
	}

	public void setReporter(Reporter reporter) {
		this.reporter = reporter;
	}

	public Issuetype getIssuetype() {
		return issuetype;
	}

	public void setIssuetype(Issuetype issuetype) {
		this.issuetype = issuetype;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

}
