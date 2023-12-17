package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

import activity.Activity;
import destination.Destination;
import passenger.Passenger;
import passenger.PassengerType;

public class ActivityTest {

    @Test
    public void testGetAvailableSpaces() {
        Destination destination = new Destination("Mountain Resort", new ArrayList<>());
        Activity activity = new Activity("Sightseeing", "Enjoy the scenic beauty", 50.0, 20, destination);

        assertEquals(20, activity.getAvailableSpaces());
    }

    @Test
    public void testSignUpPassenger() {
        Destination destination = new Destination("Mountain Resort", new ArrayList<>());
        Activity activity = new Activity("Sightseeing", "Enjoy the scenic beauty", 50.0, 20, destination);

        Passenger passenger = new Passenger("Alice", 1, 100.0, PassengerType.STANDARD);

        assertTrue(activity.signUpPassenger(passenger));
    }
}
