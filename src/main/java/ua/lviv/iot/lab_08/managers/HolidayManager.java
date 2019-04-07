package ua.lviv.iot.lab_08.managers;

import ua.lviv.iot.lab_08.models.HolidayForChildren;
import ua.lviv.iot.lab_08.models.Animator;
import ua.lviv.iot.lab_08.models.Quest;
import ua.lviv.iot.lab_08.models.MasterClass;
import ua.lviv.iot.lab_08.models.MasterClassType;
import ua.lviv.iot.lab_08.models.QuestDifficulty;
import ua.lviv.iot.lab_08.models.QuestLocation;
import ua.lviv.iot.lab_08.models.AnimatorType;

import java.util.ArrayList;
import java.util.List;

public class HolidayManager implements HolidayManagerInterface {

    public List<HolidayForChildren> listHolidays =
            new ArrayList<HolidayForChildren>();

    @Override
    public final void findHolidaysByChildrenNumber(final int childrenNumber) {

        listHolidays.stream().filter(holiday -> holiday.getChildrenNumber()
                == childrenNumber).forEach((holiday) ->
                System.out.println(holiday.toString()));

    }

    @Override
    public final void sortHolidaysByPrice(final boolean reverse) {
        int reverser;
        if (reverse) {
            reverser = -1;
        } else {
            reverser = 1;
        }
        listHolidays.sort((HolidayForChildren o1, HolidayForChildren o2)
                -> (int) (reverser * (o1.getPrice() - o2.getPrice())));


    }

    @Override
    public final void sortHolidaysByDuration(final boolean reverse) {

        int reverser;
        if (reverse) {
            reverser = -1;
        } else {
            reverser = 1;
        }
        listHolidays.sort((HolidayForChildren o1, HolidayForChildren o2)
                -> (int) (reverser * (o1.getDuration() - o2.getDuration())));


    }


    @Override
    public final void setHolidays() {

        listHolidays.add(new MasterClass(400.0, 1.30,
                5, 16,
                MasterClassType.CLAY_MOLDING));
        listHolidays.add(new Animator(300.0, 2.30, 5,
                8,
                AnimatorType.PHAMTOMIMIST, 2));
        listHolidays.add(new Quest(800.0, 4.0, 8,
                14, QuestLocation.CITY_CENTRE,
                QuestDifficulty.NORMAL));



    }
}
