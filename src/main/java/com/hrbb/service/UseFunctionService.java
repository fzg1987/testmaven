package com.hrbb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author fzg1987
 */
@Service //1
public class UseFunctionService {
    @Autowired //2
    FunctionService functionService;

    public String SayHello(String word) {
        return functionService.sayHello( word );
    }
}
