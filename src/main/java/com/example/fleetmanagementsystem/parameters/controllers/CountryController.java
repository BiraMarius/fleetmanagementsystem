package com.example.fleetmanagementsystem.parameters.controllers;

import com.example.fleetmanagementsystem.parameters.models.Country;
import com.example.fleetmanagementsystem.parameters.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
    public String getAll(Model model){
        List<Country> countries = countryService.getAll();
        model.addAttribute("countries", countries);
        return "parameters/countryList";
    }

    @GetMapping("/countryAdd")
    public String addCountry(){
        return "parameters/countryAdd";
    }

    @PostMapping("/countries")
    public String save(Country country){
        countryService.save(country);
        return "redirect:/countries";
    }

}
