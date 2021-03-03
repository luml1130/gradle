package com.luml.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author luml
 * @description
 * @date 2021/3/3 10:39 上午
 */
@Controller
@SpringBootApplication
public class GradleBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(GradleBootApplication.class, args);
    }

    @ResponseBody
    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

}
