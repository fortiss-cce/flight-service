package flights;

import org.springframework.data.repository.Repository;

import java.util.List;

public interface FlightRepository extends Repository<Flight, Long> {

    Flight findByFlightNumber(String flightNumber);

    List<Flight> findAll();

    List<Flight> findAllByArrivalAirportCode(String arrivalAirportCode);

    Flight save(Flight flight);

}
