/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.dispute.definitions;

public class DisputeReference {

	private String merchantOrderId = null;

	private String merchantReference = null;

	private String paymentReference = null;

	private String providerId = null;

	private String providerReference = null;

	/**
	 * The merchant’s order ID of the transaction to which this dispute is linked.
	 */
	public String getMerchantOrderId() {
		return merchantOrderId;
	}

	/**
	 * The merchant’s order ID of the transaction to which this dispute is linked.
	 */
	public void setMerchantOrderId(String value) {
		this.merchantOrderId = value;
	}

	/**
	 * Your (unique) reference for the transaction that you can use to reconcile our report files.
	 */
	public String getMerchantReference() {
		return merchantReference;
	}

	/**
	 * Your (unique) reference for the transaction that you can use to reconcile our report files.
	 */
	public void setMerchantReference(String value) {
		this.merchantReference = value;
	}

	/**
	 * Payment Reference generated by WebCollect.
	 */
	public String getPaymentReference() {
		return paymentReference;
	}

	/**
	 * Payment Reference generated by WebCollect.
	 */
	public void setPaymentReference(String value) {
		this.paymentReference = value;
	}

	/**
	 * The numerical identifier of the Service Provider (Acquirer).
	 */
	public String getProviderId() {
		return providerId;
	}

	/**
	 * The numerical identifier of the Service Provider (Acquirer).
	 */
	public void setProviderId(String value) {
		this.providerId = value;
	}

	/**
	 * The Service Provider’s reference.
	 */
	public String getProviderReference() {
		return providerReference;
	}

	/**
	 * The Service Provider’s reference.
	 */
	public void setProviderReference(String value) {
		this.providerReference = value;
	}
}