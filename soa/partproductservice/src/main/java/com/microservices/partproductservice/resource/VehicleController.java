package com.microservices.partproductservice.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.microservices.partproductservice.repository.VehicleRepository;
import com.microservices.partproductservice.model.Vehicle;
import java.util.List;

@RestController
public class VehicleController {
    @Autowired
    VehicleRepository vehicleRepository;

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

    @GetMapping("/productser")
    public List<String> getVehicle(@RequestParam("make") String make) {
        List<String> list = vehicleRepository.findByMake(make);
        return list;
    }
}
