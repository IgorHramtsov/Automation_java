package hometask_3.task_3;

import hometask_3.task_3.second.MyCalculator;

public class Main {

    public static void main(String[] args) {


        MyCalculator myCalculator = new MyCalculator(28.3, 15.6);

        System.out.println("Sum of nimbers = " + myCalculator.plus());
        System.out.println("Difference of numbers = " + myCalculator.minus());
        System.out.println("Product of numbers = " + myCalculator.multiply());
        System.out.println("Division of numbers = " + myCalculator.divide());

    }
}