package com.retail.mate.ms.api.gateway.configurations;

import java.util.Map;

public class ServicesConfig {

    private Map<String,MSConfig> services;

    public Map<String, MSConfig> getServices() {
        return services;
    }

    public void setServices(Map<String, MSConfig> services) {
        this.services = services;
    }

    public MSConfig getServiceConfig(String service){
        return services.get(service);
    }

}
