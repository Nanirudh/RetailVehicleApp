package com.microservices.compareservice.resource;

import com.microservices.compareservice.model.Vehicle;
import com.microservices.compareservice.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@RestController
public class VehicleController {

    @Autowired
    private RestTemplate restTemplate;

//    @RequestMapping("/compare")
//    public ModelAndView comm(@RequestParam("makeone") String make1, @RequestParam("modelone") String model1, @RequestParam("maketwo") String make2, @RequestParam("modeltwo") String model2)
//     {
//        Object vehicleone = restTemplate.getForObject("http://localhost:8091/partcompare?make=" + make1 + "&model=" + model1, Object.class);
//        Object vehicletwo = restTemplate.getForObject("http://localhost:8091/partcompare?make=" + make2 + "&model=" + model2, Object.class);
//        ModelAndView mv = new ModelAndView("display");
//        mv.addObject("vehicleone",vehicleone);
//        mv.addObject("vehicletwo",vehicletwo);
//        return mv;
//    }


    @RequestMapping("/compareser")
    public Object[] comp(@RequestParam("makeone") String make1, @RequestParam("modelone") String model1, @RequestParam("maketwo") String make2, @RequestParam("modeltwo") String model2)
    {
        System.out.println("hello\n");
        Object vehicleone = restTemplate.getForObject("http://partservice/partcompare?make=" + make1 + "&model=" + model1, Object.class);
        Object vehicletwo = restTemplate.getForObject("http://partservice/partcompare?make=" + make2 + "&model=" + model2, Object.class);
        Object[] obj = new Object[2];
        obj[0] = vehicleone;
        obj[1] = vehicletwo;
        return obj;
    }


}
