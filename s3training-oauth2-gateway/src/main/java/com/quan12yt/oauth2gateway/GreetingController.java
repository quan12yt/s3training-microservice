package com.quan12yt.oauth2gateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.RequestEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.annotation.RegisteredOAuth2AuthorizedClient;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
public class GreetingController {

//    @Autowired
//    RestTemplate restTemplate;

    @RequestMapping("/greeting")
    public String greeting(@AuthenticationPrincipal OidcUser oidcUser, Model model,
                           @RegisteredOAuth2AuthorizedClient("gateway-client") OAuth2AuthorizedClient client) {
        return "username : " + oidcUser.getAuthenticatedAt() + "---idToken : " + oidcUser.getIdToken().getSubject() + "---accessToken" + oidcUser.getAuthorities().stream().findFirst();
    }

}