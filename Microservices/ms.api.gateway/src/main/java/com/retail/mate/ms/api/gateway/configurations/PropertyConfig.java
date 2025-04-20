package com.retail.mate.ms.api.gateway.configurations;

import com.retail.mate.ms.api.gateway.configurations.implementation.Gateway;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties(prefix="com.retailmate.ms.configurations")
@Configuration
public class PropertyConfig {

    private Gateway gateway;

    public Gateway getGateway() {
        return gateway;
    }

    public void setGateway(Gateway gateway) {
        this.gateway = gateway;
    }
}
