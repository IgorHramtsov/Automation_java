package hometask_8.task1;

import org.apache.log4j.Logger;

import java.security.Key;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static final Logger logger = Logger.getLogger(hometask_8.task1.Main.class);
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Map<Person, Account> map1 = new HashMap<>();
        Map<Person, Account> map2 = new LinkedHashMap<>();

        Person person1 = new Person("vlad", "kijiha");
        Account account1 = new Account("susiaopjnc@gmail.com");
        map1.put(person1, account1);
        map2.put(person1, account1);

        Person person2 = new Person("oleg", "jooaye");
        Account account2 = new Account("jiioijaauk@gmail.com");
        map1.put(person2, account2);
        map2.put(person2, account2);

        Person person3 = new Person("ivan", "jdsklfa");
        Account account3 = new Account("hsfjlfew@gmai.com");
        map1.put(person3, account3);
        map2.put(person3, account3);

        map2.remove(person1);

        map2.get(person2).setAccount(null);


        logger.info("HashMap: " + map1);
        logger.info("LinkedHashMap: " + map2);

        for (Map.Entry<Person, Account> entry: map1.entrySet()) {
            logger.info("Person: " + entry.getKey() + "Account: " + entry.getValue());
        }

        for (Map.Entry<Person, Account> entry: map2.entrySet()) {
            logger.info("Person: " + entry.getKey() + "Account: " + entry.getValue());
        }
    }
}
