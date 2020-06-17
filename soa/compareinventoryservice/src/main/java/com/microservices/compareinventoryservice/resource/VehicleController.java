package com.microservices.compareinventoryservice.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.microservices.compareinventoryservice.model.Vehicle;
import java.util.List;

@RestController
public class VehicleController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/compareser")
    public Object[] comp(@RequestParam("makeone") String make1, @RequestParam("modelone") String model1, @RequestParam("maketwo") String make2, @RequestParam("modeltwo") String model2)
    {
        System.out.println("hello\n");
        Object vehicleone = restTemplate.getForObject("http://partproductservice/partcompare?make=" + make1 + "&model=" + model1, Object.class);
        Object vehicletwo = restTemplate.getForObject("http://partproductservice/partcompare?make=" + make2 + "&model=" + model2, Object.class);
        Object[] obj = new Object[2];
        obj[0] = vehicleone;
        obj[1] = vehicletwo;
        return obj;
    }

    @GetMapping("/inventoryser")
    public List<Vehicle> getpartinfo(@RequestParam("dealerid") String id) {
        List<Vehicle>dealerVehicleList =  restTemplate.getForObject("http://partproductservice/getvehicles?dealerid=" + id, List.class);
//        List<Object> vehicle = restTemplate.getForObject("http://localhost:8091/getvehictles?dealerid=" + id, List.class);
//        Object obj;
//      for(int i=0;i<vehicle.size();i++) {
//          System.out.println(vehicle.get(i).toString() );
//      }
//        System.out.println("lol");
//        /*ModelAndView mv = new ModelAndView("display");
//        mv.addObject("vehicles",vehicle);
//        return mv;*/return vehicle;
        return dealerVehicleList;
    }

}
