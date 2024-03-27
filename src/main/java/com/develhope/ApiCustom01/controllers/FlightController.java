package com.develhope.ApiCustom01.controllers;

import com.develhope.ApiCustom01.entities.Flight;
import com.develhope.ApiCustom01.repositories.FlightRepository;
import com.develhope.ApiCustom01.services.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {
    @Autowired
    private FlightService flightService;
    @GetMapping("/list")
    public ResponseEntity<List<Flight>> getAllFlights() {
        List<Flight> flights = flightService.generateFlights();
        return ResponseEntity.ok().body(flights);
    }

}
