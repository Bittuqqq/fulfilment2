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
@JsonPropertyOrder({ "accountNumber", "mICR", "iFSC", "bankName" })
public class BankDetails {

	@JsonProperty("accountNumber")
	private String accountNumber;
	@JsonProperty("mICR")
	private String mICR;
	@JsonProperty("iFSC")
	private String iFSC;
	@JsonProperty("bankName")
	private String bankName;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public BankDetails() {
	}

	/**
	 * 
	 * @param accountNumber
	 * @param mICR
	 * @param bankName
	 * @param iFSC
	 */
	public BankDetails(String accountNumber, String mICR, String iFSC, String bankName) {
		super();
		this.accountNumber = accountNumber;
		this.mICR = mICR;
		this.iFSC = iFSC;
		this.bankName = bankName;
	}

	@JsonProperty("accountNumber")
	public String getAccountNumber() {
		return accountNumber;
	}

	@JsonProperty("accountNumber")
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	@JsonProperty("mICR")
	public String getMICR() {
		return mICR;
	}

	@JsonProperty("mICR")
	public void setMICR(String mICR) {
		this.mICR = mICR;
	}

	@JsonProperty("iFSC")
	public String getIFSC() {
		return iFSC;
	}

	@JsonProperty("iFSC")
	public void setIFSC(String iFSC) {
		this.iFSC = iFSC;
	}

	@JsonProperty("bankName")
	public String getBankName() {
		return bankName;
	}

	@JsonProperty("bankName")
	public void setBankName(String bankName) {
		this.bankName = bankName;
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