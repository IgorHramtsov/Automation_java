package hometask_3.hometask2_task3;
public class Main {

    public static void main(String[] args) {

        Wheel wheel = new Wheel(0.7, 0.25);
        SteeringWheel steeringWheel = new SteeringWheel(0.27);
        Body body = new Body(0.87, "yellow");
        Passenger passenger = new Passenger("Bob", 27, 1.83);
        Car car1 = new Car(287.83,217.25,"black", new Wheel(0.7,0.25),
                new SteeringWheel(0.27), new Body(0.87, "yellow"),
                new Passenger("Bob", 27, 1.83));

        Car car2 = new Car(287.83,217.25,"black", new Wheel(0.7,0.25),
                new SteeringWheel(0.27), new Body(0.87, "yellow"));


        System.out.println(car1);
        System.out.println(car2);

        wheel.setDiametrOfWheel(0.58);
        System.out.println("new diametr of wheel = " + wheel.getDiametrOfWheel());
        System.out.println("width of wheel = " + wheel.getWidthOfWheel());

        System.out.println("changed diametr of wheel = " + wheel.changeOfWheel());
        System.out.println("changed width of wheel = " + wheel.changeOfWheel1());

        steeringWheel.setRadiusOfStWheel(0.31);
        System.out.println("new radius of steering wheel = " + steeringWheel.getRadiusOfStWheel());
        System.out.println("changed radius of wheel is = " + steeringWheel.changeOfRadiusStWheel());

        body.setColourOfBody("blue");
        System.out.println("new colour of body is " + body.getColourOfBody());
        body.setHeightOfBody(0.94);
        System.out.println("new height of body = " + body.getHeightOfBody());
        body.changeHeightOfBody();

        passenger.setName("Peter");
        System.out.println("new passenger is " + passenger.getName());

        car1.changeOfColour();
        System.out.println("new weight of car = " + car1.changeWeightOfCar());
        System.out.println("new power of car 1 = " + car1.changePowerOfCar());

    }
}


