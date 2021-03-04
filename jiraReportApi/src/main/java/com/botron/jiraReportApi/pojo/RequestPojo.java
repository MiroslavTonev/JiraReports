package com.botron.jiraReportApi.pojo;

public class RequestPojo {
	private FileType fileType;
	private String fileName;
	private String fileDestination;

	public RequestPojo() {
		// TODO Auto-generated constructor stub
	}

	public RequestPojo(FileType fileType, String fileName, String fileDestination) {
		super();
		this.fileType = fileType;
		this.fileName = fileName;
		this.fileDestination = fileDestination;
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

}
