package com.microservices.productservice.controller;

import com.microservices.productservice.model.Vehicle;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class PageController {

    private RestTemplate restTemplate;

    @RequestMapping("/welcome")
    public ModelAndView home() {
        return new ModelAndView("index");
    }

}
