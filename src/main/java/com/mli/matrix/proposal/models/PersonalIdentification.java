package com.mli.matrix.proposal.models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "phone", "aadhaar", "enrollment" })
public class PersonalIdentification {

	@JsonProperty("phone")
	private List<Phone> phone = null;
	@JsonProperty("aadhaar")
	private Aadhaar aadhaar;
	@JsonProperty("enrollment")
	private Enrollment enrollment;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public PersonalIdentification() {
	}

	/**
	 * 
	 * @param phone
	 * @param enrollment
	 * @param aadhaar
	 */
	public PersonalIdentification(List<Phone> phone, Aadhaar aadhaar, Enrollment enrollment) {
		super();
		this.phone = phone;
		this.aadhaar = aadhaar;
		this.enrollment = enrollment;
	}

	@JsonProperty("phone")
	public List<Phone> getPhone() {
		return phone;
	}

	@JsonProperty("phone")
	public void setPhone(List<Phone> phone) {
		this.phone = phone;
	}

	@JsonProperty("aadhaar")
	public Aadhaar getAadhaar() {
		return aadhaar;
	}

	@JsonProperty("aadhaar")
	public void setAadhaar(Aadhaar aadhaar) {
		this.aadhaar = aadhaar;
	}

	@JsonProperty("enrollment")
	public Enrollment getEnrollment() {
		return enrollment;
	}

	@JsonProperty("enrollment")
	public void setEnrollment(Enrollment enrollment) {
		this.enrollment = enrollment;
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