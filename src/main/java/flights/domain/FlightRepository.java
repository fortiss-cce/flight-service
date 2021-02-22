package flights.domain;

import java.util.List;

public interface FlightRepository {

    Flight findByFlightNumber(String flightNumber);

    List<Flight> findAll();

    List<Flight> findAllByArrivalAirportCode(String arrivalAirportCode);

    Flight save(Flight flight);

}
