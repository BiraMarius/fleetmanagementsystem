package com.example.fleetmanagementsystem.parameters.repositories;

import com.example.fleetmanagementsystem.parameters.models.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {
}
