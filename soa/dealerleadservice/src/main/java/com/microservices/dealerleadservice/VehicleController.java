package com.microservices.dealerleadservice;

import com.microservices.dealerleadservice.dao.*;
import com.microservices.dealerleadservice.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VehicleController {

    @Autowired
    LeadRepo leadrepo;

    @Autowired
    DealerRepo dealerrepo;

    @GetMapping("/savelead")
    public QuoteInfo addDetails(@RequestParam("uid") String userid, @RequestParam("make") String make, @RequestParam("model") String model, @RequestParam("orderitem") String orderItem,
                                @RequestParam("quantity") String quantity, ModelMap modelMap) {


        QuoteInfo quoteobj = new QuoteInfo();
        quoteobj.setMake(make);
        quoteobj.setModel(model);
        quoteobj.setUid(userid);
        quoteobj.setOrderitem(orderItem);
        quoteobj.setQuantity(quantity);

//             System.out.println(repo.save(new QuoteInfo(userid, make, model, orderItem, quantityint)));
//             if(repo.save(new QuoteInfo(userid, make, model, orderItem, quantityint))!= null) {
        leadrepo.save(quoteobj);
//             repo.inserttuple(userid,make, model, orderItem, quantity);

//             } else {
//                 modelMap.put("emptyMsg", "Error uploading Quote");
//             }


        return quoteobj;
    }

    @GetMapping("/dealerdetails")
    public List<DealerInfo> displayDetails(@RequestParam("country") String country, @RequestParam("city") String city, ModelMap modelMap) {
//        ModelAndView mv = new ModelAndView();
//        if(country.length()==0) {
//            modelMap.put("emptyMsg", "Please enter the country field");
//            mv.setViewName("DealerForm");
//        } else {
        System.out.println("city is "+city);
        System.out.println("country is "+country);
        List<DealerInfo> dealerInfoList;
        if(city.length()>0) {
            dealerInfoList = dealerrepo.findByCountryAndCity(country,city);
        } else {
            dealerInfoList = dealerrepo.findByCountry(country);
        }

        return dealerInfoList;

//            if(dealerInfoList.size()==0) {
//                modelMap.put("Status","NotFound");
//            } else {
//                modelMap.put("Status","Found");
//            }
//
//            modelMap.put("DealerList", dealerInfoList);
//            mv.setViewName("DealerLocationDisplay");
//        }
//        return mv;
    }
}
