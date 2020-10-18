package com.hrbb.service;

import org.springframework.stereotype.Service;

@Service //1
public class FunctionService {
    public String sayHello(String word) {
        return "Hello "+ word + " !";
    }
}
