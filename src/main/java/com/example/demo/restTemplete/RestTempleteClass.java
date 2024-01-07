package com.example.demo.restTemplete;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class RestTempleteClass {

     RestTemplate restTemplate = new RestTemplate();
     String url = "https://api.example.com/data";
    HttpMethod method = HttpMethod.GET;
    HttpHeaders headers = new HttpHeaders();
    HttpEntity<String> requestEntity = new HttpEntity<>(headers);
    ResponseEntity<String> responseEntity = restTemplate.exchange(url, method, requestEntity, String.class);
    String result = responseEntity.getBody();


    //====================================================================


    RestTemplate restTemplate1 = new RestTemplate();
    String url1 = "https://api.example.com/data";
    HttpHeaders headers1 = new HttpHeaders();
   // headers1.set("Authorization", "Bearer your_token");
    HttpEntity<String> requestEntity1 = new HttpEntity<>(headers);
    ResponseEntity<String> responseEntity1 = restTemplate.exchange(url, HttpMethod.GET, requestEntity, String.class);
    String result1 = responseEntity.getBody();


}
