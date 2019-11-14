package com.microservices.Dealerservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.microservices.Dealerservice.model.DealerInfo;
import com.microservices.Dealerservice.dao.DealerRepo;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class DealerController {

    @Autowired
    DealerRepo repo;

    @RequestMapping("/locatedealer")
    public ModelAndView renderForm() {

        ModelAndView mv = new ModelAndView();
        mv.setViewName("DealerForm");
        return mv;
    }

    @PostMapping("/dealerdetails")
    public ModelAndView displayDetails(@RequestParam("Country") String country, @RequestParam("City") String city, ModelMap modelMap) {
        ModelAndView mv = new ModelAndView();
        if(country.length()==0) {
            modelMap.put("emptyMsg", "Please enter the country field");
            mv.setViewName("DealerForm");
        } else {
            System.out.println("city is "+city);
            System.out.println("country is "+country);
            List<DealerInfo> dealerInfoList;
            if(city.length()>0) {
                dealerInfoList = repo.findByCountryAndCity(country,city);
            } else {
                dealerInfoList = repo.findByCountry(country);
            }

            if(dealerInfoList.size()==0) {
                modelMap.put("Status","NotFound");
            } else {
                modelMap.put("Status","Found");
            }

            modelMap.put("DealerList", dealerInfoList);
            mv.setViewName("DealerLocationDisplay");
        }
        return mv;
    }
}
