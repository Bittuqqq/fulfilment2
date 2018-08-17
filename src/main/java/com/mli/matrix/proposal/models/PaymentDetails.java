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
@JsonPropertyOrder({ "receipt" })
public class PaymentDetails {

	@JsonProperty("receipt")
	private List<Receipt> receipt = null;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public PaymentDetails() {
	}

	/**
	 * 
	 * @param receipt
	 */
	public PaymentDetails(List<Receipt> receipt) {
		super();
		this.receipt = receipt;
	}

	@JsonProperty("receipt")
	public List<Receipt> getReceipt() {
		return receipt;
	}

	@JsonProperty("receipt")
	public void setReceipt(List<Receipt> receipt) {
		this.receipt = receipt;
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