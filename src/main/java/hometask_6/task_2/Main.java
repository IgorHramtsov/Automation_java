package hometask_6.task_2;

import org.apache.log4j.Logger;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static final Logger logger = Logger.getLogger(hometask_6.task_2.Main.class);
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            logger.info("Enter 2 numbers");

            try {
                int enteredNumber1 = scanner.nextInt();
                int enteredNumber2 = scanner.nextInt();

                int sum = + enteredNumber1 + enteredNumber2;

                logger.info("Sum = " + sum);
            } catch (Exception e) {
                logger.info("is not an integer");
                scanner.nextLine();
            }
        }
    }
}
