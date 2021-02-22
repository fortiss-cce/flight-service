package flights.infrastructure.spring.data;

import org.springframework.data.repository.Repository;

import java.util.List;

public interface FlightEntitySpringRepository extends Repository<FlightEntity, Long> {

    FlightEntity findByFlightNumber(String flightNumber);

    List<FlightEntity> findAll();

    List<FlightEntity> findAllByArrivalAirportCode(String arrivalAirportCode);

    FlightEntity save(FlightEntity flightEntity);

}
