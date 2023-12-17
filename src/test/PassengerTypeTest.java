package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import passenger.PassengerType;

public class PassengerTypeTest {

    @Test
    public void testApplyDiscount() {
        PassengerType standard = PassengerType.STANDARD;
        PassengerType gold = PassengerType.GOLD;

        assertEquals(100.0, standard.applyDiscount(100.0), 0.001);
        assertEquals(90.0, gold.applyDiscount(100.0), 0.001);
    }
}
