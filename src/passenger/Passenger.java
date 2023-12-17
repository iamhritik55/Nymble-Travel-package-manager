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
    /**
    * Checks if user's balance is enough to purchase product of given amount
    */
    private boolean hasSufficientBalance(double amount) {
        return balance >= amount;
    }
    /**
    * Registers an user for an activity and updates balance
    */
    public boolean payForActivity(Activity activity) {
        double actualPrice = passengerType.applyDiscount(activity.getCost());
        if (hasSufficientBalance(actualPrice)) {
            activities.add(activity);
            balance -= actualPrice;
            return true;
        }
        return false;
    }
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Passenger Number: " + passengerNumber);

        if (balance >= 0) {
            System.out.println("Balance: " + balance);
        } else {
            System.out.println("Balance: Not Applicable");
        }

        if (!activities.isEmpty()) {
            System.out.println("Activities signed up for:");
            for (Activity activity : activities) {
                System.out.println("- Activity: " + activity.getName());
                System.out.println("  Destination: " + activity.getDestination().getName());
                double paidPrice = passengerType.applyDiscount(activity.getCost());
                System.out.println("  Price Paid: " + paidPrice);
            }
        } else {
            System.out.println("No activities signed up for.");
        }
    }
}