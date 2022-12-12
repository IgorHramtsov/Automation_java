package hometask_2.Task2;

public class Main {

    public static void main(String[] args) {
        Robot robot = new Robot();
        CoffeeRobot coffeeRobot = new CoffeeRobot();
        RobotCooker robotCooker = new RobotCooker();
        RobotDancer robotDancer = new RobotDancer();

        robot.work();
        coffeeRobot.work();
        robotDancer.work();
        robotCooker.work();

    }
}
