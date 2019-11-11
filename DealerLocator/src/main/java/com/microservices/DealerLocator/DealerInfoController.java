package com.microservices.DealerLocator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;
import com.microservices.DealerLocator.model.DealerInfo;
import com.microservices.DealerLocator.dao.DealerRepo;

import java.util.List;


@RestController
public class DealerInfoController {

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
            List<DealerInfo> dealerInfoList;
            if(city.length()>0) {
                dealerInfoList = repo.findByCountryCity(country,city);
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
