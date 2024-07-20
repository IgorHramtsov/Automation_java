package hometask_13.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Streams {

    public static void main(String[] args) {
        List<String> text = new ArrayList<>(Arrays.asList("sdfs", "sdfsdf", "asdfaAFAD", "ghthsgsd", "asdfasdf", "asdfa", "asdf", "gfhyrd"));

        text.stream()
                .filter(word-> word.length() > 4)
                .map(word-> word.toUpperCase())
                .skip(3)
                .forEach(System.out::println);

        List<Person> personList = new ArrayList<>(Arrays.asList(
                new Person("Ivan", 35),
                new Person("Oleg", 17),
                new Person("Lera", 18),
                new Person("Igor", 24),
                new Person("Masha", 11),
                new Person("Lena", 56)
        ));

        personList.stream()
                .peek(person -> person.setName(person.getName().toLowerCase()))
                .peek(person -> person.setTimestamp(LocalDate.now()))
                .peek(person -> person.setAge(person.getAge() + 6))
                .forEach(System.out::println);

    }
}
