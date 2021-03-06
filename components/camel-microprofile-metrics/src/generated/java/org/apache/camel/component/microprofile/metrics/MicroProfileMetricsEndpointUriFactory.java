/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.microprofile.metrics;

import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.camel.spi.EndpointUriFactory;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class MicroProfileMetricsEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":metricType:metricName";

    private static final Set<String> PROPERTY_NAMES;
    static {
        Set<String> set = new HashSet<>(16);
        set.add("metricType");
        set.add("metricName");
        set.add("action");
        set.add("counterIncrement");
        set.add("description");
        set.add("displayName");
        set.add("gaugeDecrement");
        set.add("gaugeIncrement");
        set.add("gaugeValue");
        set.add("lazyStartProducer");
        set.add("mark");
        set.add("metricUnit");
        set.add("tags");
        set.add("value");
        set.add("basicPropertyBinding");
        set.add("synchronous");
        PROPERTY_NAMES = set;
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "microprofile-metrics".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "metricType", null, true, copy);
        uri = buildPathParameter(syntax, uri, "metricName", null, true, copy);
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

