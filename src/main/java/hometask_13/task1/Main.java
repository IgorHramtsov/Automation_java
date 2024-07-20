package hometask_13.task1;

import org.apache.log4j.Logger;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    private static final Logger logger = Logger.getLogger(hometask_13.task1.Main.class);

    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>(Arrays.asList(
                new Person(25, "Igor"),
                new Person(45, "Ivan"),
                new Person(56, "Oleg"),
                new Person(21, "Olya"),
                new Person(24, "Lera"),
                new Person(12, "Dima"),
                new Person(30, "Roma")
        ));

        personList.stream()
                .peek(person -> person.setTimestamp(LocalDate.now()))
                .forEach(System.out::println);

        List<String> wordList = new ArrayList<>(Arrays.asList(
                new String("xzcvzxcv"),
                new String("dsadasas"),
                new String("sdasdasd"),
                new String("fsafasfsad"),
                new String("ascascxczx"),
                new String("vvlvlaasewz"),
                new String("ccckasewqs")
        ));



        List<String> newWordList = new ArrayList<>();

        wordList.stream().forEach(newWordList::add);
        logger.info("newWordList: " + newWordList);



        Function max = (a, b, c) -> Math.max(a, Math.max(b, c));
        Function average = (a, b, c) -> (a + b + c) / 3;
        Function sum = (a, b, c) -> a + b + c;

        int resultMax = max.apply(4, 6, 8);
        double resultAverage = average.apply(4, 6, 8);
        int resultSum = sum.apply(4, 6, 8);

        logger.info(resultMax);
        logger.info(resultAverage);
        logger.info(resultSum);
    }
}