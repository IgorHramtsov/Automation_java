package hometask_10.task2;

import hometask_10.practice.User;
import hometask_10.task1.FileInputOutput;

import java.io.*;

public class Serializer {

    public static void serialize(Employee employee) {
        try (FileOutputStream fileOutputStream = new FileOutputStream("src/main/resources/employee.txt")) {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(employee);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Employee deserialize() {
         Employee employee = null;
        try (FileInputStream inputStream = new FileInputStream("src/main/resources/employee.txt")) {
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            employee = (Employee) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
            return employee;
        }
    }

