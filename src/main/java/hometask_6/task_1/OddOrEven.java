package hometask_6.task_1;

import org.apache.log4j.Logger;

import java.util.Scanner;

public class OddOrEven {


    private static final Logger logger = Logger.getLogger(OddOrEven.class);
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        while (true) {
            System.out.println("Enter a number");

            try {
                int enteredNumber = scanner.nextInt();

                if (enteredNumber % 2 == 0) {
                    System.out.println(enteredNumber + " is even");
                } else {
                    System.out.println(enteredNumber + " is odd");
                }
            } catch (Exception e) {
                System.out.println("is not an integer");
                scanner.nextLine();
            }
        }
    }
}
