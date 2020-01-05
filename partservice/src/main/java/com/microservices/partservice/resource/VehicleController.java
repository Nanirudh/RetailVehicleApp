package com.microservices.partservice.resource;

import com.microservices.partservice.model.Vehicle;
import com.microservices.partservice.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.lang.reflect.Array;
import java.util.List;

@RestController
public class VehicleController {

    @Autowired
    VehicleRepository vehicleRepository;

    @GetMapping("/partinfo")
    public ModelAndView getpartinfo(@RequestParam("make") String make, @RequestParam("model") String model) {
        Vehicle vehicle = vehicleRepository.findByMakeAndModel(make, model);
        ModelAndView map = new ModelAndView("display");
        map.addObject("vehicle", vehicle);
        return map;
    }

    @GetMapping("/partser")
    public Object getparts(@RequestParam("make") String make, @RequestParam("model") String model) {
        Vehicle vehicle = vehicleRepository.findByMakeAndModel(make, model);
        return (Object)vehicle;
    }

    @GetMapping("/partcompare")
    public Vehicle getpart(@RequestParam("make") String make, @RequestParam("model") String model) {
        Vehicle list = vehicleRepository.findByMakeAndModel(make, model);
        return list;
    }


    @GetMapping("/getvehicles")
    public List<Vehicle> getpart(@RequestParam("dealerid") String id) {

        List<Vehicle> list = vehicleRepository.findBydealerid(id);
     for(int i = 0; i < list.size(); i++) {
         System.out.println(list.get(i).getMake() + " " + list.get(i).getModel() + " " + list.get(i).getEnginepower() + " " + list.get(i).getEnginecapacity());
     }
        return list;
    }



}
