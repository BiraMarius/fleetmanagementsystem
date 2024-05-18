package com.example.fleetmanagementsystem.parameters.controllers;

import com.example.fleetmanagementsystem.parameters.models.State;
import com.example.fleetmanagementsystem.parameters.services.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class StateController {
    @Autowired
    private StateService stateService;

//    @GetMapping("/states")
//    @ResponseBody
//    public List<State> getAll(){
//        return countryService.getAll();
//    }

    @GetMapping("/states")
    public String getAll(Model model){
        List<State> states = stateService.getAll();
        model.addAttribute("states", states);
        return "parameters/states";
    }

    @GetMapping("/stateAdd")
    public String addState(){
        return "parameters/stateAdd";
    }

    @GetMapping("/countryEdit/{id}")
    public String editCountry(@PathVariable Integer id, Model model){
        State state = stateService.getById(id);
        model.addAttribute("state", state);
        return "parameters/countryEdit";
    }

    @PostMapping("/states")
    public String save(State state){
        stateService.save(state);
        return "redirect:/countries";
    }

    @RequestMapping(value="states/delete/{id}", method = {RequestMethod.GET, RequestMethod.DELETE})
    public String delete(@PathVariable Integer id){
        stateService.delete(id);
        return "redirect:/states";
    }

    @RequestMapping(value="/states/update/{id}", method={RequestMethod.GET, RequestMethod.PUT})
    public String delete(State state){
        stateService.save(state);
        return "redirect:/states";
    }

    @GetMapping("/stateDetails/{id}")
    public String detailsCountry(@PathVariable Integer id, Model model){
        State state = stateService.getById(id);
        model.addAttribute("state", state);
        return "parameters/countryDetails";
    }
}
