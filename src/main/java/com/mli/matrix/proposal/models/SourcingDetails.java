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
@JsonPropertyOrder({ "agentId", "agentName", "agentLoc" })
public class SourcingDetails {

	@JsonProperty("agentId")
	private String agentId;
	@JsonProperty("agentName")
	private String agentName;
	@JsonProperty("agentLoc")
	private String agentLoc;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public SourcingDetails() {
	}

	/**
	 * 
	 * @param agentName
	 * @param agentId
	 * @param agentLoc
	 */
	public SourcingDetails(String agentId, String agentName, String agentLoc) {
		super();
		this.agentId = agentId;
		this.agentName = agentName;
		this.agentLoc = agentLoc;
	}

	@JsonProperty("agentId")
	public String getAgentId() {
		return agentId;
	}

	@JsonProperty("agentId")
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	@JsonProperty("agentName")
	public String getAgentName() {
		return agentName;
	}

	@JsonProperty("agentName")
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	@JsonProperty("agentLoc")
	public String getAgentLoc() {
		return agentLoc;
	}

	@JsonProperty("agentLoc")
	public void setAgentLoc(String agentLoc) {
		this.agentLoc = agentLoc;
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