package hometask_1;
import java.util.Scanner;
public class task8 {
        public static void main(String[] args) {
            System.out.println("Enter numbers");
            Scanner scanner = new Scanner(System.in);
            int n;
            int a;
            do {
                n = scanner.nextInt();
                a = n % 2;
                if (n == 0)
                    break;
                if (a == 1) {
                    System.out.println("odd number");
                } else {
                    System.out.println("even number");
                }
            } while (n != 0) ;
            if (n == 0){
                System.exit(0);
            }
        }
}

