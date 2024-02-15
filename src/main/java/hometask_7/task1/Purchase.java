package hometask_7.task1;

import java.util.concurrent.CompletionService;
import java.lang.Comparable;

public class Purchase implements Comparable <Purchase> {

    public String name;
    public Integer amount;

    public Purchase(String name, Integer amount) {
        this.name = name;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public int compareTo(Purchase o) {
        return this.name.compareTo(o.name);
    }
}
