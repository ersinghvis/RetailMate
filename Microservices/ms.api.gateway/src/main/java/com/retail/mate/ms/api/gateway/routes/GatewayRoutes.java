package com.retail.mate.ms.api.gateway.routes;

import com.retail.mate.ms.api.gateway.configurations.PropertyConfig;
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

                .route("product-service", r -> r.path("/api/products/**")
                        .uri("lb://product-service"))

                .route("order-service", r -> r.path("/api/orders/**")
                        .uri("lb://order-service"))

                .build();
    }

    private String getServiceName(String service){
        return "";
    }

    private String getServiceUri(String service){
        return "";
    }

}
