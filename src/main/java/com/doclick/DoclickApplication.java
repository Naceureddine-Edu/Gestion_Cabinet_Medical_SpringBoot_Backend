package com.doclick;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class DoclickApplication {

    public static void main(String[] args) {
        SpringApplication.run(DoclickApplication.class, args);
    }

    @GetMapping("/log")
    public String logginTest()
    {
        return "Wesh";
    }
}
