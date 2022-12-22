package hometask_3.task_1;

public class Main {

    public static void main(String[] args) {

        Rose rose = new Rose("red", 58.7);
        Tulip tulip = new Tulip("orange", 27.4);
        Lily lily = new Lily("white", 45.9);

        System.out.println("Colour of rose is " + rose.getColour());
        rose.setPrice(52.3);
        System.out.println("New price of rose = " + rose.getPrice() + " uah");
        System.out.println("Price of bouquet of roses = " + rose.priceOfBouquet() + " uah");
        rose.getAllInfo();

        System.out.println("Price of tulip = " + tulip.getPrice() + " uah");
        tulip.setColour("yellow");
        System.out.println("New colour of tulip = " + tulip.getColour());
        System.out.println("Price of bouquet of tulips = " + tulip.priceOfBouquet() + " uah");
        tulip.getAllInfo();

        System.out.println("Colour of rose is " + lily.getColour());
        System.out.println("Price of lily = " + lily.getPrice() + " uah");
        System.out.println("Price of bouquet of lilies = " + lily.priceOfBouquet() + " uah");
        lily.getAllInfo();
    }
}
