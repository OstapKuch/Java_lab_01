package ua.lviv.iot.lab_3.managers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.lab_3.models.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class HolidayManagerTest {

    private HolidayManager manager;
    @BeforeEach
    void createTestList() {

    this.manager = new HolidayManager();

    }

    @Test
    void testFindHolidaysByChildrenNumber() {


        List<HolidayForChildren> listHolidays =
                new ArrayList<HolidayForChildren>();
        manager.findHolidaysByChildrenNumber(5);



        manager.getListHolidays().stream().filter(holiday
                -> holiday.getChildrenNumber()
                == 5).forEach(holiday -> assertEquals(5,
                holiday.getChildrenNumber(),
                "Error in method FindHolidaysByChildrenNumber"));

    }


    @Test
    void testSortHolidaysByDuration() {

        HolidayManager manager = new HolidayManager();

        manager.setHolidays();


        List<HolidayForChildren> sortedlistHolidays
                = new ArrayList<HolidayForChildren>();

        sortedlistHolidays.add(new Animator(300.0, 1.30,
                5, 8,
                AnimatorType.PHAMTOMIMIST, 2));
        sortedlistHolidays.add(new MasterClass(400.0, 2.30,
                5, 16,
                MasterClassType.CLAY_MOLDING));
        sortedlistHolidays.add(new Quest(800.0, 4.0,
                8, 14,
                QuestLocation.CITY_CENTRE,
                QuestDifficulty.NORMAL));
        manager.sortHolidaysByDuration(false);
        for (int i = 0; i < 3; i++) {
            assertEquals(manager.getListHolidays().get(i).getDuration(),
                    sortedlistHolidays.get(i).getDuration(),
                    "Error lists are not equal");
        }

        manager.sortHolidaysByDuration(true);


    }

    @Test
    void testSortHolidaysByPrice() {

        HolidayManager manager = new HolidayManager();
        manager.setHolidays();


        List<HolidayForChildren> sortedlistHolidays =
                new ArrayList<HolidayForChildren>();

        sortedlistHolidays.add(new Animator(300.0, 1.30,
                5, 8,
                AnimatorType.PHAMTOMIMIST, 2));
        sortedlistHolidays.add(new MasterClass(400.0, 2.30,
                5, 16,
                MasterClassType.CLAY_MOLDING));
        sortedlistHolidays.add(new Quest(800.0, 4.0,
                8, 14,
                QuestLocation.CITY_CENTRE,
                QuestDifficulty.NORMAL));
        int reverser = 1;
        manager.sortHolidaysByPrice(false);
        for (int i = 0; i < 3; i++) {
            assertEquals(manager.getListHolidays().get(i).getPrice(),
                    sortedlistHolidays.get(i).getPrice(),
                    "Error lists are not equal");
        }


    }
}
