package com.example.rest.webservices.restful_web_servies_socialmedia.exception;

import java.time.LocalDateTime;

public class ErrorDetails {
	
	private LocalDateTime timestamp;
	private String messaage;
	private String details;
	
	public ErrorDetails(LocalDateTime timestamp, String messaage, String details) {
		super();
		this.timestamp = timestamp;
		this.messaage = messaage;
		this.details = details;
	}

	
	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public String getMessaage() {
		return messaage;
	}

	public String getDetails() {
		return details;
	}
	
	
}
