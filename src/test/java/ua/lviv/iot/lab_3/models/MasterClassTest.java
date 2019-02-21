package ua.lviv.iot.lab_3.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MasterClassTest {

    @Test
    void testPriceGetterAndSetter() {
        MasterClass holiday = new MasterClass(400.0, 1.30,
                5, 16,
                MasterClassType.CLAY_MOLDING);

        assertTrue(MasterClassType.CLAY_MOLDING.equals(holiday.getType()),
                "There is an error in MasterClassType getter");

    }

    @Test
    void testGetHeaders() {

        MasterClass holiday = new MasterClass();
        assertEquals("price, duration, childrenNumber, ageCategory,"
                        + " MasterClassType",
                        holiday.getHeaders(),
                "There is an error in method getHeaders()");

    }

    @Test
    void testToCSV() {
        MasterClass holiday = new MasterClass(400.0, 1.30,
                5, 16,
                MasterClassType.CLAY_MOLDING);
        assertEquals("400.0, 1.3, 5, 16, CLAY_MOLDING", holiday.toCSV(),
                "There is an error in method toCSV()");


    }

}
