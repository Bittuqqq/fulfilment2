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
@JsonPropertyOrder({ "paymentMode", "receiptId", "amount", "paymentDate" })
public class Receipt {

	@JsonProperty("paymentMode")
	private String paymentMode;
	@JsonProperty("receiptId")
	private String receiptId;
	@JsonProperty("amount")
	private String amount;
	@JsonProperty("paymentDate")
	private String paymentDate;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Receipt() {
	}

	/**
	 * 
	 * @param amount
	 * @param paymentDate
	 * @param paymentMode
	 * @param receiptId
	 */
	public Receipt(String paymentMode, String receiptId, String amount, String paymentDate) {
		super();
		this.paymentMode = paymentMode;
		this.receiptId = receiptId;
		this.amount = amount;
		this.paymentDate = paymentDate;
	}

	@JsonProperty("paymentMode")
	public String getPaymentMode() {
		return paymentMode;
	}

	@JsonProperty("paymentMode")
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	@JsonProperty("receiptId")
	public String getReceiptId() {
		return receiptId;
	}

	@JsonProperty("receiptId")
	public void setReceiptId(String receiptId) {
		this.receiptId = receiptId;
	}

	@JsonProperty("amount")
	public String getAmount() {
		return amount;
	}

	@JsonProperty("amount")
	public void setAmount(String amount) {
		this.amount = amount;
	}

	@JsonProperty("paymentDate")
	public String getPaymentDate() {
		return paymentDate;
	}

	@JsonProperty("paymentDate")
	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
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