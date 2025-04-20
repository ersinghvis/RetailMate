package com.retail.mate.ms.api.gateway.configurations.implementation;

import com.retail.mate.ms.api.gateway.configurations.interfaces.IService;

import java.util.Map;

public class Service implements IService {

    private Map<String, String> names;

    public Map<String, String> getNames() {
        return this.names;
    }

    public void setNames(Map<String, String> names) {
        this.names = names;
    }
}
