package hometask_5.task1;

import org.apache.log4j.Logger;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

        private static final Logger logger = Logger.getLogger(Main.class);
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            int number;

            while (true) {
                try {
                    logger.info("enter a number: ");
                    number = scanner.nextInt();

                    if (number % 2 == 0) {
                        logger.info("it is even number");
                    } else {
                        logger.info("it is odd number");
                    }
                } catch (InputMismatchException e) {
                    e.printStackTrace();
                    logger.info("it is not integer");
                    scanner.nextLine();
                }
            }
        }
    }

