package com.mli.matrix.proposal.models;

public class InputRequest {
	private Request request;

	public InputRequest() {
		
	}

	public InputRequest(Request request) {
		super();
		this.request = request;
	}

	public Request getRequest() {
		return request;
	}

	public void setRequest(Request request) {
		this.request = request;
	}

	@Override
	public String toString() {
		return "InputRequest [request=" + request + "]";
	}
}

