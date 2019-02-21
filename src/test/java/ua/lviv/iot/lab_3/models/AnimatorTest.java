package ua.lviv.iot.lab_3.models;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AnimatorTest {


    @Test
    void testPriceGetterAndSetter() {
        Animator holiday = new Animator();
        holiday.setAnimatorsQuantity(2);
        assertEquals(2, holiday.getAnimatorsQuantity(),
                "There is an error in animatorQuantity setter/getter");
    }

    @Test
    void testAnimatorGetType() {
        Animator holiday = new Animator(300.0, 2.30,
                5, 8,
                AnimatorType.PHAMTOMIMIST, 2);
        assertTrue(AnimatorType.PHAMTOMIMIST.equals(holiday.getType()),
                "There is an error in animatorType getter");

    }

    @Test
    void testGetHeaders() {

        Animator holiday = new Animator();
        assertEquals("price, duration, childrenNumber, ageCategory,"
                        + " AnimatorType, animatorsQuantity",
                holiday.getHeaders(),
                "There is an error in method getHeaders()");

    }

    @Test
    void testToCSV() {
        Animator holiday = new Animator(300.0, 2.30,
                5, 8,
                AnimatorType.PHAMTOMIMIST, 2);
        assertEquals("300.0, 2.3, 5, 8, PHAMTOMIMIST, 2",
                holiday.toCSV(), "There is an error in method toCSV()");


    }
}
