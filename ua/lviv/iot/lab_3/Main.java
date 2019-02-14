package ua.lviv.iot.lab_3;

import ua.lviv.iot.lab_3.managers.HolidayManager;


public class Main {
    public static void main(String[] args) {

        HolidayManager manager = new HolidayManager();
        manager.setHolidays();
        manager.sortHolidaysByPrice(false);
        System.out.println();
        manager.sortHolidaysByDuration(true);
        manager.findHolidaysByChildrenNumber(5);

    }
}
