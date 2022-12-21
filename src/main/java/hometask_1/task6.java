package hometask_1;
import java.util.Scanner;
public class task6 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter three numbers");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int D;
            double x1;
            double x2;
            D = b * b - 4 * a * c;
            double d1 = Math.sqrt(D);

            if (D < 0) {
                System.out.println("There are not any answers");
            } else if (D == 0) {
                x1 = -b / 2 * a;
                System.out.println("The answer is = " + x1);
            } else {
                x1 = (-b + d1)/2*a;
                x2 = (-b - d1)/2*a;
                System.out.println("Answer 1 = " + x1);
                System.out.println("Answer 2 = " + x2);
            }
        }
}
