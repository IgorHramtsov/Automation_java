package hometask_11_AnnotationsPractice;

import org.apache.log4j.Logger;

import java.time.LocalDate;
import java.time.LocalTime;

public class Time {

    private static final Logger logger = Logger.getLogger(hometask_11_AnnotationsPractice.Time.class);
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();

        logger.info(localDate);
        logger.info(localTime);
        System.out.printf("Date: %s, Time: %s", localDate, localTime);
    }
}
