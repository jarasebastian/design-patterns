package patterns.structural.facade;

import patterns.structural.facade.api.FlightAPI;
import patterns.structural.facade.api.HotelAPI;

/**
 * @author sebastianjara on 02-03-21
 * @project design-patterns
 */
public class CheckFacade {

    private FlightAPI flightAPI;
    private HotelAPI hotelAPI;

    public CheckFacade() {
        flightAPI = new FlightAPI();
        hotelAPI = new HotelAPI();
    }

    public void search(String departureDate, String arriveDate, String origin, String destiny) {
        flightAPI.searchFlights(departureDate, arriveDate, origin, destiny);
        hotelAPI.searchHotels(departureDate, arriveDate, origin, destiny);
    }

}
