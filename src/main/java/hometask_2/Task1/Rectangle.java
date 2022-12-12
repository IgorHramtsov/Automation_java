package hometask_2.Task1;

public class Rectangle {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle() {
        this.length = 12.8;
        this.width = 6.7;
    }

    public void perimeter() {
        double perimeter = 2*length + 2*width;
        System.out.println("The perimetr of rectangle = " + perimeter);
    }

    public void area() {
        double area = length * width;
        System.out.println("The area of rectangle = " + area);
    }
}
