/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.merchant.products;

import com.ingenico.connect.gateway.sdk.java.Client;
import com.ingenico.connect.gateway.sdk.java.CommunicatorConfiguration;
import com.ingenico.connect.gateway.sdk.java.Factory;
import com.ingenico.connect.gateway.sdk.java.domain.product.PaymentProducts;
import com.ingenico.connect.gateway.sdk.java.merchant.products.FindProductsParams;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

public class GetPaymentProductsExample {

	@SuppressWarnings("unused")
	public void example() throws URISyntaxException, IOException {
		Client client = getClient();
		try {
			FindProductsParams query = new FindProductsParams();
			query.setAmount(1000L);
			query.setIsRecurring(true);
			query.setCountryCode("US");
			query.setLocale("en_US");
			query.setCurrencyCode("USD");
			query.addHide("fields");

			PaymentProducts response = client.merchant("merchantId").products().find(query);
		} finally {
			client.close();
		}
	}

	private Client getClient() throws URISyntaxException {
		String apiKeyId = System.getProperty("connect.api.apiKeyId", "someKey");
		String secretApiKey = System.getProperty("connect.api.secretApiKey", "someSecret");

		URL propertiesUrl = getClass().getResource("/example-configuration.properties");
		CommunicatorConfiguration configuration = Factory.createConfiguration(propertiesUrl.toURI(), apiKeyId, secretApiKey);
		return Factory.createClient(configuration);
	}
}