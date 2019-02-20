package ua.lviv.iot.lab_3.models;

import org.junit.jupiter.api.Test;
import ua.lviv.iot.lab_3.TrampolineJumping;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrampolineJumpingTest {

    @Test
    void testTrampolineSize() {
        TrampolineJumping holiday = new TrampolineJumping();
        holiday.setTrampolineSize(500.5);
        assertEquals(500.5, holiday.getTrampolineSize(),
                "There is an error in animatorQuantity setter/getter");

    }
}
