package com.example.demo.webclient.webclient_interceptor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
@Getter
@Setter
public class User {
    private String name;
    private int age;
}
