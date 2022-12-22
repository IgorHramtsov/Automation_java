package hometask_3.task_1;

public class Lily extends Flower{

    int amountOfLilies = 9;
    double discountForBouquet = 0.9;
    public Lily(String colour, double price) {
        super(colour, price);
    }
    @Override
    public double priceOfBouquet() {
        return MathRound.round10(getPrice()*amountOfLilies*discountForBouquet);
    }

    @Override
    public void getAllInfo() {
        System.out.println(super.toString());
    }
}
