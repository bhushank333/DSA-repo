package com.example.demo.restTemplete;

import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;
import java.util.*;

public class RestTempleteClass {


    private static final RestTemplate restTemplate = new RestTemplate();

    public static void main(String[] args) {
        String url = "https://api.example.com/data";

        // 1. GET request using getForObject
        String getResult = restTemplate.getForObject(url, String.class);
        System.out.println("GET result (getForObject): " + getResult);

        // 2. GET request using getForEntity
        ResponseEntity<String> getEntityResult = restTemplate.getForEntity(url, String.class);
        System.out.println("GET result (getForEntity): " + getEntityResult.getBody());

        // 3. POST request using postForObject
        String postUrl = "https://api.example.com/create";
        Map<String, String> requestBody = new HashMap<>();
        requestBody.put("name", "John");
        requestBody.put("role", "Developer");

        String postResult = restTemplate.postForObject(postUrl, requestBody, String.class);
        System.out.println("POST result (postForObject): " + postResult);

        // 4. POST request using postForEntity
        ResponseEntity<String> postEntityResult = restTemplate.postForEntity(postUrl, requestBody, String.class);
        System.out.println("POST result (postForEntity): " + postEntityResult.getBody());

        // 5. PUT request using put
        String putUrl = "https://api.example.com/update/1";
        Map<String, String> putBody = new HashMap<>();
        putBody.put("role", "Senior Developer");

        restTemplate.put(putUrl, putBody);  // No return, just action
        System.out.println("PUT request sent.");

        // 6. DELETE request using delete
        String deleteUrl = "https://api.example.com/delete/1";
        restTemplate.delete(deleteUrl);
        System.out.println("DELETE request sent.");

        // 7. exchange() for full control (GET with headers)
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer your_token");
        HttpEntity<String> entity = new HttpEntity<>(headers);

        ResponseEntity<String> exchangeResult = restTemplate.exchange(
                url, HttpMethod.GET, entity, String.class);
        System.out.println("GET with headers (exchange): " + exchangeResult.getBody());

        // 8. exchange() for POST with headers
        HttpHeaders postHeaders = new HttpHeaders();
        postHeaders.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Map<String, String>> postEntity = new HttpEntity<>(requestBody, postHeaders);

        ResponseEntity<String> exchangePostResult = restTemplate.exchange(
                postUrl, HttpMethod.POST, postEntity, String.class);
        System.out.println("POST with headers (exchange): " + exchangePostResult.getBody());
    }

//            | Method                                     | Description                                          |
//            | ------------------------------------------ | ---------------------------------------------------- |
//            | `getForObject(url, Class)`                 | Simple GET, returns response body                    |
//            | `getForEntity(url, Class)`                 | GET, returns full `ResponseEntity` (headers, status) |
//            | `postForObject(url, body, Class)`          | POST, returns response body                          |
//            | `postForEntity(url, body, Class)`          | POST, returns full `ResponseEntity`                  |
//            | `put(url, body)`                           | PUT request, no response                             |
//            | `delete(url)`                              | DELETE request, no response                          |
//            | `exchange(url, method, HttpEntity, Class)` | Flexible for any HTTP method with headers            |
//

//     RestTemplate restTemplate = new RestTemplate();
//     String url = "https://api.example.com/data";
//    HttpMethod method = HttpMethod.GET;
//    HttpHeaders headers = new HttpHeaders();
//    HttpEntity<String> requestEntity = new HttpEntity<>(headers);
//    ResponseEntity<String> responseEntity = restTemplate.exchange(url, method, requestEntity, String.class);
//    String result = responseEntity.getBody();
//
//
//    //====================================================================
//
//
//    RestTemplate restTemplate1 = new RestTemplate();
//    String url1 = "https://api.example.com/data";
//    HttpHeaders headers1 = new HttpHeaders();
//   // headers1.set("Authorization", "Bearer your_token");
//    HttpEntity<String> requestEntity1 = new HttpEntity<>(headers);
//    ResponseEntity<String> responseEntity1 = restTemplate.exchange(url, HttpMethod.GET, requestEntity, String.class);
//    String result1 = responseEntity.getBody();


}
