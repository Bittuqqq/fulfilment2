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
@JsonPropertyOrder({ "number", "type", "stdCode" })
public class Phone {

	@JsonProperty("number")
	private String number;
	@JsonProperty("type")
	private String type;
	@JsonProperty("stdCode")
	private String stdCode;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Phone() {
	}

	/**
	 * 
	 * @param stdCode
	 * @param number
	 * @param type
	 */
	public Phone(String number, String type, String stdCode) {
		super();
		this.number = number;
		this.type = type;
		this.stdCode = stdCode;
	}

	@JsonProperty("number")
	public String getNumber() {
		return number;
	}

	@JsonProperty("number")
	public void setNumber(String number) {
		this.number = number;
	}

	@JsonProperty("type")
	public String getType() {
		return type;
	}

	@JsonProperty("type")
	public void setType(String type) {
		this.type = type;
	}

	@JsonProperty("stdCode")
	public String getStdCode() {
		return stdCode;
	}

	@JsonProperty("stdCode")
	public void setStdCode(String stdCode) {
		this.stdCode = stdCode;
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