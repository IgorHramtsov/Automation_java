package hometask_14.FactoryPattern;

public class Main {

    public static void main(String[] args) {

        Creator firstCreator  = new FirstCreator();
        Creator secondCreator = new SecondCreator();

        // Виклик someOperation, який створює продукт і викликає його метод use
        System.out.println("Creator 1:");
        firstCreator.someOperation();

        System.out.println("Creator 2:");
        secondCreator.someOperation();
    }
}
