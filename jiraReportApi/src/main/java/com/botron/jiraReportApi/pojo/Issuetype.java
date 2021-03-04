package com.botron.jiraReportApi.pojo;

public class Issuetype {
	private String self;
	private String id;
	private String description;
	private String iconUrl;
	private String name;
	private String subtask;
	private String avatarId;
	
	public Issuetype() {
		// TODO Auto-generated constructor stub
	}
	
	public Issuetype(String self, String id, String description, String iconUrl, String name, String subtask,
			String avatarId) {
		super();
		this.self = self;
		this.id = id;
		this.description = description;
		this.iconUrl = iconUrl;
		this.name = name;
		this.subtask = subtask;
		this.avatarId = avatarId;
	}
	public String getSelf() {
		return self;
	}
	public void setSelf(String self) {
		this.self = self;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
	public String getSubtask() {
		return subtask;
	}
	public void setSubtask(String subtask) {
		this.subtask = subtask;
	}
	public String getAvatarId() {
		return avatarId;
	}
	public void setAvatarId(String avatarId) {
		this.avatarId = avatarId;
	}
	
	
}
