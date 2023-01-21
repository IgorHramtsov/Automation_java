package hometask_3.hometask2_task3;

public class SteeringWheel {

    private double radiusOfStWheel;

    public SteeringWheel(double radiusOfStWheel) {
        this.radiusOfStWheel = radiusOfStWheel;}

    public double getRadiusOfStWheel() {
        return radiusOfStWheel;
    }

    public void setRadiusOfStWheel(double radiusOfStWheel) {
        this.radiusOfStWheel = radiusOfStWheel;
    }

    public double changeOfRadiusStWheel() {
        return radiusOfStWheel/1.5;
    }

    @Override
    public String toString() {
        return "SteeringWheel{" +
                "radiusOfStWheel=" + radiusOfStWheel +
                '}';
    }
}

