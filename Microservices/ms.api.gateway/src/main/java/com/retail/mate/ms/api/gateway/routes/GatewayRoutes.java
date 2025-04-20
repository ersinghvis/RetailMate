package com.retail.mate.ms.api.gateway.routes;

import com.retail.mate.ms.api.gateway.configurations.PropertyConfig;
import com.retail.mate.ms.api.gateway.constants.BusinessConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayRoutes {

    @Autowired
    private PropertyConfig propertyConfig;

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()

                .route(BusinessConstants.PRODUCT_SERVICE, r -> r.path("/api/products/**")
                        .uri(getServiceUri(BusinessConstants.PRODUCT_SERVICE)))

                .route(BusinessConstants.ORDER_SERVICE, r -> r.path("/api/orders/**")
                        .uri(getServiceUri(BusinessConstants.ORDER_SERVICE)))

                .route(BusinessConstants.BILLING_SERVICE, r -> r.path("/api/billing/**")
                        .uri(getServiceUri(BusinessConstants.BILLING_SERVICE)))

                .route(BusinessConstants.INVENTORY_SERVICE, r -> r.path("/api/inventory/**")
                        .uri(getServiceUri(BusinessConstants.INVENTORY_SERVICE)))

                .build();
    }

    private String getServiceUri(String serviceName){
        return propertyConfig.getGateway().getService().getNames().get(serviceName);
    }

}