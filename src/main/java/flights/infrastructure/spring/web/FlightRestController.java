package flights.infrastructure.spring.web;

import flights.application.ListFlightArrivalService;
import flights.application.ListFlightService;
import flights.application.UpdateArrivalTimeService;
import flights.domain.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.ZonedDateTime;
import java.util.List;

@RestController
public class FlightRestController {

    @Autowired
    private ListFlightService listFlightService;

    @Autowired
    private ListFlightArrivalService listFlightArrivalService;

    @Autowired
    private UpdateArrivalTimeService updateArrivalTimeService;

    @GetMapping(path = "/flights")
    public List<Flight> getFlights(@RequestParam(value = "arrivalAirport", required = false) String arrivalAirportCode) {
        if (arrivalAirportCode == null) {
            return listFlightService.list();
        } else {
            return listFlightArrivalService.listForAirport(arrivalAirportCode);
        }
    }

    @PostMapping(path = "/flights/{flightNumber}/update-arrival")
    public ResponseEntity<Flight> updateArrivalTime(@PathVariable("flightNumber") String flightNumber, @RequestBody String arrivalTime) {
        ZonedDateTime zonedDateTime = ZonedDateTime.parse(arrivalTime);
        return ResponseEntity.ok(updateArrivalTimeService.updateForFlightNumber(flightNumber, zonedDateTime));
    }

}
