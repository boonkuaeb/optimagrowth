package com.bk.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

    @GetMapping("/")
    public String home()
    {
        return "<div>Home Resource</div>";
    }

    @GetMapping("/user")
    public String user()
    {
        return "<div>Home Resource user</div>";
    }
    @GetMapping("/admin")
    public String admin()
    {
        return "<div>Home Resource admin</div>";
    }
}
