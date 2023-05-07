package hometask_6.task_3;

import org.apache.log4j.Logger;

import java.util.Scanner;

public class Methods {
    private static final Logger logger = Logger.getLogger(hometask_6.task_2.Main.class);
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {




        while (true) {

            double num1;
            double num2;

            logger.info("Enter 2 numbers");

            try {
                num1 = scanner.nextDouble();
                num2 = scanner.nextDouble();




                if (num1 < 0 && num2 < 0) {
                    throw new IllegalArgumentException();
                } else if ((num1 == 0 && num2 != 0) || (num1 != 0 && num2 == 0)) {
                    throw new ArithmeticException();
                } else if (num1 == 0 && num2 == 0) {
                    throw new IllegalAccessException();
                } else if (num1 > 0 && num2 > 0) {
                    throw new MyException();
                }

                double dividing = num1 / num2;
                double product = num1 * num2;
                double sum = num1 + num2;
                double difference = num1 - num2;

                logger.info("result of dividing = " + dividing);
                logger.info("result of product = " + product);
                logger.info("sum of numbers = " + sum);
                logger.info("difference of numbers = " + difference);
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
