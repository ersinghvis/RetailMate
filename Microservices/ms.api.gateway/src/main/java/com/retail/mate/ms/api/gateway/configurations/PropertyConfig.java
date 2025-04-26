package com.retail.mate.ms.api.gateway.configurations;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties(prefix="com.retailmate.ms.configurations")
@Configuration
public class PropertyConfig {

    private GatewayConfig gateway;

    public GatewayConfig getGateway() {
        return gateway;
    }

    public void setGateway(GatewayConfig gateway) {
        this.gateway = gateway;
    }
}
