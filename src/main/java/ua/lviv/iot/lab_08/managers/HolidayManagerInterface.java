package ua.lviv.iot.lab_08.managers;

public interface HolidayManagerInterface {

    void findHolidaysByChildrenNumber(int childrenNumber);

    void sortHolidaysByPrice(boolean reverse);

    void sortHolidaysByDuration(boolean reverse);

    void setHolidays();

}
