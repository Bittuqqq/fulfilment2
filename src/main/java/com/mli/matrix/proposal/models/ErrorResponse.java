package com.mli.matrix.proposal.models;

/**
 * @author arpita
 *
 */

import java.util.Date;
import java.util.List;

public class ErrorResponse {

	private Date timestamp;
	
	private int errorCode;

	private List<String> errorMessages;

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public List<String> getErrorMessages() {
		return errorMessages;
	}

	public void setErrorMessages(List<String> errorMessages) {
		this.errorMessages = errorMessages;
	}
	
	@Override
	public String toString() {
		return "ErrorResponse [timestamp=" + timestamp + ", errorCode=" + errorCode + ", errorMessages=" + errorMessages
				+ "]";
	}

	public ErrorResponse(Date timestamp, int errorCode, List<String> errorMessages) {
		super();
		this.timestamp = timestamp;
		this.errorCode = errorCode;
		this.errorMessages = errorMessages;
	}

}
