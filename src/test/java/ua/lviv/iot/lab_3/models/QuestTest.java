package ua.lviv.iot.lab_3.models;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class QuestTest {

    @Test
    void testQuestLocationGetter() {
        Quest holiday = new Quest(4800.0, 4.0, 8,
                14,
                QuestLocation.CITY_CENTRE, QuestDifficulty.NORMAL);

        assertTrue(QuestLocation.CITY_CENTRE.equals(holiday.getLocation()),
                "There is an error in QuestLocation getter");

    }

    @Test
    void testQuestDifficultyGetter() {
        Quest holiday = new Quest(4800.0, 4.0, 8,
                14,
                QuestLocation.CITY_CENTRE, QuestDifficulty.NORMAL);

        assertTrue(QuestDifficulty.NORMAL.equals(holiday.getDifficulty()),
                "There is an error in QuestLocation getter");

    }

    @Test
    void testGetHeaders() {

        Quest holiday = new Quest();
        assertEquals("price, duration, childrenNumber, ageCategory,"
                        + " QuestLocation, QuestDifficulty",
                holiday.getHeaders(),
                "There is an error in method getHeaders()");

    }

    @Test
    void testToCSV() {
        Quest holiday = new Quest(4800.0, 4.0, 8,
                14,
                QuestLocation.CITY_CENTRE, QuestDifficulty.NORMAL);
        assertEquals("4800.0, 4.0, 8, 14, CITY_CENTRE, NORMAL",
                holiday.toCSV(),
                "There is an error in method toCSV()");


    }

}
