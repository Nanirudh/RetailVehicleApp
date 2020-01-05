package com.microservices.partservice.controller;

import com.microservices.partservice.model.Vehicle;
import com.microservices.partservice.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class PageController {

    @Autowired
    VehicleRepository vehicleRepository;
    @RequestMapping("/partinfo")
    public ModelAndView home() {
        return new ModelAndView("index");
    }

    @GetMapping("/getvehicles")
    public List<Vehicle> getpart(@RequestParam("dealerid") String id) {
        int vid = Integer.parseInt(id);
        System.out.println("vid is "+vid);
        List<Vehicle> list = vehicleRepository.findBydealerid(id);

        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getMake() + " " + list.get(i).getModel() + " " + list.get(i).getEnginepower() + " " + list.get(i).getEnginecapacity());
        }
        return list;
    }
}
