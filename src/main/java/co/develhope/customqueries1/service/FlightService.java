package co.develhope.customqueries1.service;

import co.develhope.customqueries1.entities.Flight;
import co.develhope.customqueries1.entities.FlightStatus;
import co.develhope.customqueries1.repositories.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;
@Component
public class FlightService {
    @Autowired
    FlightRepository flightRepository;
    public void setFlight(){
        int counter =0;
        while(counter <50){
            Random random=new Random();
            Flight flight=new Flight(random.nextLong(),random.ints(20).toString(),random.ints(20).toString(),random.ints(20).toString(), FlightStatus.ONTIME);
            flightRepository.save(flight);
            counter++;

        }
    }
    public List<Flight> flightLIst() {
        return flightRepository.findAll();
    }
}
