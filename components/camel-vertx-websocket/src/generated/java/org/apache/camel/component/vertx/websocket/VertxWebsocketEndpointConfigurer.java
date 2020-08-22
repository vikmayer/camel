/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.vertx.websocket;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class VertxWebsocketEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        VertxWebsocketEndpoint target = (VertxWebsocketEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowedoriginpattern":
        case "allowedOriginPattern": target.getConfiguration().setAllowedOriginPattern(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "clientoptions":
        case "clientOptions": target.getConfiguration().setClientOptions(property(camelContext, io.vertx.core.http.HttpClientOptions.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "router": target.getConfiguration().setRouter(property(camelContext, io.vertx.ext.web.Router.class, value)); return true;
        case "sendtoall":
        case "sendToAll": target.getConfiguration().setSendToAll(property(camelContext, boolean.class, value)); return true;
        case "serveroptions":
        case "serverOptions": target.getConfiguration().setServerOptions(property(camelContext, io.vertx.core.http.HttpServerOptions.class, value)); return true;
        case "sslcontextparameters":
        case "sslContextParameters": target.getConfiguration().setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("allowedOriginPattern", java.lang.String.class);
        answer.put("basicPropertyBinding", boolean.class);
        answer.put("bridgeErrorHandler", boolean.class);
        answer.put("clientOptions", io.vertx.core.http.HttpClientOptions.class);
        answer.put("exceptionHandler", org.apache.camel.spi.ExceptionHandler.class);
        answer.put("exchangePattern", org.apache.camel.ExchangePattern.class);
        answer.put("lazyStartProducer", boolean.class);
        answer.put("router", io.vertx.ext.web.Router.class);
        answer.put("sendToAll", boolean.class);
        answer.put("serverOptions", io.vertx.core.http.HttpServerOptions.class);
        answer.put("sslContextParameters", org.apache.camel.support.jsse.SSLContextParameters.class);
        answer.put("synchronous", boolean.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        VertxWebsocketEndpoint target = (VertxWebsocketEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowedoriginpattern":
        case "allowedOriginPattern": return target.getConfiguration().getAllowedOriginPattern();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "clientoptions":
        case "clientOptions": return target.getConfiguration().getClientOptions();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "router": return target.getConfiguration().getRouter();
        case "sendtoall":
        case "sendToAll": return target.getConfiguration().isSendToAll();
        case "serveroptions":
        case "serverOptions": return target.getConfiguration().getServerOptions();
        case "sslcontextparameters":
        case "sslContextParameters": return target.getConfiguration().getSslContextParameters();
        case "synchronous": return target.isSynchronous();
        default: return null;
        }
    }
}
