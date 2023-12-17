package destination;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import activity.Activity;
import passenger.Passenger;

public class Destination implements DestinationInterface{
    private String name;
    private List<Activity> activities;
    private Map<Activity, List<Passenger>> enrolledPassengersMap = new HashMap<>();

    public Destination(String name, List<Activity> activities) {
        this.name = name;
        this.activities = activities;
    }
    
	public List<Activity> getActivities() {
        return activities;
    }

    public String getName() {
        return name;
    }

    public void printActivities() {
    	System.out.println("Activities at " + name + ":");
        for (Activity activity : activities) {
            System.out.println("- " + activity.getName());
        }
    }

    public void addEnrolledPassenger(Activity activity, Passenger passenger) {
        enrolledPassengersMap.computeIfAbsent(activity, k -> new ArrayList<>()).add(passenger);
    }

    public int getEnrolledPassengersCount(Activity activity) {
        return enrolledPassengersMap.getOrDefault(activity, Collections.emptyList()).size();
    }
}
