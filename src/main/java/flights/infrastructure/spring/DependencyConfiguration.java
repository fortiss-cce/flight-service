package flights.infrastructure.spring;

import flights.application.ListFlightArrivalService;
import flights.application.ListFlightService;
import flights.application.UpdateArrivalTimeService;
import flights.domain.FlightRepository;
import flights.infrastructure.spring.data.FlightSpringRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DependencyConfiguration {

    @Autowired
    FlightSpringRepository flightSpringRepository;

    @Bean
    public FlightRepository flightRepository() {
        return flightSpringRepository;
    }

    @Bean
    public ListFlightService listFlightService() {
        return new ListFlightService(flightRepository());
    }

    @Bean
    public ListFlightArrivalService listFlightArrivalService() {
        return new ListFlightArrivalService(flightRepository());
    }

    @Bean
    public UpdateArrivalTimeService updateArrivalTimeService() {
        return new UpdateArrivalTimeService(flightRepository());
    }

}
