package ua.lviv.iot.lab_3.models;

import org.junit.jupiter.api.Test;
import ua.lviv.iot.lab_3.MasterClass;
import ua.lviv.iot.lab_3.MasterClassType;

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
}
