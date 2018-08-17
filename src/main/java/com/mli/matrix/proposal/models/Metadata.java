package com.mli.matrix.proposal.models;

public class Metadata {
	private String env;
	private String requestId;
	
	public Metadata(String env, String requestId) {
		super();
		this.env = env;
		this.requestId = requestId;
	}
	
	public Metadata() {
		
	}

	public String getEnv() {
		return env;
	}

	public void setEnv(String env) {
		this.env = env;
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	@Override
	public String toString() {
		return "Metadata [env=" + env + ", requestId=" + requestId + "]";
	}
}

