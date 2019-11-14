package com.microservices.productservice.resource;

import com.microservices.productservice.model.Vehicle;
import com.microservices.productservice.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class VehicleController {

    @Autowired
    VehicleRepository vehicleRepository;
    @GetMapping("/pro")
    public ModelAndView listEmployee(@RequestParam("make") String make) {
        List<String> list = vehicleRepository.findByMake(make);
        ModelAndView map = new ModelAndView("display");
        map.addObject("lists", list);
        return map;
    }

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/comm")
    public Object comm() {
        String model = new String("1994 BMW M3 E36 Manual1");
        Object temp = restTemplate.getForObject("http://localhost:8091/partinfo?make=BMW&model=" + model, Object.class);
        return temp;
    }


}
