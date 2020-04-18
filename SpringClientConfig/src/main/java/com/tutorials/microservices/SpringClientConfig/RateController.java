package com.tutorials.microservices.SpringClientConfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RateController {

    @Value("${rate}")
    String rate;

    @Value("${lanecount}")
    String lanes;

    @Value("${tollstart}")
    String tollStart;

    @RequestMapping("/rate")
    public String getRate(Model m){
        m.addAttribute("rateAmount", rate);
        m.addAttribute("lanes", lanes);
        m.addAttribute("tollStart", tollStart);
        return "rateView";
    }
}
