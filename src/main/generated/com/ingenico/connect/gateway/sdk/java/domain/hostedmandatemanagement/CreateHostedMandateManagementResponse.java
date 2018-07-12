/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.hostedmandatemanagement;

public class CreateHostedMandateManagementResponse {

	private String RETURNMAC = null;

	private String hostedMandateManagementId = null;

	private String partialRedirectUrl = null;

	/**
	 * When the consumer is returned to your site we will append this field and value to the query-string. You should store this data, so you can identify the returning consumer.
	 */
	public String getRETURNMAC() {
		return RETURNMAC;
	}

	/**
	 * When the consumer is returned to your site we will append this field and value to the query-string. You should store this data, so you can identify the returning consumer.
	 */
	public void setRETURNMAC(String value) {
		this.RETURNMAC = value;
	}

	/**
	 * This is the ID under which the data for this mandate management can be retrieved.
	 */
	public String getHostedMandateManagementId() {
		return hostedMandateManagementId;
	}

	/**
	 * This is the ID under which the data for this mandate management can be retrieved.
	 */
	public void setHostedMandateManagementId(String value) {
		this.hostedMandateManagementId = value;
	}

	/**
	 * The partial URL as generated by our system. You will need to add the protocol and the relevant subdomain to this URL, before redirecting your consumer to this URL. A special 'payment' subdomain will always work so you can always add 'https://payment.' at the beginning of this response value to view your hosted mandate management pages.
	 */
	public String getPartialRedirectUrl() {
		return partialRedirectUrl;
	}

	/**
	 * The partial URL as generated by our system. You will need to add the protocol and the relevant subdomain to this URL, before redirecting your consumer to this URL. A special 'payment' subdomain will always work so you can always add 'https://payment.' at the beginning of this response value to view your hosted mandate management pages.
	 */
	public void setPartialRedirectUrl(String value) {
		this.partialRedirectUrl = value;
	}
}
