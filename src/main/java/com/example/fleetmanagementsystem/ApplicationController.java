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
}
