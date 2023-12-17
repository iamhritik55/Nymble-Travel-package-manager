package test;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

import activity.Activity;
import destination.Destination;
import passenger.Passenger;
import passenger.PassengerType;

public class PassengerTest {

    @Test
    public void testPayForActivity() {
        PassengerType gold = PassengerType.GOLD;
        Passenger passenger = new Passenger("Bob", 2, 200.0, gold);

        Activity activity = new Activity("Hiking", "Explore the trails", 30.0, 15, new Destination("Forest Trails", new ArrayList<>()));
        
        assertTrue(passenger.payForActivity(activity));
    }
}

