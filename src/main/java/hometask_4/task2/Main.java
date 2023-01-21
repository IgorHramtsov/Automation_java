package hometask_4.task2;

import org.apache.log4j.Logger;

import java.util.Scanner;

public class Main {

    private static final Logger logger = Logger.getLogger(hometask_4.task2.Main.class);
    static Scanner scanner = new Scanner(System.in);
    public static void LastCharOfEnteredText(String enteredText) {

        int length = enteredText.length();
        int indexLastChar = length - 1;
        logger.info("index of last char is " + indexLastChar);
        logger.info("last char of entered text is " + "'" + enteredText.charAt(indexLastChar) + "'");
    }

    public static void isEnteredTextEndsWith(String enteredText, String endsWithText) {
        if(enteredText.endsWith(endsWithText)){
            logger.info("you entered: " + enteredText + "  - And this text ends with: " + "'"+ endsWithText +"'");
        }
        else {
            logger.info("you entered: " + enteredText + "  - And this text DOES NOT ends with: " + "'"+ endsWithText +"'");
        }
    }

    public static void isEnteredTextStartsWith(String enteredText, String startsWithText) {
        if(enteredText.startsWith(startsWithText)){
            logger.info("you entered: " + enteredText + " - And this text starts with: " + "'"+ startsWithText +"'");
        }
        else {
            logger.info("you entered: " + enteredText + " - And this text DOES NOT starts with: " + "'"+ startsWithText +"'");
        }
    }

    public static void containJava(String enteredText) {
        if (enteredText.contains("Java")){
            logger.info("Does entered text contains 'Java' ? -  An answer is: " + enteredText.contains("Java"));
        }
        else {
            logger.info("Does entered text contains 'Java' ? -  An answer is: " + enteredText.contains("Java"));
        }
    }


    public static void main(String[] args) {

        logger.info("enter some text");

        String enteredText = scanner.nextLine();

        logger.info("You have entered: " + enteredText);

        LastCharOfEnteredText(enteredText);

        isEnteredTextEndsWith(enteredText, "!!!");

        isEnteredTextStartsWith(enteredText, "I like");

        containJava(enteredText);

        logger.info("Replace 'a' to 'o', changed text is: " + "'" + enteredText.replace("a", "o") + "'");

        logger.info("change string to upper case: " + enteredText.toUpperCase());

        logger.info("change string to lower case: " + enteredText.toLowerCase());

        logger.info("position of substring 'Java' is between " + enteredText.indexOf("J") + " and " + enteredText.lastIndexOf("a") + " indexes");

        logger.info("cuted line: " + enteredText.substring(7, 11));

    }
}
