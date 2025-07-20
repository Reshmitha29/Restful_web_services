package restful_web_services.RestfulWebServiceApplication.exception;

import java.time.LocalDate;

public class ErrorDetails {
	
	//standard structure for Error message 
	//Timestamp
	//Description
	//details
	private String details;
	private String message;
	private LocalDate timestamp;
	public ErrorDetails(LocalDate timestamp, String message, String details) {
		super();
		this.details = details;
		this.message = message;
		this.timestamp = timestamp;
	}
	public String getDetails() {
		return details;
	}
	public String getMessage() {
		return message;
	}
	public LocalDate getTimestamp() {
		return timestamp;
	}
	
	
	

}
