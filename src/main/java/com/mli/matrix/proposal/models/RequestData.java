package com.mli.matrix.proposal.models;

public class RequestData {
	private RequestPayload requestPayload;

	public RequestData() {
		
	}

	public RequestData(Metadata metadata, RequestPayload requestPayload) {
		super();
		this.requestPayload = requestPayload;
	}

	public RequestPayload getRequestPayload() {
		return requestPayload;
	}

	public void setRequestPayload(RequestPayload requestPayload) {
		this.requestPayload = requestPayload;
	}

	@Override
	public String toString() {
		return "RequestData [requestPayload=" + requestPayload + "]";
	}
}

