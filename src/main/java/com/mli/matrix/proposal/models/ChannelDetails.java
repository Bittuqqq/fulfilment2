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
@JsonPropertyOrder({ "branchCode" })
public class ChannelDetails {

	@JsonProperty("branchCode")
	private String branchCode;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public ChannelDetails() {
	}

	/**
	 * 
	 * @param branchCode
	 */
	public ChannelDetails(String branchCode) {
		super();
		this.branchCode = branchCode;
	}

	@JsonProperty("branchCode")
	public String getBranchCode() {
		return branchCode;
	}

	@JsonProperty("branchCode")
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
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