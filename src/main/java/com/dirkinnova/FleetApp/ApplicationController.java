package com.dirkinnova.FleetApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {

    @GetMapping("/index")
    public String goHome(){

        return "index";

    }

    @GetMapping("/index2")
    public String layout(){

        return "index2";

    }
}
