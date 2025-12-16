package streamsAndLambda;

import java.util.List;

public class mainLambda {

    public static void main(String[] args) {

        Lambda lambda = new Lambda();

        Person alex = new Person("Alex", 28, "London", true, 1200);
        Person bob = new Person("Bob", 17, "Berlin", false, 0);

        System.out.println(lambda.isActiveAndOlderThan25.test(alex)); // true

        System.out.println(lambda.isActiveAndOlderThan25.test(bob)); // false

        // 2️⃣ Function
        System.out.println(lambda.personToLabel.apply(alex));

        // 3️⃣ Consumer
        lambda.printPersonStatus.accept(alex);
        lambda.printPersonStatus.accept(bob);

        // 4️⃣ Supplier
        Person defaultPerson = lambda.defaultPersonSupplier.get();
        System.out.println(defaultPerson);

    }
}