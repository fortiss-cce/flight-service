package flights.application;

import flights.domain.Flight;
import flights.domain.FlightRepository;

import java.time.ZonedDateTime;

public class UpdateArrivalTimeService {

    private FlightRepository flightRepository;

    public UpdateArrivalTimeService(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    public Flight updateForFlightNumber(String flightNumber, ZonedDateTime updatedArrivalTime) {
        Flight flight = flightRepository.findByFlightNumber(flightNumber);
        flight.setArrivalTime(updatedArrivalTime);
        return flightRepository.save(flight);
    }

}
