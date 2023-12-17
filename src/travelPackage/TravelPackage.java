package travelPackage;

import java.util.ArrayList;
import java.util.List;

import activity.Activity;
import destination.Destination;
import passenger.Passenger;

public class TravelPackage implements TravelPackageInterface{
    private String name;
    private int passengerCapacity;
    private List<Destination> itinerary;
    private List<Passenger> passengers;

    public TravelPackage(String name, int passengerCapacity, List<Destination> itinerary) {
        this.name = name;
        this.passengerCapacity = passengerCapacity;
        this.itinerary = itinerary;
        this.passengers = new ArrayList<>();
    }

    public void printItinerary() {
        System.out.println("Travel Package: " + name);
        for (Destination destination : itinerary) {
            System.out.println("Destination: " + destination.getName());
            destination.printActivities();
        }
    }

    public void printPassengerList() {
        System.out.println("Passenger List for " + name);
        System.out.println("Capacity: " + passengerCapacity);
        System.out.println("Number of Passengers enrolled: " + passengers.size());
        for (Passenger passenger : passengers) {
            System.out.println("- " + passenger.getName() + " (Passenger #" + passenger.getPassengerNumber() + ")");
        }
    }
    public boolean addPassenger(Passenger passenger) {
        if (passengers.size() < passengerCapacity) {
            passengers.add(passenger);
            return true;
        }
        return false;
    }

    public void removePassenger(Passenger passenger) {
        passengers.remove(passenger);
    }
    public void printAvailableActivities() {
        System.out.println("Available Activities in Travel Package '" + name + "':");
        for (Destination destination : itinerary) {
            System.out.println("Destination: " + destination.getName());
            for (Activity activity : destination.getActivities()) {
                int availableSpaces = activity.getAvailableSpaces();
                if (availableSpaces > 0) {
                    System.out.println("- Activity: " + activity.getName());
                    System.out.println("  Available Spaces: " + availableSpaces);
                }
            }
        }
    }
}

