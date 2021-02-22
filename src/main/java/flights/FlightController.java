package flights;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.ZonedDateTime;
import java.util.List;

@RestController
@CrossOrigin(exposedHeaders = "errors, content-type")
public class FlightController {

    @Autowired
    private FlightRepository flightRepository;

    @GetMapping(path = "/flights")
    public List<Flight> getFlights(@RequestParam(value = "arrivalAirport", required = false) String arrivalAirportCode) {
        if (arrivalAirportCode == null) {
            return flightRepository.findAll();
        } else {
            return flightRepository.findAllByArrivalAirportCode(arrivalAirportCode);
        }
    }

    @PostMapping(path = "/flights/{flightNumber}/update-arrival")
    public ResponseEntity<Flight> updateArrivalTime(@PathVariable("flightNumber") String flightNumber, @RequestBody String arrivalTime) {
        ZonedDateTime zonedDateTime = ZonedDateTime.parse(arrivalTime);
        Flight flight = flightRepository.findByFlightNumber(flightNumber);
        flight.setArrivalTime(zonedDateTime);
        return ResponseEntity.ok(flightRepository.save(flight));
    }

}
