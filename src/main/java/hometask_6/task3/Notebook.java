package hometask_6.task3;

import java.util.LinkedList;

public class Notebook {

    public String model;
    public double price;

    public static double maxPrice = 0;

    public Notebook(String model, double price){
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public static void getMaxPrice (LinkedList<Notebook> laptopList){
        for (Notebook notebook:laptopList) {
            if (maxPrice < notebook.getPrice()) {
                maxPrice = notebook.getPrice();
            }
        }
            for (Notebook notebook:laptopList) {
            if (notebook.getPrice() == maxPrice){
                System.out.println("max price model: " + notebook.getModel());
        }
        }
        System.out.println("max price = " + maxPrice);
    }

    public static void printMacbooks (LinkedList<Notebook> laptopList) {
        for (Notebook notebook:laptopList) {
            if (notebook.model.contains("macbook")){
                System.out.println("Macbooks: " + notebook);
            }
        }
    }

    public static void printAllNotebooksAndSale (LinkedList<Notebook> laptopList){
        for (Notebook notebook:laptopList) {
            if (notebook.price > 2000){
                notebook.price = notebook.price * 0.9;
                System.out.println(notebook + " ON SALE");
                }
            else {
                System.out.println(notebook);
            }
            }
        }

    @Override
    public String toString() {
        return "Notebook{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
