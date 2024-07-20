package hometask_13.task3;

import hometask_13.practice.Person;
import org.apache.log4j.Logger;

import java.util.*;

public class Main {

    private static final Logger logger = Logger.getLogger(hometask_13.task3.Main.class);

    public static void main(String[] args) {

        List<People> peopleList = new ArrayList<>(Arrays.asList(
                new People("anton", 32, "man"),
                new People("oleg", 13, "man"),
                new People("ivan", 19, "man"),
                new People("igor", 20, "man"),
                new People("alex", 87, "man"),
                new People("ira", 32, "woman"),
                new People("maxim", 64, "man"),
                new People("dima", 8, "man"),
                new People("roma", 58, "man"),
                new People("sasha", 43, "man"),
                new People("masha", 32, "woman"),
                new People("lera", 21, "woman"),
                new People("dasha", 28, "woman"),
                new People("andrey", 46, "man")
        ));

        peopleList.stream()
                .filter(people -> people.getAge() >= 18)
                .filter(people -> people.getAge() <= 27)
                .filter(people -> people.getSex().equals("man"))
                .forEach(System.out::println);

        OptionalDouble averageAgeOfMen = peopleList
                .stream()
                .filter(people -> people.getSex().equals("man"))
                .mapToInt(People::getAge)
                .average();
        logger.info("average age of men = " + averageAgeOfMen);

        long workingPeople = peopleList.stream()
                .filter(people -> people.getAge() >= 18)
                .filter(people -> people.getAge() <= 60 && people.getSex().equals("man") || people.getAge() <= 55 && people.getSex().equals("woman"))
                .count();
        logger.info("working people = " + workingPeople);

        peopleList
                .stream()
                .sorted(Comparator.comparing(People::getName).reversed())
                .forEach(System.out::println);

        peopleList
                .stream()
                .sorted(Comparator.comparing(People::getName))
                .forEach(System.out::println);

        peopleList
                .stream()
                .sorted(Comparator.comparing(People::getAge))
                .forEach(System.out::println);

        Optional<People> maxAge = peopleList.stream().max(Comparator.comparingInt(People::getAge));
        logger.info("max age = " + maxAge);

        Optional<People> minAge = peopleList.stream().min(Comparator.comparingInt(People::getAge));
        logger.info("min age = " + minAge);

        long amountOfMen = peopleList
                .stream()
                .filter(people -> people.getSex().equals("man"))
                .count();
        logger.info("amountOfMen = " + amountOfMen);

        long amountOfWomen = peopleList
                .stream()
                .filter(people -> people.getSex().equals("woman"))
                .count();
        logger.info("amountOfWomen = " + amountOfWomen);

        People peopleNotFound = new People("not found", 0, "-");

        logger.info(peopleList
                .stream()
                .filter(people -> people.getSex().equals("woman"))
                .filter(people -> people.getName().startsWith("a"))
                .findAny().orElse(peopleNotFound));


    }
}
