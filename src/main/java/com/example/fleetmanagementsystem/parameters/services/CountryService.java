package com.example.fleetmanagementsystem.parameters.services;

import com.example.fleetmanagementsystem.parameters.models.Country;
import com.example.fleetmanagementsystem.parameters.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public List<Country> getAll(){
        return countryRepository.findAll();
    }

    public void save(Country country){
        countryRepository.save(country);
    }
}
