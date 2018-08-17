package com.mli.matrix.proposal.models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "proposalNumber", "version", "applicationDetails", "sourcingDetails", "channelDetails",
		"partyDetails", "productInfo", "medicalInfo", "paymentDetails", "bankDetails" })
@Document(collection = "proposal")
public class ProposalDetails {
	
	@Id
	@JsonProperty("id")
	private String id;
	@JsonProperty("transactionId")
	private long transactionId;
	@JsonProperty("proposalNumber")
	private String proposalNumber;
	@JsonProperty("version")
	private String version;
	@JsonProperty("applicationDetails")
	private ApplicationDetails applicationDetails;
	@JsonProperty("sourcingDetails")
	private SourcingDetails sourcingDetails;
	@JsonProperty("channelDetails")
	private ChannelDetails channelDetails;
	@JsonProperty("partyDetails")
	private List<PartyDetail> partyDetails = null;
	@JsonProperty("productInfo")
	private ProductInfo productInfo;
	@JsonProperty("medicalInfo")
	private MedicalInfo medicalInfo;
	@JsonProperty("paymentDetails")
	private PaymentDetails paymentDetails;
	@JsonProperty("bankDetails")
	private BankDetails bankDetails;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public ProposalDetails() {
	}

	/**
	 * 
	 * @param bankDetails
	 * @param channelDetails
	 * @param medicalInfo
	 * @param partyDetails
	 * @param proposalNumber
	 * @param sourcingDetails
	 * @param applicationDetails
	 * @param productInfo
	 * @param paymentDetails
	 * @param version
	 */
	public ProposalDetails(String proposalNumber, String version, ApplicationDetails applicationDetails,
			SourcingDetails sourcingDetails, ChannelDetails channelDetails, List<PartyDetail> partyDetails,
			ProductInfo productInfo, MedicalInfo medicalInfo, PaymentDetails paymentDetails, BankDetails bankDetails) {
		super();
		this.proposalNumber = proposalNumber;
		this.version = version;
		this.applicationDetails = applicationDetails;
		this.sourcingDetails = sourcingDetails;
		this.channelDetails = channelDetails;
		this.partyDetails = partyDetails;
		this.productInfo = productInfo;
		this.medicalInfo = medicalInfo;
		this.paymentDetails = paymentDetails;
		this.bankDetails = bankDetails;
	}
	
	@JsonProperty("id")
	public String getId() {
		return id;
	}
	
	@JsonProperty("id")
	public void setId(String id) {
		this.id = id;
	}
	
	@JsonProperty("transactionId")
	public long getTransactionId() {
		return transactionId;
	}

	@JsonProperty("transactionId")
	public void setTransactionId(long transactionId) {
		this.transactionId = transactionId;
	}
	
	@JsonProperty("proposalNumber")
	public String getProposalNumber() {
		return proposalNumber;
	}

	@JsonProperty("proposalNumber")
	public void setProposalNumber(String proposalNumber) {
		this.proposalNumber = proposalNumber;
	}

	@JsonProperty("version")
	public String getVersion() {
		return version;
	}

	@JsonProperty("version")
	public void setVersion(String version) {
		this.version = version;
	}

	@JsonProperty("applicationDetails")
	public ApplicationDetails getApplicationDetails() {
		return applicationDetails;
	}

	@JsonProperty("applicationDetails")
	public void setApplicationDetails(ApplicationDetails applicationDetails) {
		this.applicationDetails = applicationDetails;
	}

	@JsonProperty("sourcingDetails")
	public SourcingDetails getSourcingDetails() {
		return sourcingDetails;
	}

	@JsonProperty("sourcingDetails")
	public void setSourcingDetails(SourcingDetails sourcingDetails) {
		this.sourcingDetails = sourcingDetails;
	}

	@JsonProperty("channelDetails")
	public ChannelDetails getChannelDetails() {
		return channelDetails;
	}

	@JsonProperty("channelDetails")
	public void setChannelDetails(ChannelDetails channelDetails) {
		this.channelDetails = channelDetails;
	}

	@JsonProperty("partyDetails")
	public List<PartyDetail> getPartyDetails() {
		return partyDetails;
	}

	@JsonProperty("partyDetails")
	public void setPartyDetails(List<PartyDetail> partyDetails) {
		this.partyDetails = partyDetails;
	}

	@JsonProperty("productInfo")
	public ProductInfo getProductInfo() {
		return productInfo;
	}

	@JsonProperty("productInfo")
	public void setProductInfo(ProductInfo productInfo) {
		this.productInfo = productInfo;
	}

	@JsonProperty("medicalInfo")
	public MedicalInfo getMedicalInfo() {
		return medicalInfo;
	}

	@JsonProperty("medicalInfo")
	public void setMedicalInfo(MedicalInfo medicalInfo) {
		this.medicalInfo = medicalInfo;
	}

	@JsonProperty("paymentDetails")
	public PaymentDetails getPaymentDetails() {
		return paymentDetails;
	}

	@JsonProperty("paymentDetails")
	public void setPaymentDetails(PaymentDetails paymentDetails) {
		this.paymentDetails = paymentDetails;
	}

	@JsonProperty("bankDetails")
	public BankDetails getBankDetails() {
		return bankDetails;
	}

	@JsonProperty("bankDetails")
	public void setBankDetails(BankDetails bankDetails) {
		this.bankDetails = bankDetails;
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