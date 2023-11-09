package hometask_6.task1.LinkedList;

import org.apache.log4j.Logger;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

        private static final Logger logger = Logger.getLogger(hometask_6.task1.LinkedList.Main.class);

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            LinkedList<String> linkedList = new LinkedList<>();
            LinkedList<String> linkedList1 = new LinkedList<>();
            LinkedList<String> linkedList2 = new LinkedList<>();
            String word = "";

            while (!word.equalsIgnoreCase("break")){
                logger.info("enter a word");
                word = scanner.nextLine();

                linkedList.add(word);

                if (word.length() > 5) {
                    linkedList1.add(word);
                }

                if (word.startsWith("s")){
                    linkedList2.add(word);
                }

            }

            logger.info(linkedList);
            logger.info(linkedList1);
            logger.info(linkedList2);
        }
    }
