package hometask_3.task_1;

public class Rose extends Flower{

    int amountOfRoses = 11;
    double discountForBouquet = 0.85;

    public Rose(String colour, double price){
        super(colour, price);
    }

    @Override
    public double priceOfBouquet() {
        return MathRound.round10(getPrice()*amountOfRoses*discountForBouquet);
    }

    @Override
    public void getAllInfo() {
        System.out.println(super.toString());
    }
}
