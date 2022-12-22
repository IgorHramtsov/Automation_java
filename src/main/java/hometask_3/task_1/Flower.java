package hometask_3.task_1;

public abstract class Flower {

    private String colour;
    private double price;

    public Flower(String colour, double price) {
        this.colour = colour;
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "colour='" + colour + '\'' +
                ", price=" + price +
                '}';
    }

    public abstract double priceOfBouquet();

    public abstract void getAllInfo();
}
