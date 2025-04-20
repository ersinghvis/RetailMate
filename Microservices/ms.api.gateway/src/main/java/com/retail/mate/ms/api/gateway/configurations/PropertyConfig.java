package com.retail.mate.ms.api.gateway.configurations;

import com.retail.mate.ms.api.gateway.configurations.interfaces.IGateway;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@ConfigurationProperties(prefix="com.retailmate.ms.configurations")
@EnableConfigurationProperties
public class PropertyConfig {

    private IGateway gateway;

    public IGateway getGateway() {
        return gateway;
    }

    public void setGateway(IGateway gateway) {
        this.gateway = gateway;
    }
}
