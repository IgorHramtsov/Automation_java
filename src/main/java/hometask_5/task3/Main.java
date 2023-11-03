package hometask_5.task3;

import org.apache.log4j.Logger;

import java.util.Scanner;

public class Main {

    private static final Logger logger = Logger.getLogger(Main.class);
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        while (true) {
            try {
            /*    logger.info("Enter first number");
                double number1 = scanner.nextDouble();

                logger.info("Enter second number");
                double number2 = scanner.nextDouble();

                if (number1 < 0 && number2 < 0) {
                    throw new IllegalArgumentException();
                } else if (number1 == 0 && number2 != 0 || number1 != 0 && number2 == 0) {
                    throw new MyException();
                } else if (number1 == 0 && number2 == 0) {
                    throw new MyException();
                } else if (number1 > 0 && number2 > 0) {
                    throw new MyException();
                }
                logger.info("productOfNumbers = " + number1 * number2);
                logger.info("dividingOfNumbers = " + number1 / number2);
                logger.info("sumOfNumbers = " + number1 + number2);
                logger.info("differeceOfNumbers = " + (number1 - number2));  */


                logger.info("Enter first number");
                double number1 = scanner.nextDouble();

                logger.info("Enter second number");
                double number2 = scanner.nextDouble();

                Methods.Calculation(number1, number2);

            } catch (Exception e) {
                e.printStackTrace();
                // scanner.nextLine();
            }
        }
    }
}