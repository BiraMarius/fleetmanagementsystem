package com.example.fleetmanagementsystem;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {

    @GetMapping("/index")
    public String home(){
        return "index";
    }

    @GetMapping("/widgets")
    public String widgets(){
        return "widgets";
    }

    @GetMapping("/_layout")
    public String _layout(){
        return "_layout";
    }

    @GetMapping("/index2")
    public String index2(){
        return "index2";
    }

    @GetMapping("/hr")
    public String hr(){
        return "/hr/index";
    }

    @GetMapping("/accounts")
    public String accounts(){
        return "/accounts/index";
    }

    @GetMapping("/fleet")
    public String fleet(){
        return "/fleet/index";
    }

    @GetMapping("/helpdesk")
    public String helpdesk(){
        return "/helpdesk/index";
    }

    @GetMapping("/parameters")
    public String parameters(){
        return "/parameters/index";
    }

    @GetMapping("/payroll")
    public String payroll(){
        return "/payroll/index";
    }

    @GetMapping("/reports")
    public String reports(){return "/reports/index";}

    @GetMapping("/security")
    public String security(){return "/security/index";}

    //accounts
    //vehicles
    //payroll
    //it

}
