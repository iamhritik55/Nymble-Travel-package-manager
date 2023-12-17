package test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import destination.Destination;

public class DestinationTest {

    @Test
    public void testGetName() {
        Destination destination = new Destination("Mountain Resort",  new ArrayList<>());

        assertEquals("Mountain Resort", destination.getName());
    }

}

