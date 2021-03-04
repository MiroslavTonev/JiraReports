package com.botron.jiraReportApi.pojo;

public class Priority {
	private String self;
	private String iconUrl;
	private String name;
	private String id;
	
	
	public Priority() {
		// TODO Auto-generated constructor stub
	}
	
	public Priority(String self, String iconUrl, String name, String id) {
		super();
		this.self = self;
		this.iconUrl = iconUrl;
		this.name = name;
		this.id = id;
	}
	public String getSelf() {
		return self;
	}
	public void setSelf(String self) {
		this.self = self;
	}
	public String getIconUrl() {
		return iconUrl;
	}
	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
}
