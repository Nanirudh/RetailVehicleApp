package com.microservices.pricingAPI.resource;

import com.microservices.pricingAPI.model.Vehicle;
import com.microservices.pricingAPI.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class VehicleController {

    @Autowired
    VehicleRepository vehicleRepository;

    @GetMapping("/priceinfo")
    public Vehicle getpriceinfo(@RequestParam("make") String make, @RequestParam("model") String model) {
        Vehicle vehicle = vehicleRepository.findByMakeAndModel(make, model);
        return vehicle;
    }

}
