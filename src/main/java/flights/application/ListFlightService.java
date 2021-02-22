package flights.application;

import flights.domain.Flight;
import flights.domain.FlightRepository;

import java.util.List;

public class ListFlightService {

    private FlightRepository flightRepository;

    public ListFlightService(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    public List<Flight> list() {
        return flightRepository.findAll();
    }

}
