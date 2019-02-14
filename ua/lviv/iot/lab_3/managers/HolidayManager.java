package ua.lviv.iot.lab_3.managers;

import ua.lviv.iot.lab_3.models.*;

import java.util.ArrayList;
import java.util.List;

public class HolidayManager implements HolidayManagerInterface {

    private List<HolidayForChildren> listHolidays = new ArrayList<HolidayForChildren>();

    @Override
    public void findHolidaysByChildrenNumber(int childrenNumber) {

        listHolidays.stream().filter(p -> p.getChildrenNumber() == childrenNumber).forEach((holiday) -> System.out.println(holiday.toString()));

    }

    @Override
    public void sortHolidaysByPrice(boolean reverse) {

        int reverser = reverse ? -1 : 1;
        listHolidays.sort((HolidayForChildren o1, HolidayForChildren o2) -> (int) (reverser * (o1.getPrice() - o2.getPrice())));
        listHolidays.forEach((holiday) -> System.out.println(holiday.getPrice()));

    }

    @Override
    public void sortHolidaysByDuration(boolean reverse) {

        int reverser = reverse ? -1 : 1;
        listHolidays.sort((HolidayForChildren o1, HolidayForChildren o2) -> (int) (reverser * (o1.getDuration() - o2.getDuration())));
        listHolidays.forEach((holiday) -> System.out.println(holiday.getDuration()));

    }


    @Override
    public void setHolidays() {

        listHolidays.add(new Animator(300.0, 2.30, 5, 8, AnimatorType.PHAMTOMIMIST, 2));
        listHolidays.add(new Quest(800.0, 4.0, 8, 14, QuestLocation.CITY_CENTRE, QuestDifficulty.NORMAL));
        listHolidays.add(new MasterClass(400.0, 1.30, 5, 16, MasterClassType.CLAY_MOLDING));
        listHolidays.add(new TrampolineJumping(650.0, 4.30, 9, 10, 4.5));

    }
}