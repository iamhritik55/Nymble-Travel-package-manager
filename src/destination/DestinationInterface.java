package destination;

import activity.Activity;
import passenger.Passenger;

public interface DestinationInterface {
	 public void printActivities();
	 public void addEnrolledPassenger(Activity activity, Passenger passenger);
	 public int getEnrolledPassengersCount(Activity activity);
}
