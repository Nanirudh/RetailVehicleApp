package com.microservices.inventoryservice.resource;

import com.microservices.inventoryservice.model.Vehicle;
import com.microservices.inventoryservice.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class VehicleController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/dealerinfo")
    public List<Object> getpartinfo(@RequestParam("dealerid") String id) {
        List<Object> vehicle = restTemplate.getForObject("http://localhost:8091/getvehicles?dealerid=" + id, List.class);
        /*ModelAndView mv = new ModelAndView("display");
        mv.addObject("vehicles",vehicle);
        return mv;*/return vehicle;
    }
}
