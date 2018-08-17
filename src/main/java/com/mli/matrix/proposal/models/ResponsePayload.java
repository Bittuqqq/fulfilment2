package com.mli.matrix.proposal.models;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ResponsePayload {
	
	Logger logger = LoggerFactory.getLogger(ResponsePayload.class);
	
	private List<Object> message;
	
	public ResponsePayload() {
		
	}
	
	public ResponsePayload(Logger logger, List<Object> message) {
		super();
		this.logger = logger;
		this.message = message;
	}
	
	public List<Object> getMessage() {
		return message;
	}
	
	public void setMessage(List<Object> message) {
		this.message = message;
	}
	
	@Override
	public String toString() {
		return "ResponsePayload [logger=" + logger + ", message=" + message + "]";
	}
}