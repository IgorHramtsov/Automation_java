package hometask_7.task2;

import java.util.concurrent.CompletionService;
import java.lang.Comparable;

public class Car implements Comparable<Car> {

    public String model;
    public Integer price;

    public Car(String model, Integer price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Car o) {
        return this.model.compareTo(o.model);
    }
}



