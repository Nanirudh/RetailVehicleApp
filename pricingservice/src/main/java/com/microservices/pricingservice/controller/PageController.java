package com.microservices.pricingservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

    @RequestMapping("/price")
    public ModelAndView home() {
        return new ModelAndView("index");
    }
}
