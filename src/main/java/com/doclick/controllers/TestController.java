package com.doclick.controllers;


import org.springframework.web.bind.annotation.*;
import java.security.Principal;


@RestController
@RequestMapping("/api")
public class TestController
{
    @GetMapping("/log")
    public String logginTest()
    {
        return "Wesh";
    }

    @GetMapping("/user")
    public Principal user(Principal principal) {
        System.out.println("username : " + principal.getName());
        return principal;
    }
}
