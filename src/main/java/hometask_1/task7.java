package hometask_1;
import java.util.Scanner;
public class task7 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the radius");
            double R = scanner.nextDouble();
            double Area;
            double Length;
            Area = Math.PI * R * R;
            Length = 2 * Math.PI * R;
            System.out.println("Area of circle = " + Area + "\nLength of circle = " + Length);
        }
}
