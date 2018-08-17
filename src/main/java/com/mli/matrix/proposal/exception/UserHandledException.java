package com.mli.matrix.proposal.exception;

/**
 * This is the main exception model which will be sent as part of all the response.
 * 
 * It can accommodate a single message or the multiple messages based on the requirement.
 * 
 * @author arpita
 *
 */

import java.util.List;

import org.springframework.http.HttpStatus;

import com.mli.matrix.proposal.models.Response;

public class UserHandledException extends Exception {

	private static final long serialVersionUID = 1L;
	private List<String> errorMessages;
	private HttpStatus httpstatus;
	private Response response;

	/**
	 * @return the errorMessages
	 */
	public List<String> getErrorMessages() {
		return errorMessages;
	}

	/**
	 * @param errorMessages
	 *            the errorMessages to set
	 */
	public void setErrorMessages(List<String> errorMessages) {
		this.errorMessages = errorMessages;
	}

	/**
	 * @return the httpstatus
	 */
	public HttpStatus getHttpstatus() {
		return httpstatus;
	}

	/**
	 * @param httpstatus
	 *            the httpstatus to set
	 */
	public void setHttpstatus(HttpStatus httpstatus) {
		this.httpstatus = httpstatus;
	}

	/**
	 * @return the response
	 */
	public Response getResponse() {
		return response;
	}

	/**
	 * @param response
	 *            the response to set
	 */
	public void setResponse(Response response) {
		this.response = response;
	}
	
	//default constructor
	public UserHandledException(){
		
	}

	// Parameterized constructor
	public UserHandledException(Response response, List<String> errorMessages, HttpStatus httpstatus) {
		super();
		this.response = response;
		this.errorMessages = errorMessages;
		this.httpstatus = httpstatus;
	}
	
	@Override
	public String toString() {
		return "BaseException [errorMessages=" + errorMessages + ", httpstatus=" + httpstatus + ", response=" + response
				+ "]";
	}

}
