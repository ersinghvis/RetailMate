package com.retail.mate.ms.api.gateway.configurations.implementation;

import com.retail.mate.ms.api.gateway.configurations.interfaces.IGateway;
import com.retail.mate.ms.api.gateway.configurations.interfaces.IService;

public class Gateway implements IGateway {

    private IService service;

    public void setService(IService service) {
        this.service = service;
    }

    public IService getService() {
        return service;
    }
}
