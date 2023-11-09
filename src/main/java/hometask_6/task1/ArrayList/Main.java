package hometask_6.task1.ArrayList;

import org.apache.log4j.Logger;

import java.util.*;

public class Main {

    private static final Logger logger = Logger.getLogger(hometask_6.task1.ArrayList.Main.class);

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<String> arrayList1 = new ArrayList<>();
        ArrayList<String> arrayList2 = new ArrayList<>();
        String word = "";

        while (!word.equalsIgnoreCase("break")){
            logger.info("enter a word");
            word = scanner.nextLine();

            arrayList.add(word);

            if (word.length() > 5) {
                arrayList1.add(word);
            }

            if (word.startsWith("s")){
                arrayList2.add(word);
            }

        }

        logger.info(arrayList);
        logger.info(arrayList1);
        logger.info(arrayList2);
    }
}
