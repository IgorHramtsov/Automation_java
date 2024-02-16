package hometask_7.task1;

import java.util.Comparator;

public class PurchaseAmountComparator implements Comparator<Purchase> {
    @Override
    public int compare(Purchase o1, Purchase o2) {
        return o1.getAmount().compareTo(o2.getAmount());
    }
}
