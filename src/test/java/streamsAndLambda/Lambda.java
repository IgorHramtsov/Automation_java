package streamsAndLambda;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Lambda {

    Predicate<Person> isActiveAndOlderThan25 = p -> p.isActive() && p.getAge() > 25;

    Function<Person, String> personToLabel = p -> {
        if (p.isActive()) {
            return "Active";
        } else {
            return "Inactive";
        }
    };

    Consumer<Person> printPersonStatus = p -> System.out.println(p.isActive() ? "Active " : "Inactive " + p.getName() + " " + (p.getAge()));

    Supplier<Person> defaultPersonSupplier = () -> new Person("John", 30, "New York", true, 1000);

    Comparator<Person> byCityThenIncomeDesc =
            Comparator.comparing(Person::getCity)
                    .thenComparing(Comparator.comparingInt(Person::getIncome).reversed());


}
