package com.tutorials.microservices.SpringClientConfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RefreshScope
public class RateController {

    // call refresh url in client if some change happens in config files. This will update the local cache

    @Value("${rate}")
    String rate;

    @Value("${lanecount}")
    String lanes;

    @Value("${tollstart}")
    String tollStart;

    @Value("${connstring}")
    String connString;

    @RequestMapping("/rate")
    public String getRate(Model m){
        m.addAttribute("rateAmount", rate);
        m.addAttribute("lanes", lanes);
        m.addAttribute("tollStart", tollStart);
        m.addAttribute("connstring", connString);
        return "rateView";
    }
}
