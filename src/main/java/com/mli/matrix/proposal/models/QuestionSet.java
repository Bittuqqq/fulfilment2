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
@JsonPropertyOrder({ "question", "userSelectedValue" })
public class QuestionSet {

	@JsonProperty("question")
	private String question;
	@JsonProperty("userSelectedValue")
	private String userSelectedValue;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public QuestionSet() {
	}

	/**
	 * 
	 * @param question
	 * @param userSelectedValue
	 */
	public QuestionSet(String question, String userSelectedValue) {
		super();
		this.question = question;
		this.userSelectedValue = userSelectedValue;
	}

	@JsonProperty("question")
	public String getQuestion() {
		return question;
	}

	@JsonProperty("question")
	public void setQuestion(String question) {
		this.question = question;
	}

	@JsonProperty("userSelectedValue")
	public String getUserSelectedValue() {
		return userSelectedValue;
	}

	@JsonProperty("userSelectedValue")
	public void setUserSelectedValue(String userSelectedValue) {
		this.userSelectedValue = userSelectedValue;
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