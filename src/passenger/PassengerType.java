package passenger;

public enum PassengerType {
    STANDARD(0),
    GOLD(0.1),
    PREMIUM(1);

    private final double discount; // Value associated with each type

    // Constructor to initialize the value
    PassengerType(double discount) {
        this.discount = discount;
    }

    // Method to get the value associated with the type
    public double getDiscount() {
        return discount;
    }
	public double applyDiscount(double cost) {
		return cost * (1 - discount);
	}
}
// public class PassengerType {
// 	private String passengerNum;
// 	private String typeName;
//     private double discount;

//     public PassengerType(String typeName, double discount) {
//         this.typeName = typeName;
//         this.discount = discount;
//     }


    
//     public String getPassengerNum() {
// 		return passengerNum;
// 	}

// 	public void setPassengerNum(String passengerNum) {
// 		this.passengerNum = passengerNum;
// 	}

// 	public String getTypeName() {
// 		return typeName;
// 	}

// 	public void setTypeName(String typeName) {
// 		this.typeName = typeName;
// 	}

// }
