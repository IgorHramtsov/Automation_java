package hometask_12.task1;

import org.apache.log4j.Logger;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {

    private static final Logger logger = Logger.getLogger(hometask_12.task1.Main.class);

    public static void main(String[] args) {

        Person person1 = new Person("Oleg", 23, 176, "asdfasdf");
        Person person2 = new Person("Ivan", 13, 158, "oolrr");

        Class personClass = Person.class;
        Field[] fields = Person.class.getDeclaredFields();

        logger.info("fields with annotations:");
        for (Field field : fields) {
            if (field.isAnnotationPresent(Annotation1.class)) {
                Annotation1 annotation = field.getAnnotation(Annotation1.class);
                field.setAccessible(true);
                logger.info("field: " + field.getName() + "\n" + "annotation name: " + annotation.name());

            }
        }

        try {

            // Class personClass = Person.class;

            Method method1 = personClass.getDeclaredMethod("printName");
            Method method2 = personClass.getDeclaredMethod("isHigherThan170cm");
            Method method3 = personClass.getDeclaredMethod("doubleAge");



            boolean isHigherThan170cm1 = (boolean) method2.invoke(person1);
            int doubleAge1 = (int) method3.invoke(person1);

            boolean isHigherThan170cm2 = (boolean) method2.invoke(person2);
            int doubleAge2 = (int) method3.invoke(person2);

            method1.invoke(person1);
            logger.info("is higher than 170cm: " + isHigherThan170cm1);
            logger.info("double age: " + doubleAge1);

            method1.invoke(person2);
            logger.info("is higher than 170cm: " + isHigherThan170cm2);
            logger.info("double age: " + doubleAge2);

        }  catch (Exception e) {
            e.printStackTrace();
        }

        try {
            for (Field field : fields) {
                if (field.isAnnotationPresent(Annotation1.class)) {
                    Annotation1 annotation = field.getAnnotation(Annotation1.class);
                        if (annotation.name().equalsIgnoreCase("Name field")){
                            field.setAccessible(true);
                            field.set(person1, "Anton");
                        }
                    }
                }
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Field heightField = Person.class.getDeclaredField("age");
            heightField.setAccessible(true);
            heightField.set(person1, 35);
        } catch (Exception e) {
            e.printStackTrace();
        }

        logger.info("person1 new name: " + person1.getName());
        logger.info("person1 new age: " + person1.getAge());

        logger.info("person with new name and age: " + person1);



       /* logger.info("name: " + person1.printName());
        logger.info("double age: ");
        person1.doubleAge();
        logger.info("is higher than 170 cm: " + person1.isHigherThan170cm());

        logger.info("name " + person2.printName());
        logger.info("double age: ");
        person2.doubleAge();
        logger.info("is higher than 170 cm: " + person2.isHigherThan170cm()); */

    }

}
