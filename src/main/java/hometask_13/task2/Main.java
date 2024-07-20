package hometask_13.task2;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    private static final Logger logger = Logger.getLogger(hometask_13.task2.Main.class);

    public static void main(String[] args) {

        List<String> numbers = new ArrayList<>(Arrays.asList(
                new String("One"),
                new String("Two"),
                new String("Three"),
                new String("Four"),
                new String("Five"),
                new String("One last")
        ));

        // List<String> numbers1 = new ArrayList<>();

        long coountOne = numbers
                .stream()
                .filter(string -> string.contains("One"))
                .count();
        logger.info(coountOne);

        logger.info(numbers
                .stream()
                .findFirst()
                .orElse("0"));

        logger.info(numbers
                .stream()
                .skip(numbers.size() - 1)
                         .findFirst()
                         .orElse("empty"));

        logger.info(numbers.stream()
                .filter(number -> number.equals("Three"))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("'Three' not found ")));

        logger.info(numbers
                .stream()
                .skip(2)
                .findFirst());

                numbers
                        .stream()
                        .skip(1)
                        .limit(2)
                        .forEach(System.out::println);;


                numbers
                .stream()
                .filter(number -> number.length() > 3)
                        .forEach(System.out::println);

                numbers
                        .stream()
                        .distinct()
                        .forEach(System.out::println);

                boolean containsOne = numbers
                        .stream()
                        .anyMatch(number -> number.equals("One"));
                logger.info(containsOne);

                boolean allContainsLetterO = numbers
                        .stream()
                        .allMatch(n -> n.contains("o"));
                logger.info(allContainsLetterO);

                numbers
                        .stream()
                        .map(n -> n + "_1")
                        .forEach(System.out::println);

                numbers
                        .stream()
                        .sorted(String::compareTo)
                        .distinct()
                        .forEach(System.out::println);


    }
}
