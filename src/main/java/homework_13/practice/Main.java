package homework_13.practice;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final Logger logger = Logger.getLogger(hometask_12.task2.Main.class);

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> names = new ArrayList<>(Arrays.asList("Anna", "Oleg", "Ivan", "Igor", "Lera"));
        List<String> newNames = new ArrayList<>();
/*
        for (String name: names) {
            System.out.println(name + "a");
            newNames.add((name + "a"));
        }

        logger.info(names);
        logger.info(newNames);
    }

        names.forEach(name->logger.info(name.toLowerCase()));

        List<Integer> numbers = new ArrayList<>(Arrays.asList(5,4,13,511,90,139));

        numbers.forEach(number -> {
            int newNumber;
            newNumber = number + 2;
            logger.info(newNumber);
        });*/

        List<Person> personList = new ArrayList<>(Arrays.asList(
                new Person("Ivan", 35),
                new Person("Oleg", 17),
                new Person("Lera", 18),
                new Person("Igor", 24),
                new Person("Masha", 11),
                new Person("Lena", 56)
        ));

        logger.info("adults: " + Person.getAdults(personList));

    }
}
