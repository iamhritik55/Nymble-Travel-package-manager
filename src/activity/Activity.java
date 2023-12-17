package activity;

import destination.Destination;
import passenger.Passenger;

public class Activity implements ActivityInterface{
    private String name;
    private String description;
    private double cost;
    private int capacity;
    private Destination destination;

    public Activity(String name, String description, double cost, int capacity, Destination destination) {
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.capacity = capacity;
        this.destination = destination;
    }

    public String getName() {
        return name;
    }

    public int getAvailableSpaces() {
    	int enrolledPassengers = destination.getEnrolledPassengersCount(this);
        return capacity - enrolledPassengers;
    }

    public boolean signUpPassenger(Passenger passenger) {
    	if (getAvailableSpaces() > 0 && passenger.payForActivity(this)) {
            destination.addEnrolledPassenger(this, passenger);
            return true;
        }
        return false;
    }

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
}
