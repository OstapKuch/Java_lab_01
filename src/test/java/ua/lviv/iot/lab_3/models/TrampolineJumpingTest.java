package ua.lviv.iot.lab_3.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrampolineJumpingTest {

    @Test
    void testTrampolineSize() {
        TrampolineJumping holiday = new TrampolineJumping();
        holiday.setTrampolineSize(500.5);
        assertEquals(500.5, holiday.getTrampolineSize(),
                "There is an error in animatorQuantity setter/getter");

    }

    @Test
    void testGetHeaders() {

        TrampolineJumping holiday = new TrampolineJumping();
        assertEquals("price, duration, childrenNumber, ageCategory,"
                        + " trampolineSize",
                holiday.getHeaders(),
                "There is an error in method getHeaders()");

    }

    @Test
    void testToCSV() {
        TrampolineJumping holiday = new TrampolineJumping(500.0,
                4.2, 8,
                14, 4.6);
        assertEquals("500.0, 4.2, 8, 14, 4.6",
                holiday.toCSV(),
                "There is an error in method toCSV()");


    }

}
