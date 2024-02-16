package hometask_7.task1;

import org.apache.log4j.Logger;

import java.sql.Array;
import java.util.*;

public class Main {

    private static final Logger logger = Logger.getLogger(Main.class);
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        LinkedList<Purchase> purchaseList = new LinkedList<>();

        while (true) {

            Purchase purchase = new Purchase("name", 0);

            logger.info("Enter info about purchase");
            logger.info("name: ");
            purchase.name = scanner.nextLine();

            if (purchase.name.equalsIgnoreCase("stop")) {
                break;
            }
            logger.info("amount: ");
            purchase.amount = scanner.nextInt();

            purchaseList.add(purchase);
            scanner.nextLine();
        }

        Set<Purchase> purchaseSet1 = new HashSet<>();
        for (Purchase purchase: purchaseList) {
            purchaseSet1.add(purchase);
        }

        Set<Purchase> purchaseSet2 = new LinkedHashSet<>();
        for (Purchase purchase: purchaseList) {
            purchaseSet2.add(purchase);
        }

        Set<Purchase> purchaseSet3sortedByName = new TreeSet<>();
        for (Purchase purchase: purchaseList) {
            purchaseSet3sortedByName.add(purchase);
        }

        Set<Purchase> purchaseSet4sortedByAmount = new TreeSet<>(new PurchaseAmountComparator());
        for (Purchase purchase: purchaseList) {
            purchaseSet4sortedByAmount.add(purchase);
        }

        logger.info("HashSet: " + purchaseSet1);
        logger.info("LinkedHashSet: " + purchaseSet2);
        logger.info("TreeSet by name: " + purchaseSet3sortedByName);
        logger.info("TreeSet by name: " + purchaseSet4sortedByAmount);
    }
}
