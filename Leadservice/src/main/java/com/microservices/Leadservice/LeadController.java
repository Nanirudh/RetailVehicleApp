package com.microservices.Leadservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.microservices.Leadservice.dao.LeadRepo;
import com.microservices.Leadservice.model.QuoteInfo;

import static java.lang.Integer.parseInt;

@RestController
public class LeadController {

    @Autowired
    LeadRepo repo;

    @RequestMapping("/leadform")
    public ModelAndView renderForm() {

        ModelAndView mv = new ModelAndView();
        mv.setViewName("LeadForm");
        return mv;
    }

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
             repo.save(quoteobj);
//             repo.inserttuple(userid,make, model, orderItem, quantity);

//             } else {
//                 modelMap.put("emptyMsg", "Error uploading Quote");
//             }


        return quoteobj;
    }
}
