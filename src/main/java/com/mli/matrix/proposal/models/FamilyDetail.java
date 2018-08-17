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
@JsonPropertyOrder({ "type", "familyMember", "diagnosisAge", "condition" })
public class FamilyDetail {

	@JsonProperty("type")
	private String type;
	@JsonProperty("familyMember")
	private String familyMember;
	@JsonProperty("diagnosisAge")
	private String diagnosisAge;
	@JsonProperty("condition")
	private String condition;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public FamilyDetail() {
	}

	/**
	 * 
	 * @param condition
	 * @param familyMember
	 * @param diagnosisAge
	 * @param type
	 */
	public FamilyDetail(String type, String familyMember, String diagnosisAge, String condition) {
		super();
		this.type = type;
		this.familyMember = familyMember;
		this.diagnosisAge = diagnosisAge;
		this.condition = condition;
	}

	@JsonProperty("type")
	public String getType() {
		return type;
	}

	@JsonProperty("type")
	public void setType(String type) {
		this.type = type;
	}

	@JsonProperty("familyMember")
	public String getFamilyMember() {
		return familyMember;
	}

	@JsonProperty("familyMember")
	public void setFamilyMember(String familyMember) {
		this.familyMember = familyMember;
	}

	@JsonProperty("diagnosisAge")
	public String getDiagnosisAge() {
		return diagnosisAge;
	}

	@JsonProperty("diagnosisAge")
	public void setDiagnosisAge(String diagnosisAge) {
		this.diagnosisAge = diagnosisAge;
	}

	@JsonProperty("condition")
	public String getCondition() {
		return condition;
	}

	@JsonProperty("condition")
	public void setCondition(String condition) {
		this.condition = condition;
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