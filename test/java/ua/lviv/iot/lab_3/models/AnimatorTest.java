package ua.lviv.iot.lab_3.models;

import org.junit.jupiter.api.Test;
import ua.lviv.iot.lab_3.*;


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
}
