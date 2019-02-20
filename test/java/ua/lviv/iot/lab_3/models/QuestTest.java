package ua.lviv.iot.lab_3.models;

import org.junit.jupiter.api.Test;
import ua.lviv.iot.lab_3.Quest;
import ua.lviv.iot.lab_3.QuestDifficulty;
import ua.lviv.iot.lab_3.QuestLocation;


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
}
