package hometask_14.FactoryPattern;

public class FirstCreator extends Creator{
    @Override
    public Product createProduct() {
        return new FirstProduct();
    }
}
