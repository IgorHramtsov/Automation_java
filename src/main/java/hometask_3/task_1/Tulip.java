package hometask_3.task_1;

public class Tulip extends Flower{

    int amountOfTulips = 17;
    double discountForBouquet = 0.75;
    public Tulip(String colour, double price) {
        super(colour, price);
    }

    @Override
    public double priceOfBouquet() {
        return MathRound.round10(getPrice()*amountOfTulips*discountForBouquet);
    }

    @Override
    public void getAllInfo() {
        System.out.println(super.toString());;
    }
}
