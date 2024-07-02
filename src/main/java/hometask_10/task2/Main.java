package hometask_10.task2;

import org.apache.log4j.Logger;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    private static final Logger logger = Logger.getLogger(hometask_10.task2.Main.class);


    public static void main(String[] args) {

        Employee employee = new Employee("Igor", 4355, 33500.20);

        Serializer.serialize(employee);
        logger.info(Serializer.deserialize());

        List<Employee> employeeList = new ArrayList<>();

        Employee employee1 = new Employee("Ivan", 785, 95300.32);
        Employee employee2 = new Employee("Oleg", 325, 234250.00);
        Employee employee3 = new Employee("Anton", 1290, 44700.80);

        employeeList.add(employee);
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);

        SerializerList.serialize(employeeList);
        logger.info("employeeList below:");
        logger.info(SerializerList.deserialize(employeeList));
    }
}
