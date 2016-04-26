/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodyinteger.implementation;

import fixtures.bodyinteger.AutoRestIntegerTestService;
import fixtures.bodyinteger.Ints;
import com.microsoft.rest.ServiceClient;
import com.microsoft.rest.RestClient;

/**
 * Initializes a new instance of the AutoRestIntegerTestService class.
 */
public final class AutoRestIntegerTestServiceImpl extends ServiceClient implements AutoRestIntegerTestService {

    /**
     * Gets the Ints object to access its operations.
     * @return the Ints object.
     */
    public Ints ints() {
        return new IntsImpl(restClient().retrofit(), this);
    }

    /**
     * Initializes an instance of AutoRestIntegerTestService client.
     */
    public AutoRestIntegerTestServiceImpl() {
        this("http://localhost");
    }

    /**
     * Initializes an instance of AutoRestIntegerTestService client.
     *
     * @param baseUrl the base URL of the host
     */
    public AutoRestIntegerTestServiceImpl(String baseUrl) {
        super(baseUrl);
    }

    /**
     * Initializes an instance of AutoRestIntegerTestService client.
     *
     * @param restClient the pre-configured {@link RestClient} object
     */
    public AutoRestIntegerTestServiceImpl(RestClient restClient) {
        super(restClient);
    }
}
