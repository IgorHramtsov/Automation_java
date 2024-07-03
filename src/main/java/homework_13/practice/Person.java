package homework_13.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Person {

    public String name;
    public int age;
    public LocalDate timestamp;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDate timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", timestamp=" + timestamp +
                '}';
    }

    public static List<Person> getAdults(List<Person> personList){
     List<Person> adults = new ArrayList<>();
     personList.forEach(person -> {
         if (person.getAge() >= 18)
             adults.add(person);
     });
     return adults;
    }
}
