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
    /**
    * Prints Itinerary of the package which includes name of destination and activities at each destination
    */
    public void printItinerary() {
        System.out.println("Travel Package: " + name);
        for (Destination destination : itinerary) {
            System.out.println("Destination: " + destination.getName());
            destination.printActivities();
        }
    }
    /**
    * Prints list of passengers in the travel package including passenger's name and number
    */
    public void printPassengerList() {
        System.out.println("Passenger List for " + name);
        System.out.println("Capacity: " + passengerCapacity);
        System.out.println("Number of Passengers enrolled: " + passengers.size());
        for (Passenger passenger : passengers) {
            System.out.println("- " + passenger.getName() + " (Passenger #" + passenger.getPassengerNumber() + ")");
        }
    }
    /**
    * Registers a passenger to the package
    */
    public boolean addPassenger(Passenger passenger) {
        if (passengers.size() < passengerCapacity) {
            passengers.add(passenger);
            return true;
        }
        return false;
    }
    /**
    * Removes a passenger from the package
    */
    public void removePassenger(Passenger passenger) {
        passengers.remove(passenger);
    }
    /**
    * Prints Available activities in the package for each destination
    */
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

