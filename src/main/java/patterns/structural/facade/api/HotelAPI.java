package patterns.structural.facade.api;

/**
 * @author sebastianjara on 02-03-21
 * @project design-patterns
 */
public class HotelAPI {

    public void searchHotels(String checkInDate, String checkOutDate, String origin, String destiny) {
        System.out.println("==============================");
        System.out.println("Found Hotels");
        System.out.println("Check-in: " + checkInDate + " Check-out: " + checkOutDate);
        System.out.println("Hotel A");
        System.out.println("Hotel B");
        System.out.println("Hotel C");
        System.out.println("==============================");
    }

}
