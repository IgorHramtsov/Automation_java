package hometask_14.FactoryPattern;

public class SecondCreator extends Creator{
    @Override
    public Product createProduct() {
        return new SecondProduct();
    }
}
