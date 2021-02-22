package flights.infrastructure.spring.data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.ZonedDateTime;

@Entity
public class FlightEntity {

    @Id
    private String flightNumber;
    private String planeNumber;
    private ZonedDateTime departureTime;
    private ZonedDateTime arrivalTime;
    private String departureAirportCode;
    private String arrivalAirportCode;

    public FlightEntity() {
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getPlaneNumber() {
        return planeNumber;
    }

    public void setPlaneNumber(String planeNumber) {
        this.planeNumber = planeNumber;
    }

    public ZonedDateTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(ZonedDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public ZonedDateTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(ZonedDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getDepartureAirportCode() {
        return departureAirportCode;
    }

    public void setDepartureAirportCode(String departureAirportCode) {
        this.departureAirportCode = departureAirportCode;
    }

    public String getArrivalAirportCode() {
        return arrivalAirportCode;
    }

    public void setArrivalAirportCode(String arrivalAirportCode) {
        this.arrivalAirportCode = arrivalAirportCode;
    }


    public static final class Builder {
        private Long id;
        private String flightNumber;
        private String planeNumber;
        private ZonedDateTime departureTime;
        private ZonedDateTime arrivalTime;
        private String departureAirportCode;
        private String arrivalAirportCode;

        private Builder() {
        }

        public static Builder aFlightEntity() {
            return new Builder();
        }

        public Builder withFlightNumber(String flightNumber) {
            this.flightNumber = flightNumber;
            return this;
        }

        public Builder withPlaneNumber(String planeNumber) {
            this.planeNumber = planeNumber;
            return this;
        }

        public Builder withDepartureTime(ZonedDateTime departureTime) {
            this.departureTime = departureTime;
            return this;
        }

        public Builder withArrivalTime(ZonedDateTime arrivalTime) {
            this.arrivalTime = arrivalTime;
            return this;
        }

        public Builder withDepartureAirportCode(String departureAirportCode) {
            this.departureAirportCode = departureAirportCode;
            return this;
        }

        public Builder withArrivalAirportCode(String arrivalAirportCode) {
            this.arrivalAirportCode = arrivalAirportCode;
            return this;
        }

        public FlightEntity build() {
            FlightEntity flightEntity = new FlightEntity();
            flightEntity.setFlightNumber(flightNumber);
            flightEntity.setPlaneNumber(planeNumber);
            flightEntity.setDepartureTime(departureTime);
            flightEntity.setArrivalTime(arrivalTime);
            flightEntity.setDepartureAirportCode(departureAirportCode);
            flightEntity.setArrivalAirportCode(arrivalAirportCode);
            return flightEntity;
        }
    }

}
