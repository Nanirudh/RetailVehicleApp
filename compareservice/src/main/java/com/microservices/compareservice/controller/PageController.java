package com.microservices.compareservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

    private RestTemplate restTemplate;

    @RequestMapping("/welcome")
    public ModelAndView home() {
        return new ModelAndView("index");
    }

}
