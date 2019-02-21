package ua.lviv.iot.lab_3.managers;

import ua.lviv.iot.lab_3.models.HolidayForChildren;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.File;
import java.util.List;


public class HolidayWriter {

    public void writeToFile(final List<HolidayForChildren> holidays)
            throws IOException {
        File myFile = new File("Holiday_For_Children.csv");

        try (FileOutputStream fos = new FileOutputStream(myFile);
             OutputStreamWriter osw = new OutputStreamWriter(fos);
             BufferedWriter bufWriter = new BufferedWriter(osw);) {

            holidays.stream().forEach(holiday -> {
                try {
                    bufWriter.write(holiday.getHeaders());
                    bufWriter.newLine();
                    bufWriter.write(holiday.toCSV());
                    bufWriter.newLine();
                } catch (IOException exception) {
                    exception.printStackTrace();
                }
            });

        } finally {
            System.out.println(" ");
        }
    }
}



