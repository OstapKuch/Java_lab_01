package ua.lviv.iot.lab_3.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */

public class HolidayForChildrenTest {
    @Test
    void testPriceGetterAndSetter() {
        HolidayForChildren holiday = new Animator();
        holiday.setPrice(200.0);
        assertEquals(200.0, holiday.getPrice(),
                "There is an error in price setter/getter");
    }

    @Test
    void testDurationGetterAndSetter() {
        HolidayForChildren holiday = new Quest();
        holiday.setDuration(1.30);
        assertEquals(1.30, holiday.getDuration(),
                "There is an error in duration setter/getter");
    }

    @Test
    void testChildrenNumberGetterAndSetter() {
        HolidayForChildren holiday = new Quest();
        holiday.setChildrenNumber(5);
        assertEquals(5, holiday.getChildrenNumber(),
                "There is an error in childrenNumber setter/getter");
    }

    @Test
    void testAgeCategoryGetterAndSetter() {
        HolidayForChildren holiday = new Animator();
        holiday.setAgeCategory(12);
        assertEquals(12, holiday.getAgeCategory(),
                "There is an error in ageCategory setter/getter");
    }



}
