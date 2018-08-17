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
@JsonPropertyOrder({ "houseNo", "area", "landmark", "city", "state", "pinCode" })
public class AddressDetails {

	@JsonProperty("houseNo")
	private String houseNo;
	@JsonProperty("area")
	private String area;
	@JsonProperty("landmark")
	private String landmark;
	@JsonProperty("city")
	private String city;
	@JsonProperty("state")
	private String state;
	@JsonProperty("pinCode")
	private String pinCode;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public AddressDetails() {
	}

	/**
	 * 
	 * @param houseNo
	 * @param pinCode
	 * @param landmark
	 * @param area
	 * @param state
	 * @param city
	 */
	public AddressDetails(String houseNo, String area, String landmark, String city, String state, String pinCode) {
		super();
		this.houseNo = houseNo;
		this.area = area;
		this.landmark = landmark;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
	}

	@JsonProperty("houseNo")
	public String getHouseNo() {
		return houseNo;
	}

	@JsonProperty("houseNo")
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	@JsonProperty("area")
	public String getArea() {
		return area;
	}

	@JsonProperty("area")
	public void setArea(String area) {
		this.area = area;
	}

	@JsonProperty("landmark")
	public String getLandmark() {
		return landmark;
	}

	@JsonProperty("landmark")
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	@JsonProperty("city")
	public String getCity() {
		return city;
	}

	@JsonProperty("city")
	public void setCity(String city) {
		this.city = city;
	}

	@JsonProperty("state")
	public String getState() {
		return state;
	}

	@JsonProperty("state")
	public void setState(String state) {
		this.state = state;
	}

	@JsonProperty("pinCode")
	public String getPinCode() {
		return pinCode;
	}

	@JsonProperty("pinCode")
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
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