package com.mli.matrix.proposal.models;

public class Request {
	private Metadata metadata;
	private RequestData requestData;
	
	public Request() {
		
	}

	public Request(Metadata metadata, RequestData requestData) {
		super();
		this.metadata = metadata;
		this.requestData = requestData;
	}

	public Metadata getMetadata() {
		return metadata;
	}

	public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
	}

	public RequestData getRequestData() {
		return requestData;
	}

	public void setRequestData(RequestData requestData) {
		this.requestData = requestData;
	}

	@Override
	public String toString() {
		return "Request [metadata=" + metadata + ", requestData=" + requestData + "]";
	}
}

