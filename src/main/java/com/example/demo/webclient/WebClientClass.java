package com.example.demo.webclient;

import org.springframework.web.reactive.function.client.WebClient;

public class WebClientClass {

   //1. Get
    WebClient webClient = WebClient.create("https://api.example.com");

    String result = webClient
            .get()
            .uri("/data")
            .retrieve()
            .bodyToMono(String.class)
            .block(); // blocking for simplicity, in a reactive application, you would subscribe

    //System.out.println(result);

    //2. Post

    String result1 = webClient
            .post()
            .uri("/create")
            .bodyValue("{\"name\":\"John\",\"age\":30}")
            .retrieve()
            .bodyToMono(String.class)
            .block(); // blocking for simplicity, in a reactive application, you would subscribe

     //System.out.println(result);

    //3 . Put method

//    webClient
//            .put()
//            .uri("/update/123")
//    .bodyValue("{\"name\":\"UpdatedName\",\"age\":35}")
//    .retrieve()
//    .toBodilessEntity()
//    .block();

    //4 Delete

//
//webClient
//        .delete()
//        .uri("/delete/123")
//    .retrieve()
//    .toBodilessEntity()
//    .block(); // blocking for simplicity, in a reactive application, you would subscribe





}
