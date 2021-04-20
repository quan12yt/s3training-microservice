package com.quan12yt.loadbalancer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;

import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("load-service")
public class LoadController {

    @Autowired
    RestTemplate restTemplate;
    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private LoadBalancerClient loadBalancer;

    @GetMapping("/get")
    public String getServices() throws URISyntaxException {
//        HttpHeaders headers = new HttpHeaders();
//        headers.setBearerAuth(accessToken);
      //  List<Users> lst = restTemplate.exchange(RequestEntity.get(new URI("http://gateway-service:9500/db-service/api/users")).headers(headers).build(), List.class).getBody();
        String lst = restTemplate.getForObject("http://gateway-service/db-service/api/users", String.class);
        return lst;
    }


}


