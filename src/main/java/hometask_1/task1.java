package hometask_1;
import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i;
        int sum = 0;
        for (i = 0; i <= n; i++){
            sum = sum + i;
        }
        System.out.println("Sum of numbers up to " + n + " = " + sum);
    }
}