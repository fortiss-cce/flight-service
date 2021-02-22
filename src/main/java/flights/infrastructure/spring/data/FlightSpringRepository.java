package flights.infrastructure.spring.data;

import flights.domain.Flight;
import flights.domain.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class FlightSpringRepository implements FlightRepository {

    @Autowired
    private FlightToFlightEntityMapper mapper;

    @Autowired
    private FlightEntitySpringRepository entityRepository;

    @Override
    public Flight findByFlightNumber(String flightNumber) {
        FlightEntity flightEntity = entityRepository.findByFlightNumber(flightNumber);
        return mapper.mapToFlight(flightEntity);
    }

    @Override
    public List<Flight> findAll() {
        return entityRepository
                .findAll()
                .stream()
                .map(flightEntity -> mapper.mapToFlight(flightEntity))
                .collect(Collectors.toList());
    }

    @Override
    public List<Flight> findAllByArrivalAirportCode(String arrivalAirportCode) {
        return entityRepository
                .findAllByArrivalAirportCode(arrivalAirportCode)
                .stream()
                .map(flightEntity -> mapper.mapToFlight(flightEntity))
                .collect(Collectors.toList());
    }

    @Override
    public Flight save(Flight flight) {
        FlightEntity flightEntity = mapper.mapToFlightEntity(flight);
        FlightEntity savedFlightEntity = entityRepository.save(flightEntity);
        return mapper.mapToFlight(savedFlightEntity);
    }

}
