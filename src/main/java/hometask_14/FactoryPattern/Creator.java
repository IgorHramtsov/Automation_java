package hometask_14.FactoryPattern;

abstract class Creator {

    public abstract Product createProduct();

    public void someOperation() {
        Product product = createProduct();
        product.use();
    }
}
