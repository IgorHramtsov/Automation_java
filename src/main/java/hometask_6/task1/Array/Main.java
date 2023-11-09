package hometask_6.task1.Array;

import org.apache.log4j.Logger;

import java.util.Scanner;

public class Main {

    private static final Logger logger = Logger.getLogger(hometask_6.task1.Array.Main.class);

   public static void printAllWords(String[] words, int wordCount) {
        for (int i = 0; i < wordCount; i++) {
            logger.info("all words: " + words[i]);
        }
    }

    public static void printMoreThan5Symbols(String[] words, int wordCount) {
        for (int i = 0; i < wordCount; i++) {
            if (words[i].length() > 5) {
                logger.info("more than 5 symbols: " + words[i]);
            }
        }
    }

    public static void printWordsStartsWithS(String[] words, int wordCount) {
        for (int i = 0; i < wordCount; i++) {
            if (words[i].startsWith("s")) {
                logger.info("starts with s: " + words[i]);
            }
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String word = "";
        String[] words = new String[100];
        int wordCount = 0;

        while (!word.equalsIgnoreCase("break")){
            logger.info("enter a word");
            word = scanner.nextLine();
            words[wordCount] = word;
            wordCount ++;
        }

        printAllWords(words, wordCount);
        printMoreThan5Symbols(words, wordCount);
        printWordsStartsWithS(words, wordCount);
    }

}