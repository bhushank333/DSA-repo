package com.example.demo.webclient.webclient_interceptor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.ClientRequest;
import org.springframework.web.reactive.function.client.ExchangeFilterFunction;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Configuration
public class WebClientConfig {

    @Bean
    public WebClient webClient() {
        return WebClient.builder()
                .baseUrl("http://localhost:8080")  // Your API base URL
                .filter(addHeaderInterceptor())    // Add custom interceptor
                .build();
    }

    // Interceptor to add applicationId header to every request
    private ExchangeFilterFunction addHeaderInterceptor() {
        return ExchangeFilterFunction.ofRequestProcessor(clientRequest -> {
            System.out.println("Intercepting Request: " + clientRequest.url());
            return Mono.just(
                    ClientRequest.from(clientRequest)
                            .header("applicationId", "Test")  // Add header here
                            .build());
        });
    }
}

//@Bean
//public WebClient webClientWithInterceptor() {
//    return WebClient.builder()
//            .baseUrl("https://api.example.com")
//            .filter((request, next) -> {
//                // Interceptor logic: Add header to every request
//                return next.exchange(
//                        ClientRequest.from(request)
//                                .header("applicationId", "Test")
//                                .build()
//                );
//            })
//            .build();
//}