package hometask_5.task2;

import org.apache.log4j.Logger;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
        private static final Logger logger = Logger.getLogger(Main.class);
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            int number1;
            int number2;
            int sum;

            while (true) {
                try {
                    logger.info("enter first number: ");
                    number1 = scanner.nextInt();
                    logger.info("enter second number: ");
                    number2 = scanner.nextInt();

                    sum = number1 + number2;

                    logger.info("Sum of numbers = " + sum);
                } catch (InputMismatchException e) {
                    e.printStackTrace();
                    logger.info("it is not integer");
                    scanner.nextLine();
                }
            }
        }
    }
