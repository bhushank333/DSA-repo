package com.example.demo.webclient;

import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

public class WebClientTest {

    WebClient webClient = WebClient.builder()
            .baseUrl("https://api.example.com")
            .defaultHeader("Accept", "application/json")
            .build();

    public void performAllRequestsAsync() {

        // 1. GET request (Async)
        webClient.get()
                .uri("/data")
                .retrieve()
                .bodyToMono(String.class)
                .subscribe(result -> System.out.println("GET Result: " + result),
                        error -> System.err.println("GET Error: " + error));

        // 2. POST request with JSON body (Async)
        webClient.post()
                .uri("/create")
                .contentType(MediaType.APPLICATION_JSON)
                .bodyValue("{\"name\":\"John\",\"age\":30}")
                .retrieve()
                .bodyToMono(String.class)
                .subscribe(result -> System.out.println("POST Result: " + result),
                        error -> System.err.println("POST Error: " + error));

        // 3. PUT request (Async)
        webClient.put()
                .uri("/update/123")
                .contentType(MediaType.APPLICATION_JSON)
                .bodyValue("{\"name\":\"UpdatedName\",\"age\":35}")
                .retrieve()
                .toBodilessEntity()
                .subscribe(response -> System.out.println("PUT request completed."),
                        error -> System.err.println("PUT Error: " + error));

        // 4. DELETE request (Async)
        webClient.delete()
                .uri("/delete/123")
                .retrieve()
                .toBodilessEntity()
                .subscribe(response -> System.out.println("DELETE request completed."),
                        error -> System.err.println("DELETE Error: " + error));

        // 5. GET with custom headers (Async)
        webClient.get()
                .uri("/data")
                .header("Authorization", "Bearer your_token")
                .retrieve()
                .bodyToMono(String.class)
                .subscribe(result -> System.out.println("GET with Header Result: " + result),
                        error -> System.err.println("GET Header Error: " + error));
    }

