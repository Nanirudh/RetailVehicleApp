package com.microservices.IncentiveRESTAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.microservices.IncentiveRESTAPI.model.IncentiveModel;
import com.microservices.IncentiveRESTAPI.model.IncentiveInfoResponseModel;
import com.microservices.IncentiveRESTAPI.dao.Incentiverepo;

import java.util.List;
import java.util.Optional;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class IncentiveController {

    @Autowired
    Incentiverepo repo;

    @RequestMapping(value = "/incentivedetails", method = GET)
    public IncentiveInfoResponseModel saveDetails(@RequestParam("make") String vehicleMake, @RequestParam("model") String vehicleModel) {

        System.out.println("lol lol lol");
        //Optional<IncentiveModel> model = repo.findByMakeModel(vehicleMake, vehicleModel);
        List<IncentiveModel> model = repo.findByMakeModel(vehicleMake, vehicleModel);
        IncentiveInfoResponseModel responseObj = new IncentiveInfoResponseModel(model);

       // System.out.println(repo.findAll().toString());
        //return repo.findAll().toString();
        //return repo.findAll().toString();
        System.out.println("returning "+responseObj.toString());
        return responseObj;
    }
}
