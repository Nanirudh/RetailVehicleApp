package com.microservices.pricingservice.resource;

import com.microservices.pricingservice.model.Vehicle;
import com.microservices.pricingservice.repository.VehicleRepository;
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
    VehicleRepository vehicleRepository;

    @GetMapping("/getprice")
    public ModelAndView getpriceinfo(@RequestParam("make") String make, @RequestParam("model") String model) {
        Vehicle vehicle = vehicleRepository.findByMakeAndModel(make,model);
        ModelAndView mv = new ModelAndView("display");
        mv.addObject("vehicle",vehicle);
        return mv;
    }


    @GetMapping("/pricingser")
    public Object getprice(@RequestParam("make") String make, @RequestParam("model") String model) {
        Vehicle vehicle = vehicleRepository.findByMakeAndModel(make,model);
        return vehicle;
    }

}
