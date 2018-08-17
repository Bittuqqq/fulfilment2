package com.mli.matrix.proposal.models;

public class OutputResponse {
	private Response response;

	public OutputResponse() {
		
	}

	public OutputResponse(Response response) {
		super();
		this.response = response;
	}

	public Response getResponse() {
		return response;
	}

	public void setResponse(Response response) {
		this.response = response;
	}

	@Override
	public String toString() {
		return "OutputResponse [response=" + response + "]";
	}
}

