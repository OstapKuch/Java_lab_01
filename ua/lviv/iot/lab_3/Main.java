package ua.lviv.iot.lab_3;

import ua.lviv.iot.lab_3.managers.HolidayManager;

public final class Main {

    private Main() {

    }
    public static void main(final String[] args) {

        HolidayManager manager = new HolidayManager();
        manager.setHolidays();
        manager.sortHolidaysByPrice(false);
        System.out.println();
        manager.sortHolidaysByDuration(true);
    }
}
