package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author momo
 * @date 2020/1/21 下午2:45
 */
@RestController
public class WelcomeColtroller {

    @RequestMapping("/")
    public String index() {
        return "hello world";
    }

}
