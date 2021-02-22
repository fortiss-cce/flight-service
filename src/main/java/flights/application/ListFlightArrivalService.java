package flights.application;

import flights.domain.Flight;
import flights.domain.FlightRepository;

import java.util.List;

public class ListFlightArrivalService {

    private FlightRepository flightRepository;

    public ListFlightArrivalService(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    public List<Flight> listForAirport(String airportCode) {
        return flightRepository.findAllByArrivalAirportCode(airportCode);
    }

}
