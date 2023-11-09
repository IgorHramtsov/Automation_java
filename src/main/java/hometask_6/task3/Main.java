package hometask_6.task3;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    private static final Logger logger = Logger.getLogger(hometask_6.task3.Main.class);

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        LinkedList<Notebook> laptopList = new LinkedList<>();

        while (true) {

            Notebook notebook = new Notebook("model", 0);

            logger.info("Enter info about laptop");
            logger.info("model: "); notebook.model = scanner.nextLine();

            if (notebook.model.equalsIgnoreCase("stop")) {
                break;
            }
            logger.info("price: "); notebook.price = scanner.nextDouble();
            scanner.nextLine();



            laptopList.add(notebook);

        }

        logger.info(laptopList);

        Notebook.getMaxPrice(laptopList);
        Notebook.printMacbooks(laptopList);
        logger.info("All notebooks: ");
        Notebook.printAllNotebooksAndSale(laptopList);
    }

}
