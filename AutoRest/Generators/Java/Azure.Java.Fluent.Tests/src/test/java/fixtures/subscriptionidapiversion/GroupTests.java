package fixtures.subscriptionidapiversion;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.UUID;

import fixtures.subscriptionidapiversion.implementation.MicrosoftAzureTestUrlImpl;
import fixtures.subscriptionidapiversion.implementation.SampleResourceGroupInner;

public class GroupTests {
    private static MicrosoftAzureTestUrlImpl client;

    @BeforeClass
    public static void setup() {
        client = new MicrosoftAzureTestUrlImpl("http://localhost.:3000", null);
    }

    @Test
    public void getSampleResourceGroup() throws Exception {
        client.withSubscriptionId(UUID.randomUUID().toString());
        SampleResourceGroupInner group = client.groups().getSampleResourceGroup("testgroup101").getBody();
        Assert.assertEquals("testgroup101", group.name());
        Assert.assertEquals("West US", group.location());
    }
}
