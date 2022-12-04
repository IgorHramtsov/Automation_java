package hometask_1;
import java.util.Scanner;
public class task4 {
        public static void main(String[] args) {
            System.out.println("Enter two numbers");
            Scanner scanner = new Scanner(System.in);
            double m = scanner.nextDouble();
            double n = scanner.nextDouble();
            int a = 10;
            double b = Math.abs(m - 10);
            double c = Math.abs(n - 10);
            if(b < c){
                System.out.println(m + " is closer to " + a);
            }
            else{
                System.out.println(n + " is closer to " + a);
            }
        }
}
