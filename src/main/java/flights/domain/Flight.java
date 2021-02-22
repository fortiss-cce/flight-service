package flights.domain;

import java.time.ZonedDateTime;

public class Flight {

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

    public static final class Builder {
        private String flightNumber;
        private String planeNumber;
        private ZonedDateTime departureTime;
        private ZonedDateTime arrivalTime;
        private String departureAirportCode;
        private String arrivalAirportCode;

        private Builder() {
        }

        public static Builder aFlight() {
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

        public Flight build() {
            Flight flight = new Flight();
            flight.arrivalTime = this.arrivalTime;
            flight.departureTime = this.departureTime;
            flight.departureAirportCode = this.departureAirportCode;
            flight.flightNumber = this.flightNumber;
            flight.arrivalAirportCode = this.arrivalAirportCode;
            flight.planeNumber = this.planeNumber;
            return flight;
        }
    }
}
