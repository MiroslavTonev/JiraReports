package com.botron.jiraReportApi.pojo;

public class RequestPojo {
	private FileType fileType;
	private String fileName;
	private String fileDestination;
	private int startAt;
	private int maxResults;

	public RequestPojo() {
		// TODO Auto-generated constructor stub
	}

	public RequestPojo(FileType fileType, String fileName, String fileDestination, int startAt, int maxResults) {
		super();
		this.fileType = fileType;
		this.fileName = fileName;
		this.fileDestination = fileDestination;
		this.startAt = startAt;
		this.maxResults = maxResults;
	}

	public FileType getFileType() {
		return fileType;
	}

	public void setFileType(FileType fileType) {
		this.fileType = fileType;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileDestination() {
		return fileDestination;
	}

	public void setFileDestination(String fileDestination) {
		this.fileDestination = fileDestination;
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
