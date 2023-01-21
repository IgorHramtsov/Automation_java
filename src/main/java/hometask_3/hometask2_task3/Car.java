package hometask_3.hometask2_task3;

public class Car {

    private double weightOfCar;
    private double powerOfCar;
    private String colourOfCar;
    private Wheel wheel;
    private SteeringWheel steeringWheel;
    private Body body;
    private Passenger passenger;

    public Car(double weightOfCar, double powerOfCar, String colourOfCar, Wheel wheel, SteeringWheel steeringWheel,
               Body body, Passenger passenger){
        this.weightOfCar = weightOfCar;
        this.powerOfCar = powerOfCar;
        this.colourOfCar = colourOfCar;
        this.wheel = wheel;
        this.steeringWheel = steeringWheel;
        this.body = body;
        this.passenger = passenger;
    }

    public Car(double weightOfCar, double powerOfCar, String colourOfCar, Wheel wheel, SteeringWheel steeringWheel,
               Body body) {
        this.weightOfCar = weightOfCar;
        this.powerOfCar = powerOfCar;
        this.colourOfCar = colourOfCar;
        this.wheel = wheel;
        this.steeringWheel = steeringWheel;
        this.body = body;
    }

    public String getColourOfCar() {
        return colourOfCar;
    }

    public double changeWeightOfCar(){
        return weightOfCar*1.25;
    }

    public void changeOfColour() {
        System.out.println("red");
    }

    public double changePowerOfCar() {
        return powerOfCar*1.13;
    }

    @Override
    public String toString() {
        return "Car{" +
                "weightOfCar=" + weightOfCar +
                ", powerOfCar=" + powerOfCar +
                ", colourOfCar='" + colourOfCar + '\'' +
                ", wheel=" + wheel +
                ", steeringWheel=" + steeringWheel +
                ", body=" + body +
                ", passenger=" + passenger +
                '}';
    }
}
