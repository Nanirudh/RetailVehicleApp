package com.microservices.Insentiveservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;
import com.microservices.Insentiveservice.model.IncentiveInfoResponseModel;

import java.util.Optional;

@RestController
public class IncentiveController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/incentive")
    public ModelAndView renderForm() {

        ModelAndView mv = new ModelAndView();
        mv.setViewName("formPage");
        return mv;
    }

    @RequestMapping(value = "/saveDetails", method = RequestMethod.POST)
    public ModelAndView saveDetails(@RequestParam("vehicleMake") String vehicleMake, @RequestParam("vehicleModel") String vehicleModel,
                                    ModelMap modelMap) {


        ModelAndView mv = new ModelAndView();
        if(vehicleMake.length()==0||vehicleModel.length()==0) {
            modelMap.put("emptyMsg", "Please enter all the fields");
            mv.setViewName("formPage");
        }
        else {
            IncentiveInfoResponseModel response = restTemplate.getForObject("http://IncentiveserviceAPI/incentivedetails?make="+vehicleMake+"&model="+vehicleModel,IncentiveInfoResponseModel.class);
            System.out.println(response.toString());
            modelMap.put("incentiveObj", response.getResponse());
           // System.out.println(response.getResponse().size());
            modelMap.put("make", vehicleMake);
            modelMap.put("model", vehicleModel);
            mv.setViewName("displayIncentivePage");


        }

        return mv;
    }
}
