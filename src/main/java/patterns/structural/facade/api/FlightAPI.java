package patterns.structural.facade.api;

/**
 * @author sebastianjara on 02-03-21
 * @project design-patterns
 */
public class FlightAPI {

    public void searchFlights(String departureDate, String arriveDate, String origin, String destiny) {
        System.out.println("==============================");
        System.out.println("Found Flights for " + destiny + " from " + origin);
        System.out.println("Departure date: " + departureDate + " Arrive Date " + arriveDate);
        System.out.println("==============================");
    }

}
