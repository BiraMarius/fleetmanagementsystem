package com.example.fleetmanagementsystem.parameters.controllers;

import com.example.fleetmanagementsystem.parameters.models.Country;
import com.example.fleetmanagementsystem.parameters.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CountryController {
    @Autowired
    private CountryService countryService;

//    @GetMapping("/countries")
//    @ResponseBody
//    public List<Country> getAll(){
//        return countryService.getAll();
//    }

    @GetMapping("/countries")
    public String getAll(){
        List<Country> countries = countryService.getAll();
        return "parameters/countryList";
    }

}
