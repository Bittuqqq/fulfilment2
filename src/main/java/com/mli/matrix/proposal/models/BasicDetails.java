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
@JsonPropertyOrder({ "name", "dob", "nationality", "qualification", "occupation", "annualIncome", "address" })
public class BasicDetails {

	@JsonProperty("name")
	private String name;
	@JsonProperty("dob")
	private String dob;
	@JsonProperty("nationality")
	private String nationality;
	@JsonProperty("qualification")
	private String qualification;
	@JsonProperty("occupation")
	private String occupation;
	@JsonProperty("annualIncome")
	private String annualIncome;
	@JsonProperty("address")
	private List<Address> address = null;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public BasicDetails() {
	}

	/**
	 * 
	 * @param annualIncome
	 * @param occupation
	 * @param qualification
	 * @param nationality
	 * @param address
	 * @param dob
	 * @param name
	 */
	public BasicDetails(String name, String dob, String nationality, String qualification, String occupation,
			String annualIncome, List<Address> address) {
		super();
		this.name = name;
		this.dob = dob;
		this.nationality = nationality;
		this.qualification = qualification;
		this.occupation = occupation;
		this.annualIncome = annualIncome;
		this.address = address;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("dob")
	public String getDob() {
		return dob;
	}

	@JsonProperty("dob")
	public void setDob(String dob) {
		this.dob = dob;
	}

	@JsonProperty("nationality")
	public String getNationality() {
		return nationality;
	}

	@JsonProperty("nationality")
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	@JsonProperty("qualification")
	public String getQualification() {
		return qualification;
	}

	@JsonProperty("qualification")
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	@JsonProperty("occupation")
	public String getOccupation() {
		return occupation;
	}

	@JsonProperty("occupation")
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	@JsonProperty("annualIncome")
	public String getAnnualIncome() {
		return annualIncome;
	}

	@JsonProperty("annualIncome")
	public void setAnnualIncome(String annualIncome) {
		this.annualIncome = annualIncome;
	}

	@JsonProperty("address")
	public List<Address> getAddress() {
		return address;
	}

	@JsonProperty("address")
	public void setAddress(List<Address> address) {
		this.address = address;
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