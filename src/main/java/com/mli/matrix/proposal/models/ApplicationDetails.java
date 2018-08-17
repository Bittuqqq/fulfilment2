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
@JsonPropertyOrder({ "createdTime", "submittedTime", "updatedTime", "applicationStatus", "stage", "proposalNumber",
		"policyNumber" })
public class ApplicationDetails {

	@JsonProperty("createdTime")
	private String createdTime;
	@JsonProperty("submittedTime")
	private String submittedTime;
	@JsonProperty("updatedTime")
	private String updatedTime;
	@JsonProperty("applicationStatus")
	private String applicationStatus;
	@JsonProperty("stage")
	private String stage;
	@JsonProperty("proposalNumber")
	private String proposalNumber;
	@JsonProperty("policyNumber")
	private String policyNumber;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public ApplicationDetails() {
	}

	/**
	 * 
	 * @param proposalNumber
	 * @param createdTime
	 * @param submittedTime
	 * @param applicationStatus
	 * @param policyNumber
	 * @param stage
	 * @param updatedTime
	 */
	public ApplicationDetails(String createdTime, String submittedTime, String updatedTime, String applicationStatus,
			String stage, String proposalNumber, String policyNumber) {
		super();
		this.createdTime = createdTime;
		this.submittedTime = submittedTime;
		this.updatedTime = updatedTime;
		this.applicationStatus = applicationStatus;
		this.stage = stage;
		this.proposalNumber = proposalNumber;
		this.policyNumber = policyNumber;
	}

	@JsonProperty("createdTime")
	public String getCreatedTime() {
		return createdTime;
	}

	@JsonProperty("createdTime")
	public void setCreatedTime(String createdTime) {
		this.createdTime = createdTime;
	}

	@JsonProperty("submittedTime")
	public String getSubmittedTime() {
		return submittedTime;
	}

	@JsonProperty("submittedTime")
	public void setSubmittedTime(String submittedTime) {
		this.submittedTime = submittedTime;
	}

	@JsonProperty("updatedTime")
	public String getUpdatedTime() {
		return updatedTime;
	}

	@JsonProperty("updatedTime")
	public void setUpdatedTime(String updatedTime) {
		this.updatedTime = updatedTime;
	}

	@JsonProperty("applicationStatus")
	public String getApplicationStatus() {
		return applicationStatus;
	}

	@JsonProperty("applicationStatus")
	public void setApplicationStatus(String applicationStatus) {
		this.applicationStatus = applicationStatus;
	}

	@JsonProperty("stage")
	public String getStage() {
		return stage;
	}

	@JsonProperty("stage")
	public void setStage(String stage) {
		this.stage = stage;
	}

	@JsonProperty("proposalNumber")
	public String getProposalNumber() {
		return proposalNumber;
	}

	@JsonProperty("proposalNumber")
	public void setProposalNumber(String proposalNumber) {
		this.proposalNumber = proposalNumber;
	}

	@JsonProperty("policyNumber")
	public String getPolicyNumber() {
		return policyNumber;
	}

	@JsonProperty("policyNumber")
	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
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