
import java.util.ArrayList;
import java.util.List;

import activity.Activity;
import destination.Destination;
import passenger.Passenger;
import passenger.PassengerType;
import travelPackage.TravelPackage;


public class Main {
    public static void main(String[] args) {
        
        // Create activities
        Activity activity1 = new Activity("Sightseeing", "Enjoy the scenic beauty", 50.0, 20, null);
        Activity activity2 = new Activity("Hiking", "Explore the trails", 30.0, 15, null);
        Activity activity3 = new Activity("Lunch", "Enjoy the food", 30.0, 15, null);
        Activity activity4 = new Activity("Photoshoot", "Capture amazing moments", 30.0, 15, null);

        // Create destinations
        List<Activity> dest_1_activities = new ArrayList<>();
        List<Activity> dest_2_activities = new ArrayList<>();

        dest_1_activities.add(activity1);
        dest_1_activities.add(activity2);
        dest_2_activities.add(activity3);
        dest_2_activities.add(activity4);

        Destination destination1 = new Destination("Mountain Resort", dest_1_activities);
        activity1.setDestination(destination1);
        activity2.setDestination(destination1);
        Destination destination2= new Destination("Water Fall", dest_2_activities);
        activity3.setDestination(destination2);
        activity4.setDestination(destination2);
        // Create passengers
        Passenger passenger1 = new Passenger("Alice", 1, 100.0, PassengerType.STANDARD);
        activity1.signUpPassenger(passenger1);
        Passenger passenger2 = new Passenger("Bob", 2, 200.0, PassengerType.GOLD);
        activity2.signUpPassenger(passenger2);
        Passenger passenger3 = new Passenger("Charlie", 3, 0.0, PassengerType.PREMIUM);
        activity3.signUpPassenger(passenger3);
        // Create itinerary
        List<Destination> itinerary = new ArrayList<>();
        itinerary.add(destination1);
        itinerary.add(destination2);
        TravelPackage travelPackage = new TravelPackage("Mountain Adventure", 50, itinerary);

        // Add passengers to travel package
        travelPackage.addPassenger(passenger1);
        travelPackage.addPassenger(passenger2);
        travelPackage.addPassenger(passenger3);

        // Print travel package details
        travelPackage.printItinerary();
        travelPackage.printPassengerList();
        // Print details of individual passengers
        System.out.println("Details of individual passengers: ");
        passenger1.printDetails();
        passenger2.printDetails();
        passenger3.printDetails();

        // Print details of available activities
        System.out.println("Details of available activities: ");
        travelPackage.printAvailableActivities();
    }
}