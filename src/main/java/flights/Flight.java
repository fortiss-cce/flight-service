package flights;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.ZonedDateTime;

@Entity(name = "FLIGHT_ENTITY")
public class Flight {

    @Id
    private String flightNumber;
    private String planeNumber;
    private ZonedDateTime departureTime;
    private ZonedDateTime arrivalTime;
    private String departureAirportCode;
    private String arrivalAirportCode;

    public Flight() {
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getPlaneNumber() {
        return planeNumber;
    }

    public ZonedDateTime getDepartureTime() {
        return departureTime;
    }

    public ZonedDateTime getArrivalTime() {
        return arrivalTime;
    }

    public String getDepartureAirportCode() {
        return departureAirportCode;
    }

    public String getArrivalAirportCode() {
        return arrivalAirportCode;
    }

    public void setArrivalTime(ZonedDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

}
