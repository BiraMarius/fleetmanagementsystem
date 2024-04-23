package com.example.fleetmanagementsystem.parameters.repositories;

import com.example.fleetmanagementsystem.parameters.models.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepository extends JpaRepository<State, Integer> {
}
