package hometask_14.StrategyPattern;

public class Main {

    public static void main(String[] args) {

        Context context = new Context();

        context.setStrategy(new FirstStrategy());
        context.executeStrategy();

        context.setStrategy(new SecondStrategy());
        context.executeStrategy();
    }
}
