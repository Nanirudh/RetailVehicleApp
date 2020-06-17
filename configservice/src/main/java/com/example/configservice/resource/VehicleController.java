package com.example.configservice.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class VehicleController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/productapi")
    public Object listVehicle(@RequestParam("make") String make) {
        Object vehicles = restTemplate.getForObject("http://productservice/productser?make=" + make,Object.class);
        return vehicles;
    }

    @GetMapping("/partapi")
    public Object getPart(@RequestParam("make") String make,@RequestParam("model") String model) {
        Object vehicle = restTemplate.getForObject("http://partservice/partser?make=" + make + "&model=" + model,Object.class);
        return vehicle;
    }

    @GetMapping("/compareapi")
    public Object compVehicle(@RequestParam("makeone") String make1, @RequestParam("modelone") String model1, @RequestParam("maketwo") String make2, @RequestParam("modeltwo") String model2) {
        Object obj = restTemplate.getForObject("http://compareservice/compareser?makeone=" + make1 + "&modelone="
                + model1 + "&maketwo=" + make2 + "&modeltwo=" + model2, Object.class);
        return obj;
    }


    @GetMapping("/inventoryapi")
    public Object dealer(@RequestParam("dealerid") String dealerid) {
        Object obj = restTemplate.getForObject("http://inventoryservice/inventoryser?dealerid=" + dealerid, Object.class);
        return obj;
    }

    @GetMapping("/pricingapi")
    public Object getprice(@RequestParam("make") String make, @RequestParam("model") String model) {
        Object obj = restTemplate.getForObject("http://pricingservice/pricingser?make=" + make + "&model=" + model, Object.class);
        return obj;
    }

    @GetMapping("/dealerapi")
    public Object dealerInfo(@RequestParam("country") String country, @RequestParam("city") String city) {
        Object obj = restTemplate.getForObject("http://dealerservice/dealerdetails?country=" + country + "&city=" + city, Object.class);
        return obj;
    }

    @GetMapping("/incentiveapi")
    public Object incentiveInfo(@RequestParam("make") String vehicleMake, @RequestParam("model") String vehicleModel) {
        Object obj = restTemplate.getForObject("http://incentiveservice/incentivedetails?vehicleMake=" + vehicleMake + "&vehicleModel=" + vehicleModel, Object.class);
        return obj;
    }

    @GetMapping ("/leadapi")
    public Object uploadLead(@RequestParam("uid") String userid, @RequestParam("make") String make, @RequestParam("model") String model, @RequestParam("orderitem") String orderItem,
                             @RequestParam("quantity") String quantity) {
        Object obj = restTemplate.getForObject("http://leadservice/savelead?uid=" + userid
                + "&make=" + make + "&model=" + model +"&orderitem=" + orderItem + "&quantity=" + quantity, Object.class);
        return obj;
    }


}

