package hometask_1;
import java.util.Scanner;
public class task2 {
        public static void main(String[] args) {
            System.out.println("Enter numbers");
            Scanner scanner = new Scanner(System.in);
            double n;
            int a = 0;
            double sum = 0;
            do {
                n = scanner.nextDouble();
                sum = sum + n;
                a = a + 1;
            } while (n != 0);
            System.out.println("sum of numbers = " + sum);
            System.out.println("a = " + a);
            System.out.println("average = " + sum/a);
        }
}
