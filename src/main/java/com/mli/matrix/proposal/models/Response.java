package com.mli.matrix.proposal.models;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Response {
	private Metadata metadata;
	private ResponseData responseData;
	private ErrorResponse errorResponse;
	
	Logger logger = LoggerFactory.getLogger(Response.class);
	
	public Response() {
		
	}
	
	public Response(Metadata metadata, ResponseData responseData) {
		super();
		this.metadata = metadata;
		this.responseData = responseData;
	}
	
	public Metadata getMetadata() {
		return metadata;
	}
	
	/**
	 * @return the errorResonse
	 */
	public ErrorResponse getErrorResponse() {
		return errorResponse;
	}

	/**
	 * @param errorResonse the errorResonse to set
	 */
	public void setErrorResponse(ErrorResponse errorResonse) {
		this.errorResponse = errorResonse;
	}

	public void setMetadata(Metadata metadata) {
		logger.debug("Response Metadata {}",metadata );
		this.metadata = metadata;
	}
	
	public ResponseData getResponseData() {
		return responseData;
	}
	
	public void setResponseData(ResponseData responseData) {
		logger.debug("Response Data being sent", responseData);
		this.responseData = responseData;
	}
	
	@Override
	public String toString() {
		return "Response [metadata=" + metadata + ", responseData=" + responseData + "]";
	}
}


