package com.cims.demo.web;

import com.cims.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {

    @Autowired
    UserService service;

    @RequestMapping
    public String home() {
        return "home";
    }
}
