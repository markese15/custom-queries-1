package co.develhope.customqueries1.controllers;

import co.develhope.customqueries1.entities.Flight;
import co.develhope.customqueries1.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {
@Autowired
    FlightService flightService;
@PostMapping
public void postFlight(){
    flightService.setFlight();
}
@GetMapping
    public List<Flight> getMapping(){
   return  flightService.flightLIst();
}
}
