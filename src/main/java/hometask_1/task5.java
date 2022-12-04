package hometask_1;
import java.util.Scanner;
public class task5 {
        public static void main(String[] args) {
            String day;
            System.out.println("Enter the day");
            Scanner scanner = new Scanner(System.in);
            day = scanner.nextLine();
            String Monday = "Learn Java";
            String Tuesday = "Download GIT";
            String Wednesday = "Do homework";
            String Thursday = "Visit grandma";
            String Friday = "Watch football";
            String Saturday = "Meet friends";
            String Sunday = "Reed a book";

            switch (day){
                case "Monday":
                    System.out.println(Monday);
                    break;
                case "Tuesday":
                    System.out.println(Tuesday);
                    break;
                case "Wednesday":
                    System.out.println(Wednesday);
                    break;
                case "Thursday":
                    System.out.println(Thursday);
                    break;
                case "Friday":
                    System.out.println(Friday);
                    break;
                case "Saturday":
                    System.out.println(Saturday);
                    break;
                case "Sunday":
                    System.out.println(Sunday);
                    break;
                default:
                    System.out.println("No such day in a week");
                    break;
            }
        }
}
