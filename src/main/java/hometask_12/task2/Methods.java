package hometask_12.task2;

import java.util.Arrays;

public class Methods {

    public void myMethod(String... args) {
        System.out.println("Method with String varargs called");
        for (String arg : args) {
            System.out.println("String arg: " + arg);
        }
    }

    public void myMethod(String a, int... args) {
        System.out.println("Method with String and int varargs called");
        System.out.println("String: " + a);
        for (int arg : args) {
            System.out.println("Int arg: " + arg);
        }
    }
}
