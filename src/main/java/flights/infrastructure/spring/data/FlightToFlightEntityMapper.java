package flights.infrastructure.spring.data;

import flights.domain.Flight;
import org.springframework.stereotype.Component;

@Component
public class FlightToFlightEntityMapper {

    public Flight mapToFlight(FlightEntity flightEntity) {
        return Flight.Builder.aFlight()
                .withArrivalAirportCode(flightEntity.getArrivalAirportCode())
                .withArrivalTime(flightEntity.getArrivalTime())
                .withDepartureAirportCode(flightEntity.getDepartureAirportCode())
                .withDepartureTime(flightEntity.getDepartureTime())
                .withFlightNumber(flightEntity.getFlightNumber())
                .withPlaneNumber(flightEntity.getPlaneNumber())
                .build();
    }

    public FlightEntity mapToFlightEntity(Flight flight) {
        return FlightEntity.Builder.aFlightEntity()
                .withArrivalAirportCode(flight.getArrivalAirportCode())
                .withArrivalTime(flight.getArrivalTime())
                .withDepartureAirportCode(flight.getDepartureAirportCode())
                .withDepartureTime(flight.getDepartureTime())
                .withFlightNumber(flight.getFlightNumber())
                .withPlaneNumber(flight.getPlaneNumber())
                .build();
    }
}
