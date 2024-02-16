package hometask_7.task2;

import hometask_7.task1.Purchase;
import hometask_7.task1.PurchaseAmountComparator;
import org.apache.log4j.Logger;

import java.util.*;

public class Main {

    private static final Logger logger = Logger.getLogger(hometask_7.task2.Main.class);
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        LinkedList<Car> carsList = new LinkedList<>();

            while (true) {

            Car car = new Car("car", 0);

            logger.info("Enter info about car");
            logger.info("model: ");
            car.model = scanner.nextLine();

            if (car.model.equalsIgnoreCase("stop")) {
                break;
            }
            logger.info("amount: ");
            car.price = scanner.nextInt();

            carsList.add(car);
            scanner.nextLine();
        }

        /*Car car1 = new Car("Toyota", 7000);
        Car car2 = new Car("Honda", 5500);
        Car car3 = new Car("BMW", 13000);
        Car car4 = new Car("Audi", 11500);
        Car car5 = new Car("Daewoo", 3500);
        Car car6 = new Car("Mazda", 4500);

        carsList.add(car1);
        carsList.add(car2);
        carsList.add(car3);
        carsList.add(car4);
        carsList.add(car5);
        carsList.add(car6); */


        logger.info(carsList);

        Set<Car> carsList1 = new HashSet<>(carsList);

        Set<Car> carsList2 = new LinkedHashSet<>(carsList);

        Set<Car> carsList3 = new TreeSet<>(carsList);


        Set<Car> carsList4 = new TreeSet<>(new CarPriceComparator());
        for (Car car: carsList) {
            carsList4.add(car);
        }

        logger.info(carsList1);
        logger.info(carsList2);
        logger.info("sorted by name: " + carsList3);
        logger.info("sorted by price: " + carsList4);
    }
}
