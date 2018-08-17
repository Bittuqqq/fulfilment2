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
@JsonPropertyOrder({ "productId", "termOfProduct", "sumAssured", "modalPremium" })
public class ProductInfo {

	@JsonProperty("productId")
	private String productId;
	@JsonProperty("termOfProduct")
	private String termOfProduct;
	@JsonProperty("sumAssured")
	private String sumAssured;
	@JsonProperty("modalPremium")
	private String modalPremium;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public ProductInfo() {
	}

	/**
	 * 
	 * @param termOfProduct
	 * @param modalPremium
	 * @param sumAssured
	 * @param productId
	 */
	public ProductInfo(String productId, String termOfProduct, String sumAssured, String modalPremium) {
		super();
		this.productId = productId;
		this.termOfProduct = termOfProduct;
		this.sumAssured = sumAssured;
		this.modalPremium = modalPremium;
	}

	@JsonProperty("productId")
	public String getProductId() {
		return productId;
	}

	@JsonProperty("productId")
	public void setProductId(String productId) {
		this.productId = productId;
	}

	@JsonProperty("termOfProduct")
	public String getTermOfProduct() {
		return termOfProduct;
	}

	@JsonProperty("termOfProduct")
	public void setTermOfProduct(String termOfProduct) {
		this.termOfProduct = termOfProduct;
	}

	@JsonProperty("sumAssured")
	public String getSumAssured() {
		return sumAssured;
	}

	@JsonProperty("sumAssured")
	public void setSumAssured(String sumAssured) {
		this.sumAssured = sumAssured;
	}

	@JsonProperty("modalPremium")
	public String getModalPremium() {
		return modalPremium;
	}

	@JsonProperty("modalPremium")
	public void setModalPremium(String modalPremium) {
		this.modalPremium = modalPremium;
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