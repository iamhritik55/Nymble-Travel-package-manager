package passenger;

public enum PassengerType {
    /**
    * Types of passengers: 
    *   Standard: 0% discount on purchases
    *   Gold: 10% discount on purchases
    *   Premium: 100% discount on purchases
    */
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
