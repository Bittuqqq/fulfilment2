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
@JsonPropertyOrder({ "height", "familyDetails", "questionSet" })
public class MedicalInfo {

	@JsonProperty("height")
	private String height;
	@JsonProperty("familyDetails")
	private List<FamilyDetail> familyDetails = null;
	@JsonProperty("questionSet")
	private List<QuestionSet> questionSet = null;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public MedicalInfo() {
	}

	/**
	 * 
	 * @param familyDetails
	 * @param height
	 * @param questionSet
	 */
	public MedicalInfo(String height, List<FamilyDetail> familyDetails, List<QuestionSet> questionSet) {
		super();
		this.height = height;
		this.familyDetails = familyDetails;
		this.questionSet = questionSet;
	}

	@JsonProperty("height")
	public String getHeight() {
		return height;
	}

	@JsonProperty("height")
	public void setHeight(String height) {
		this.height = height;
	}

	@JsonProperty("familyDetails")
	public List<FamilyDetail> getFamilyDetails() {
		return familyDetails;
	}

	@JsonProperty("familyDetails")
	public void setFamilyDetails(List<FamilyDetail> familyDetails) {
		this.familyDetails = familyDetails;
	}

	@JsonProperty("questionSet")
	public List<QuestionSet> getQuestionSet() {
		return questionSet;
	}

	@JsonProperty("questionSet")
	public void setQuestionSet(List<QuestionSet> questionSet) {
		this.questionSet = questionSet;
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