    public static void main(String[] args) {
        WebClientTest client = new WebClientTest();
        client.performAllRequestsAsync();

        // Prevent main thread from exiting immediately (only for testing purpose)
        try {
            Thread.sleep(5000); // Adjust as needed for all async calls to complete
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}




//        | Method              | Description                                       | Example                          |
//        | ------------------- | ------------------------------------------------- | -------------------------------- |
//        | `.get()`            | HTTP GET request                                  | `.get().uri("/data")...`         |
//        | `.post()`           | HTTP POST request                                 | `.post().uri("/create")...`      |
//        | `.put()`            | HTTP PUT request                                  | `.put().uri("/update/1")...`     |
//        | `.delete()`         | HTTP DELETE request                               | `.delete().uri("/delete/1")...`  |
//        | `.patch()`          | HTTP PATCH request (partial update)               | `.patch().uri("/patch/1")...`    |
//        | `.head()`           | HTTP HEAD request                                 | `.method(HttpMethod.HEAD)...`    |
//        | `.options()`        | HTTP OPTIONS request                              | `.method(HttpMethod.OPTIONS)...` |
//        | `.retrieve()`       | Trigger request, returns response handler         | `.retrieve().bodyToMono(...)`    |
//        | `.exchangeToMono()` | Full access to response including status code     | `.exchangeToMono(resp -> ...)`   |
//        | `.bodyToMono()`     | Convert response body to single object (Mono<T>)  | `.bodyToMono(String.class)`      |
//        | `.bodyToFlux()`     | Convert response to a stream of objects (Flux<T>) | `.bodyToFlux(MyObject.class)`    |
//        | `.block()`          | Blocking for Mono result                          | `.block()`                       |
//        | `.subscribe()`      | Asynchronous non-blocking call                    | `.subscribe(result -> ...)`      |


//        | When to Use                   | Method                | Example                                   |
//        | ----------------------------- | --------------------- | ----------------------------------------- |
//        | Single known value            | `Mono.just()`         | `Mono.just("A")`                          |
//        | Maybe null value              | `Mono.justOrEmpty()`  | `Mono.justOrEmpty(null)`                  |
//        | No value, just complete       | `Mono.empty()`        | `Mono.empty()`                            |
//        | Multiple known values         | `Flux.just()`         | `Flux.just(1, 2, 3)`                      |
//        | From List                     | `Flux.fromIterable()` | `Flux.fromIterable(List.of("a","b"))`     |
//        | Error scenario                | `Mono.error()`        | `Mono.error(new RuntimeException())`      |
//        | Wrap blocking code            | `Mono.fromCallable()` | `Mono.fromCallable(() -> callDB())`       |
//        | Infinite stream               | `Flux.interval()`     | `Flux.interval(Duration.ofSeconds(1))`    |
//        | Fresh instance per subscriber | `Mono.defer()`        | `Mono.defer(() -> Mono.just(new Date()))` |
//

//        | Method                               | Description                            | Input / Example JSON | Output JSON / Response             |
//        | ------------------------------------ | -------------------------------------- | -------------------- | ---------------------------------- |
//        | `Mono.empty()`                       | Emits nothing, completes               | —                    | HTTP 200 OK, no body               |
//        | `Mono.justOrEmpty(Optional.of(...))` | Emits item if present, else empty Mono | Optional.of(User)    | JSON object or empty               |
//        | `Mono.error(new Exception())`        | Emits an error                         | —                    | HTTP 500 / error JSON              |
//        | `Flux.fromIterable(List)`            | Emit from a List                       | `[User1, User2]`     | JSON array                         |
//        | `Flux.range(1, 3)`                   | Emit numbers                           | —                    | `[1, 2, 3]`                        |
//        | `Flux.interval(Duration.ofSec(1))`   | Infinite sequence of numbers           | —                    | emits numbers every sec (streamed) |
//        | `Mono.fromCallable(() -> get())`     | Wrap blocking call                     | User from DB         | JSON object                        |
//        | `Mono.defer(() -> Mono.just(...))`   | Lazy evaluation per request            | —                    | Fresh JSON per call                |
//


//==============================



//public class WebClientTest {
//
//    WebClient webClient = WebClient.builder()
//            .baseUrl("https://api.example.com")
//            .defaultHeader("Accept", "application/json")
//            .build();
//
//    public void performAllRequests() {
//
//        // 1. GET request
//        String getResult = webClient
//                .get()
//                .uri("/data")
//                .retrieve()
//                .bodyToMono(String.class)
//                .block(); // Blocking for simplicity
//        System.out.println("GET Result: " + getResult);
//
//        // 2. POST request with JSON body
//        String postResult = webClient
//                .post()
//                .uri("/create")
//                .contentType(MediaType.APPLICATION_JSON)
//                .bodyValue("{\"name\":\"John\",\"age\":30}")
//                .retrieve()
//                .bodyToMono(String.class)
//                .block();
//        System.out.println("POST Result: " + postResult);
//
//        // 3. PUT request
//        webClient
//                .put()
//                .uri("/update/123")
//                .contentType(MediaType.APPLICATION_JSON)
//                .bodyValue("{\"name\":\"UpdatedName\",\"age\":35}")
//                .retrieve()
//                .toBodilessEntity()
//                .block();
//        System.out.println("PUT request completed.");
//
//        // 4. DELETE request
//        webClient
//                .delete()
//                .uri("/delete/123")
//                .retrieve()
//                .toBodilessEntity()
//                .block();
//        System.out.println("DELETE request completed.");
//
//        // 5. GET with custom headers
//        String customHeaderResult = webClient
//                .get()
//                .uri("/data")
//                .header("Authorization", "Bearer your_token")
//                .retrieve()
//                .bodyToMono(String.class)
//                .block();
//        System.out.println("GET with Header Result: " + customHeaderResult);
//    }
//
//    public static void main(String[] args) {
//        WebClientClass client = new WebClientClass();
////        client.performAllRequests();
//    }
//}
//
