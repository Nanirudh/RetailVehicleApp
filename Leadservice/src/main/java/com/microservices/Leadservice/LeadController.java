package com.microservices.Leadservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
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

    @PostMapping("/savelead")
    public ModelAndView addDetails(@RequestParam("uid") String userid, @RequestParam("make") String make, @RequestParam("model") String model, @RequestParam("orderitem") String orderItem,
                                   @RequestParam("quantity") String quantity, ModelMap modelMap) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("LeadForm");
        if(userid.length()==0||make.length()==0||model.length()==0||orderItem.length()==0||quantity.length()==0) {
            modelMap.put("emptyMsg", "Please enter all the fields");
        } else {
             Integer quantityint = Integer.parseInt(quantity);
             QuoteInfo quoteobj = new QuoteInfo();
             quoteobj.setMake(make);
             quoteobj.setModel(model);
             quoteobj.setUid(userid);
             quoteobj.setOrderitem(orderItem);
             quoteobj.setQuantity(quantityint);

//             System.out.println(repo.save(new QuoteInfo(userid, make, model, orderItem, quantityint)));
//             if(repo.save(new QuoteInfo(userid, make, model, orderItem, quantityint))!= null) {
             repo.save(quoteobj);
             modelMap.put("emptyMsg", "Quote uploaded successfully!");
//             } else {
//                 modelMap.put("emptyMsg", "Error uploading Quote");
//             }

        }
        return mv;
    }
}
