package hometask_10.task1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception{

        Person person1 = new Person("Ivan", "Horin", 25);
        Person person2 = new Person("Olena", "Kunec", 45);
        Person person3 = new Person("Andrew", "Jones", 34);
        Person person4 = new Person("Kira", "Fi", 12);

        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);

       // System.out.println(personList);

        FileInputOutput.writePersonsToFile(personList, "Persons.txt");
        FileInputOutput.readFromFile(personList, "hometask10/Persons.txt");

    }
}
