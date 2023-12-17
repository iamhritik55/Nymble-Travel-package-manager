package passenger;

public enum PassengerType {
    STANDARD(0),
    GOLD(0.1),
    PREMIUM(1);

    private final double discount; 
	
    PassengerType(double discount) {
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }
	public double applyDiscount(double cost) {
		return cost * (1 - discount);
	}
}
