package hometask_6.task2;

import org.apache.log4j.Logger;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static final Logger logger = Logger.getLogger(hometask_6.task2.Main.class);

    private static Months month;
    private static Seasons season;

    public static void evenDaysMonths() {
        for (Months month : Months.values()) {
            if (month.getDays() % 2 == 0) {
                logger.info(month.name());
            }
        }
    }

    public static void oddDaysMonths() {
        for (Months month : Months.values()) {
            if (month.getDays() % 2 != 0) {
                logger.info(month.name());
            }
        }
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        logger.info("enter a month");
        String word = scanner.nextLine();


        for (Months month : Months.values()) {
            if (word.equalsIgnoreCase(month.name())) {
                logger.info("exist");
                logger.info(month.getSeason().name());

                logger.info(month.getDays());

                logger.info("odd or even days in month");
                if (month.getDays() % 2 == 0) {
                    logger.info("even days");
                } else {
                    logger.info("odd days");
                }
            }
            }

            logger.info("evenDaysMonths: ");
            evenDaysMonths();
            logger.info("oddDaysMonths: ");
            oddDaysMonths();

        }
    }


