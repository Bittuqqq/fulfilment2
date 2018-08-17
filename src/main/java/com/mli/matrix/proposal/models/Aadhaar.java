package com.mli.matrix.proposal.models;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "aadhaarNumber", "isAadhaarValidated" })
public class Aadhaar {

	@JsonProperty("aadhaarNumber")
	private String aadhaarNumber;
	@JsonProperty("isAadhaarValidated")
	private String isAadhaarValidated;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Aadhaar() {
	}

	/**
	 * 
	 * @param aadhaarNumber
	 * @param isAadhaarValidated
	 */
	public Aadhaar(String aadhaarNumber, String isAadhaarValidated) {
		super();
		this.aadhaarNumber = aadhaarNumber;
		this.isAadhaarValidated = isAadhaarValidated;
	}

	@JsonProperty("aadhaarNumber")
	public String getAadhaarNumber() {
		return aadhaarNumber;
	}

	@JsonProperty("aadhaarNumber")
	public void setAadhaarNumber(String aadhaarNumber) {
		this.aadhaarNumber = aadhaarNumber;
	}

	@JsonProperty("isAadhaarValidated")
	public String getIsAadhaarValidated() {
		return isAadhaarValidated;
	}

	@JsonProperty("isAadhaarValidated")
	public void setIsAadhaarValidated(String isAadhaarValidated) {
		this.isAadhaarValidated = isAadhaarValidated;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}