package hometask_10.task1;

import org.apache.commons.lang3.StringUtils;

import java.io.*;
import java.util.List;

public class FileInputOutput {
    public static void writePersonsToFile(List<Person> persons, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/main/resources/" + fileName))) {
            for (Person person : persons) {
                writer.write(person.toFileString());
                writer.newLine();
            }
            System.out.println("Persons have been written to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFromFile(List<Person> personList, String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/" + fileName))) {

            while (reader.ready()) {
                String [] values = StringUtils.split(reader.readLine(), "_");
                personList.add(new Person(values[0], values[1], Integer.valueOf(values[2]) ));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(personList);
    }
}

