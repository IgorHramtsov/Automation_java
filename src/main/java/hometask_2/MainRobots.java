package hometask_2;

public class MainRobots {

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
