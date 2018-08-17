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
@JsonPropertyOrder({ "type", "basicDetails", "personalIdentification" })
public class PartyDetail {

	@JsonProperty("type")
	private String type;
	@JsonProperty("basicDetails")
	private BasicDetails basicDetails;
	@JsonProperty("personalIdentification")
	private PersonalIdentification personalIdentification;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public PartyDetail() {
	}

	/**
	 * 
	 * @param basicDetails
	 * @param type
	 * @param personalIdentification
	 */
	public PartyDetail(String type, BasicDetails basicDetails, PersonalIdentification personalIdentification) {
		super();
		this.type = type;
		this.basicDetails = basicDetails;
		this.personalIdentification = personalIdentification;
	}

	@JsonProperty("type")
	public String getType() {
		return type;
	}

	@JsonProperty("type")
	public void setType(String type) {
		this.type = type;
	}

	@JsonProperty("basicDetails")
	public BasicDetails getBasicDetails() {
		return basicDetails;
	}

	@JsonProperty("basicDetails")
	public void setBasicDetails(BasicDetails basicDetails) {
		this.basicDetails = basicDetails;
	}

	@JsonProperty("personalIdentification")
	public PersonalIdentification getPersonalIdentification() {
		return personalIdentification;
	}

	@JsonProperty("personalIdentification")
	public void setPersonalIdentification(PersonalIdentification personalIdentification) {
		this.personalIdentification = personalIdentification;
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