/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodydate.implementation;

import fixtures.bodydate.AutoRestDateTestService;
import fixtures.bodydate.Dates;
import com.microsoft.rest.ServiceClient;
import com.microsoft.rest.RestClient;

/**
 * Initializes a new instance of the AutoRestDateTestService class.
 */
public final class AutoRestDateTestServiceImpl extends ServiceClient implements AutoRestDateTestService {

    /**
     * The Dates object to access its operations.
     */
    private Dates dates;

    /**
     * Gets the Dates object to access its operations.
     * @return the Dates object.
     */
    public Dates dates() {
        return this.dates;
    }

    /**
     * Initializes an instance of AutoRestDateTestService client.
     */
    public AutoRestDateTestServiceImpl() {
        this("https://localhost");
    }

    /**
     * Initializes an instance of AutoRestDateTestService client.
     *
     * @param baseUrl the base URL of the host
     */
    public AutoRestDateTestServiceImpl(String baseUrl) {
        super(baseUrl);
        initialize();
    }

    /**
     * Initializes an instance of AutoRestDateTestService client.
     *
     * @param restClient the pre-configured {@link RestClient} object
     */
    public AutoRestDateTestServiceImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    private void initialize() {
        this.dates = new DatesImpl(restClient().retrofit(), this);
    }
}