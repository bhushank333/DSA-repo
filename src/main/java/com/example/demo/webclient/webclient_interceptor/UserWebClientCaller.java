package com.example.demo.webclient.webclient_interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class UserWebClientCaller {

    @Autowired
    private WebClient webClient;

    public void addUserViaWebClient() {
        User user = new User("John", 30);

        String response = webClient.post()
                .uri("/users")
                .bodyValue(user)
                .retrieve()
                .bodyToMono(String.class)
                .block();

        System.out.println("Response from API: " + response);
    }
}
