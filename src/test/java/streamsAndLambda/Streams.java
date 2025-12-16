package streamsAndLambda;

import java.util.*;
import java.util.stream.Collectors;

public class Streams {

    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("Alex", 25, "London", true, 1200),
                new Person("Bob", 17, "Berlin", false, 0),
                new Person("Charlie", 30, "London", true, 2000),
                new Person("Diana", 22, "Paris", true, 1500),
                new Person("Eve", 35, "Berlin", false, 3000),
                new Person("Frank", 28, "Paris", true, 1800)
        );

        // Пример 1: все совершеннолетние
        List<Person> adults = people.stream()
                .filter(p -> p.getAge() >= 18)
                .toList();

        // Пример 2: имена всех активных пользователей
        List<String> activeNames = people.stream()
                .filter(Person::isActive)
                .map(Person::getName)
                .toList();

        // Пример 3: средний доход активных
        double avgIncome = people.stream()
                .filter(Person::isActive)
                .mapToInt(Person::getIncome)
                .average()
                .orElse(0);

        // Пример 4: группировка по городу
        Map<String, List<Person>> byCity = people.stream()
                .collect(Collectors.groupingBy(Person::getCity));

        // Пример 5: самый богатый человек
        people.stream()
                .max(Comparator.comparingInt(Person::getIncome))
                .ifPresent(System.out::println);

        List<String> peopleNamesOlderThan30 = people.stream()
                .filter(p -> p.getAge() > 30)
                .map(Person::getName)
                .toList();

        System.out.println("peopleNamesOlderThan30: " + peopleNamesOlderThan30);

        long activePeople = people.stream()
                .filter(p -> p.isActive())
                .count();

        System.out.println("activePeople: " + activePeople);

        boolean isPersonFromParis = people.stream()
                .anyMatch(p -> p.getCity().equals("Paris"));

        System.out.println("isPersonFromParis: " + isPersonFromParis);

        Person firstNotActivePerson = people.stream()
                .filter(p -> !p.isActive())
                .findFirst()
                .orElseThrow();

        System.out.println("firstNotActivePerson: " + firstNotActivePerson);

        int sumIncomeOfActivePersons = people.stream()
                .filter(p -> p.isActive())
                .mapToInt(Person::getIncome)
                .sum();

        System.out.println("sumIncomeOfActivePersons: " + sumIncomeOfActivePersons);

        List<Person> personListByAgeDesc = people.stream()
                .sorted(Comparator.comparing(Person::getAge).reversed())
                .toList();

        System.out.println("personListByAgeDesc: " + personListByAgeDesc);

        Set<String> citiesWithActicePersons = people.stream()
                .filter(p -> p.isActive())
                .map(Person::getCity)
                .collect(Collectors.toSet());

        System.out.println("citiesWithActicePersons: " + citiesWithActicePersons);

        Optional<Person> theYoungestPerson = people.stream()
                .min(Comparator.comparing(Person::getAge));

        System.out.println("theYoungestPerson: " + theYoungestPerson);


        Map<Boolean, java.util.List<Person>> partioningBy = people.stream()
                .collect(Collectors.partitioningBy(p -> p.isActive()));

        System.out.println("partioningBy: " + partioningBy);

        List<Person> twoPersonsWitHighestIncome = people.stream()
                .sorted(Comparator.comparing(Person::getIncome).reversed())
                .limit(2)
                .toList();

        System.out.println("twoPersonsWitHighestIncome: " + twoPersonsWitHighestIncome);

        boolean isAllPersonsActiveOlderThan18 = people.stream()
                .filter(p ->p.isActive())
                .allMatch(p -> p.getAge() > 18);

        System.out.println("isAllPersonsActiveOlderThan18: " + isAllPersonsActiveOlderThan18);

        Optional<Person> personWithIncomeMoreThan2500AndFromBerlin = people.stream()
                .filter(p -> p.getIncome() > 2500)
                .filter(p -> p.getCity().equals("Berlin"))
                .findFirst();

        System.out.println("personWithIncomeMoreThan2500AndFromBerlin: " + personWithIncomeMoreThan2500AndFromBerlin);

        Map<String, Long> countByCity = people.stream()
                .collect(Collectors.groupingBy(Person::getCity, Collectors.counting()));

        System.out.println("countByCity: " + countByCity);

        Map<String, List<Person>> peopleByCity = people.stream()
                .collect(Collectors.groupingBy(Person::getCity));

        System.out.println("peopleByCity: " + peopleByCity);

        Map<String, Integer> incomeSumByCity = people.stream()
                .collect(Collectors.groupingBy(Person::getCity, Collectors.summingInt(Person::getIncome)));

        System.out.println("incomeSumByCity: " + incomeSumByCity);
    }
}

