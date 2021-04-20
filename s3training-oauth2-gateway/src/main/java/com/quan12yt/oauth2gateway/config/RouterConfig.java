//package com.quan12yt.oauth2gateway.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cloud.gateway.filter.factory.TokenRelayGatewayFilterFactory;
//import org.springframework.cloud.gateway.route.RouteLocator;
//import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class RouterConfig {
//
//    @Autowired
//    private TokenRelayGatewayFilterFactory filterFactory;
//
//    @Bean
//    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route("db-service", r -> r.path("/resource")
//                        .filters(f -> f.filters(filterFactory.apply())
//                                .removeRequestHeader("Cookie"))
//                        .uri("http://resource:9000"))
//                .build();
//    }
//}
