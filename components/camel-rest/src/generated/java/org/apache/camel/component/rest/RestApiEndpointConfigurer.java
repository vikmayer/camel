/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.rest;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class RestApiEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object target, String name, Object value, boolean ignoreCase) {
        if (ignoreCase) {
            return doConfigureIgnoreCase(camelContext, target, name, value);
        } else {
            return doConfigure(camelContext, target, name, value);
        }
    }

    private static boolean doConfigure(CamelContext camelContext, Object target, String name, Object value) {
        switch (name) {
        case "apiComponentName": ((RestApiEndpoint) target).setApiComponentName(property(camelContext, java.lang.String.class, value)); return true;
        case "bridgeErrorHandler": ((RestApiEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "consumerComponentName": ((RestApiEndpoint) target).setConsumerComponentName(property(camelContext, java.lang.String.class, value)); return true;
        case "exceptionHandler": ((RestApiEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangePattern": ((RestApiEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "basicPropertyBinding": ((RestApiEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((RestApiEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "apicomponentname": ((RestApiEndpoint) target).setApiComponentName(property(camelContext, java.lang.String.class, value)); return true;
        case "bridgeerrorhandler": ((RestApiEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "consumercomponentname": ((RestApiEndpoint) target).setConsumerComponentName(property(camelContext, java.lang.String.class, value)); return true;
        case "exceptionhandler": ((RestApiEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern": ((RestApiEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "basicpropertybinding": ((RestApiEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((RestApiEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

}
