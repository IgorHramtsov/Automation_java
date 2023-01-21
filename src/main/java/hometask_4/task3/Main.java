package hometask_4.task3;

import org.apache.log4j.Logger;

import java.util.Scanner;

public class Main {
    private static final Logger logger = Logger.getLogger(hometask_4.task3.Main.class);
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String word = "";

        String minLengthWord = "                                                                                       ";
        // set certain value for minLengthWord because dont know how to solve this task
        String maxLengthWord = "";

        int numberOfWord = 0;
        int numberOfMaxLengthWord = 0;
        int numberOfMinLengthWord = 0;

        while (!word.equalsIgnoreCase("stop")) {
            logger.info("enter the word");
            word = scanner.nextLine();
            numberOfWord = numberOfWord + 1;
            logger.info("You have entered: " + "'" + word + "'");
            logger.info("length of entered word = " + word.length());
            logger.info("The serial number of this word = " + numberOfWord);


            if (word.length() > maxLengthWord.length()) {
                maxLengthWord = word;
                numberOfMaxLengthWord = numberOfWord;
            }

            if (word.length() < minLengthWord.length()){
                minLengthWord = word;
                numberOfMinLengthWord = numberOfWord;
            }




            logger.info("The maxLengthWord = " + maxLengthWord.length());
            logger.info("The minLengthWord = " + minLengthWord.length());
            logger.info("The serial number of maxLengthWord = " + numberOfMaxLengthWord);
            logger.info("The maxLengthWord is: " + maxLengthWord);
            logger.info("The serial number of minLengthWord = " + numberOfMinLengthWord);
            logger.info("The minLengthWord is: " + minLengthWord);
            
        }
    }
}
