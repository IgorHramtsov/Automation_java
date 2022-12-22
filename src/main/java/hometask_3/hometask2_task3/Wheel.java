package hometask_3.hometask2_task3;

public class Wheel {

    private double diametrOfWheel;
    private double widthOfWheel;

    public Wheel(double diametrOfWheel, double widthOfWheel) {
        this.diametrOfWheel = diametrOfWheel;
        this.widthOfWheel = widthOfWheel;
    }

    public void setDiametrOfWheel(double diametrOfWheel) {
        this.diametrOfWheel = diametrOfWheel;
    }

    public void setWidthOfWheel(double widthOfWheel) {
        this.widthOfWheel = widthOfWheel;
    }

    public double getDiametrOfWheel() {
        return diametrOfWheel;
    }

    public double getWidthOfWheel() {
        return widthOfWheel;
    }

    public double changeOfWheel() {
        return diametrOfWheel*1.34;
    }

    public double changeOfWheel1() {
        return widthOfWheel*1.5;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "diametrOfWheel=" + diametrOfWheel +
                ", widthOfWheel=" + widthOfWheel +
                '}';
    }
}

