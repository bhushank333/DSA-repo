package com.example.demo.webclient.webclient_interceptor;


import com.example.demo.webclient.webclient_interceptor.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @PostMapping
    public ResponseEntity<String> addUser(@RequestBody User user) {
        return ResponseEntity.ok("User added: " + user.getName());
    }
}
