package hometask_8.task2;

import org.apache.log4j.Logger;

import java.util.*;

public class Main {

    private static final Logger logger = Logger.getLogger(hometask_8.task2.Main.class);
   // static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Map <Person, List<Account>> map1 = new HashMap<>();

        Person person1 = new Person("ivan");
        List<Account> account1 = new ArrayList<>();
        account1.add(new Account("5234523"));
        account1.add(new Account("3213"));
        account1.add(new Account("723423"));

        map1.put(person1, account1);

        Person person2 = new Person("igor");
        List<Account> account2 = new ArrayList<>();
        account2.add(new Account("4234"));
        account2.add(new Account("435262"));

        map1.put(person2, account2);

        Person person3 = new Person("oleg");
        List<Account> account3 = new ArrayList<>();
        account3.add(new Account("4151211"));
        account3.add(new Account("677888"));

        map1.put(person3, account3);

        List<Account> account4 = new ArrayList<>();
        account4.add(new Account("46456745"));
        account4.add(new Account("23542"));
        account4.add(new Account("5463456"));
        account4.add(new Account("23432188"));

        map1.put(null, account4);

        map1.get(person1).set(1, null);

        map1.remove(person3);

        logger.info(map1);

        for (Map.Entry<Person, List<Account>> entry: map1.entrySet()) {
            logger.info("Person: " + entry.getKey() + "Account: " + entry.getValue());
        }

    }
}
