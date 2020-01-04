package com.example.configservice.resource;

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
    private RestTemplate restTemplate;

    @GetMapping("/productapi")
    public Object listVehicle(@RequestParam("make") String make) {
        Object vehicles = restTemplate.getForObject("http://localhost:8090/productser?make=" + make,Object.class);
        return vehicles;
    }

    @GetMapping("partapi")
    public Object getPart(@RequestParam("make") String make,@RequestParam("model") String model) {
        Object vehicle = restTemplate.getForObject("http://localhost:8091/partser?make=" + make + "&model=" + model,Object.class);
        return vehicle;
    }

    @GetMapping("compareapi")
    public Object compVehicle(@RequestParam("makeone") String make1, @RequestParam("modelone") String model1, @RequestParam("maketwo") String make2, @RequestParam("modeltwo") String model2) {
        Object obj = restTemplate.getForObject("http://localhost:8093/compareser?makeone=" + make1 + "&modelone=" + model1 + "&maketwo=" + make2 + "&modeltwo=" + model2, Object.class);
        return obj;
    }


    @GetMapping("inventoryapi")
    public Object dealer(@RequestParam("dealerid") String dealerid) {
        Object obj = restTemplate.getForObject("http://localhost:8097/inventoryser?dealerid=" + dealerid, Object.class);
        return obj;
    }

    @GetMapping("pricingapi")
    public Object getprice(@RequestParam("make") String make, @RequestParam("model") String model) {
        Object obj = restTemplate.getForObject("http://localhost:8094/pricingser?make=" + make + "&model=" + model, Object.class);
        return obj;
    }

}

