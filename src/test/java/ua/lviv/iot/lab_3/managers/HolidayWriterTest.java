package ua.lviv.iot.lab_3.managers;

import org.junit.jupiter.api.Test;

import java.io.IOException;

public class HolidayWriterTest {

    @Test
    void testWriteToFile() {

        HolidayManager manager = new HolidayManager();
        manager.setHolidays();
        HolidayWriter writer = new HolidayWriter();
        try {
            writer.writeToFile(manager.getListHolidays());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
