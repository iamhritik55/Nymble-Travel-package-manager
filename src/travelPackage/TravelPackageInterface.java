package travelPackage;

import passenger.Passenger;

public interface TravelPackageInterface {
	public void printItinerary();
	public void printPassengerList();
	public boolean addPassenger(Passenger passenger);
	public void removePassenger(Passenger passenger);
}
