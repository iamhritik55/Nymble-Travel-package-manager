package passenger;

import java.util.ArrayList;
import java.util.List;

import activity.Activity;

public class Passenger implements PassengerInterface{
    private String name;
    private int passengerNumber;
    private double balance;
    private List<Activity> activities;
    private PassengerType passengerType;

    public Passenger(String name, int passengerNumber, double balance, PassengerType passengerType) {
        this.name = name;
        this.passengerNumber = passengerNumber;
        this.balance = balance;
        this.passengerType = passengerType;
        this.activities = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getPassengerNumber() {
        return passengerNumber;
    }

    public double getBalance() {
        return balance;
    }

    public boolean addActivity(Activity activity) {
        if (activities.contains(activity) || !hasSufficientBalance(activity.getCost())) {
            return false;
        }
        
        double actualPrice = passengerType.applyDiscount(activity.getCost());
        activities.add(activity);
        balance -= actualPrice;
        return true;
    }

    private boolean hasSufficientBalance(double amount) {
        return balance >= amount;
    }

    public boolean payForActivity(Activity activity) {
        double actualPrice = passengerType.applyDiscount(activity.getCost());
        if (hasSufficientBalance(actualPrice)) {
            activities.add(activity);
            balance -= actualPrice;
            return true;
        }
        return false;
    }
}