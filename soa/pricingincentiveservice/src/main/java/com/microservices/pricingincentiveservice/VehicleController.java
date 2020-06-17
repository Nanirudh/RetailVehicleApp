package com.microservices.pricingincentiveservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import com.microservices.pricingincentiveservice.model.*;
import com.microservices.pricingincentiveservice.dao.*;

import java.util.List;

@RestController
public class VehicleController {

    @Autowired
    Incentiverepo IncentiveRepo;

    @Autowired
    Pricingrepo vehicleRepository;

    @GetMapping("/pricingser")
    public Vehicle getprice(@RequestParam("make") String make, @RequestParam("model") String model) {
        Vehicle vehicle = vehicleRepository.findByMakeAndModel(make,model);
        return vehicle;
    }

    @RequestMapping(value = "/incentivedetails", method = RequestMethod.GET)
    public List<IncentiveModel> saveDetails(@RequestParam("vehicleMake") String vehicleMake, @RequestParam("vehicleModel") String vehicleModel,
                                            ModelMap modelMap) {

//        System.out.println("Make Model "+vehicleMake+ vehicleModel);
//        ModelAndView mv = new ModelAndView();
//        if(vehicleMake.length()==0||vehicleModel.length()==0) {
//            modelMap.put("emptyMsg", "Please enter all the fields");
//            mv.setViewName("formPage");
//        }
//        else {
//          IncentiveInfoResponseModel response = restTemplate.getForObject("http://IncentiveserviceAPI/incentivedetails?make="+vehicleMake+"&model="+vehicleModel,IncentiveInfoResponseModel.class);

        List<IncentiveModel> model = IncentiveRepo.findByMakeModel(vehicleMake, vehicleModel);
        System.out.println("FOUND DATA IS "+model);



        // }
        return model;
    }



}
