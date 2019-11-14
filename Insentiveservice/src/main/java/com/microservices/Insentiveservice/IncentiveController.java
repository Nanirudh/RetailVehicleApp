package com.microservices.Insentiveservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.microservices.Insentiveservice.dao.Incentiverepo;
import com.microservices.Insentiveservice.model.IncentiveModel;

import java.util.List;


@RestController
public class IncentiveController {


    @Autowired
    Incentiverepo repo;

    @RequestMapping("/incentive")
    public ModelAndView renderForm() {

        ModelAndView mv = new ModelAndView();
        mv.setViewName("formPage");
        return mv;
    }

    @RequestMapping(value = "/getDetails", method = RequestMethod.POST)
    public ModelAndView saveDetails(@RequestParam("vehicleMake") String vehicleMake, @RequestParam("vehicleModel") String vehicleModel,
                                    ModelMap modelMap) {

        System.out.println("Make Model "+vehicleMake+ vehicleModel);
        ModelAndView mv = new ModelAndView();
        if(vehicleMake.length()==0||vehicleModel.length()==0) {
            modelMap.put("emptyMsg", "Please enter all the fields");
            mv.setViewName("formPage");
        }
        else {
//          IncentiveInfoResponseModel response = restTemplate.getForObject("http://IncentiveserviceAPI/incentivedetails?make="+vehicleMake+"&model="+vehicleModel,IncentiveInfoResponseModel.class);

            List<IncentiveModel> model = repo.findByMakeModel(vehicleMake, vehicleModel);
            System.out.println("FOUND DATA IS "+model);
            modelMap.put("incentiveObj", model);
            modelMap.put("make", vehicleMake);
            modelMap.put("model", vehicleModel);
            mv.setViewName("displayIncentivePage");


        }

        return mv;
    }
}
