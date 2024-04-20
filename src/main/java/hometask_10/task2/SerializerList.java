package hometask_10.task2;

import java.io.*;
import java.util.List;

public class SerializerList {

    public static void serialize(List<Employee> employeeList) {
        try (FileOutputStream fileOutputStream = new FileOutputStream("src/main/resources/employee.txt")) {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(employeeList);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Employee> deserialize(List<Employee> employeeList) {

        try (FileInputStream inputStream = new FileInputStream("src/main/resources/employee.txt")) {
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            while (objectInputStream.available() > 0) {
                Employee employee = (Employee) objectInputStream.readObject();
                employeeList.add(employee);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return employeeList;
    }
}
