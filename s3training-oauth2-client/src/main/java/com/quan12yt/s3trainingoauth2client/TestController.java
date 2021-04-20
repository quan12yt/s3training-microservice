package com.quan12yt.s3trainingoauth2client;

import org.springframework.beans.factory.annotation.Autowired;

//import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
//import org.springframework.security.oauth2.client.annotation.RegisteredOAuth2AuthorizedClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

//import static org.springframework.security.oauth2.client.web.reactive.function.client.ServerOAuth2AuthorizedClientExchangeFilterFunction.oauth2AuthorizedClient;

@RestController
public class TestController {

    @Autowired
    private WebClient webClient;
//
//    @GetMapping(value = "/articles")
//    public List<Users> getArticles(
//         //   @RegisteredOAuth2AuthorizedClient("articles-client-authorization-code") OAuth2AuthorizedClient authorizedClient
//    ) {
//        return this.webClient
//                .get()
//                .uri("http://gateway-service:9500/db-service/api/users")
//           //               .attributes(oauth2AuthorizedClient(authorizedClient))
//                .retrieve()
//                .bodyToMono(List.class)
//                .block();
//    }

    @GetMapping(value = "/resource")
    public String getResource(
    ) {
        return this.webClient
                .get()
                .uri("http://gateway-service/db-service/api/users")
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }
}
