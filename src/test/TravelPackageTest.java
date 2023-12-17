package test;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import activity.Activity;
import destination.Destination;
import passenger.Passenger;
import passenger.PassengerType;
import travelPackage.TravelPackage;

public class TravelPackageTest {
	
	@Test
    public void testAddPassengerToTravelPackage() {
        // Create passenger types and activities
        PassengerType standard = PassengerType.STANDARD;
        Activity activity = new Activity("Sightseeing", "Enjoy the scenic beauty", 50.0, 20, null);
        // Create a destination with the activity
        Destination destination = new Destination("Mountain Resort", new ArrayList<>());
        destination.getActivities().add(activity); // Add the activity

        // Create passengers
        Passenger passenger1 = new Passenger("Alice", 1, 100.0, standard);

        // Create itinerary
        List<Destination> itinerary = new ArrayList<>();
        itinerary.add(destination);
        TravelPackage travelPackage = new TravelPackage("Mountain Adventure", 50, itinerary);

        // Add passenger to travel package
        assertTrue(travelPackage.addPassenger(passenger1));
    }
}
