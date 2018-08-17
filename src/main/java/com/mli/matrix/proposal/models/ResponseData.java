package com.mli.matrix.proposal.models;

public class ResponseData {
	private ResponsePayload responsePayload;

	public ResponseData() {
		
	}

	public ResponsePayload getResponsePayload() {
		return responsePayload;
	}

	public void setResponsePayload(ResponsePayload responsePayload) {
		this.responsePayload = responsePayload;
	}

	public ResponseData(ResponsePayload responsePayload) {
		super();
		this.responsePayload = responsePayload;
	}
	
	@Override
	public String toString() {
		return "ResponseData [responsePayload=" + responsePayload + "]";
	}
}