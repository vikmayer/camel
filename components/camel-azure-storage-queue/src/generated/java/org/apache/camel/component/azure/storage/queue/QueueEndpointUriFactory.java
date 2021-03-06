/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.azure.storage.queue;

import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.camel.spi.EndpointUriFactory;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class QueueEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":accountName/queueName";

    private static final Set<String> PROPERTY_NAMES;
    static {
        Set<String> set = new HashSet<>(20);
        set.add("accountName");
        set.add("queueName");
        set.add("autoDiscoverClient");
        set.add("serviceClient");
        set.add("bridgeErrorHandler");
        set.add("exceptionHandler");
        set.add("exchangePattern");
        set.add("createQueue");
        set.add("lazyStartProducer");
        set.add("operation");
        set.add("basicPropertyBinding");
        set.add("synchronous");
        set.add("maxMessages");
        set.add("messageId");
        set.add("popReceipt");
        set.add("timeout");
        set.add("timeToLive");
        set.add("visibilityTimeout");
        set.add("accessKey");
        set.add("credentials");
        PROPERTY_NAMES = set;
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "azure-storage-queue".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "accountName", null, false, copy);
        uri = buildPathParameter(syntax, uri, "queueName", null, false, copy);
        uri = buildQueryParameters(uri, copy);
        return uri;
    }

    @Override
    public Set<String> propertyNames() {
        return PROPERTY_NAMES;
    }

    @Override
    public boolean isLenientProperties() {
        return false;
    }
}

