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
@JsonPropertyOrder({ "enrollmentNo" })
public class Enrollment {

	@JsonProperty("enrollmentNo")
	private String enrollmentNo;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Enrollment() {
	}

	/**
	 * 
	 * @param enrollmentNo
	 */
	public Enrollment(String enrollmentNo) {
		super();
		this.enrollmentNo = enrollmentNo;
	}

	@JsonProperty("enrollmentNo")
	public String getEnrollmentNo() {
		return enrollmentNo;
	}

	@JsonProperty("enrollmentNo")
	public void setEnrollmentNo(String enrollmentNo) {
		this.enrollmentNo = enrollmentNo;
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