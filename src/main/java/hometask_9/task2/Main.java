package hometask_9.task2;

import org.apache.log4j.Logger;

import javax.swing.*;
import java.security.Key;
import java.util.*;
import java.util.Map;

public class Main {

    private static final Logger logger = Logger.getLogger(hometask_9.task2.Main.class);
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Map <Integer, String> map = new LinkedHashMap<>();

        MyEntry<Integer, String> myEntry1 = new MyEntry<>(4, "fsg");
        MyEntry<Integer, String> myEntry2 = new MyEntry<>(6, "gsd");
        MyEntry<Integer, String> myEntry3 = new MyEntry<>(9, "krl");
        MyEntry<Integer, String> myEntry4 = new MyEntry<>(32, "awk");
        MyEntry<Integer, String> myEntry5 = new MyEntry<>(13, "pvr");
        MyEntry<Integer, String> myEntry6 = new MyEntry<>(16, "yop");
        MyEntry<Integer, String> myEntry7 = new MyEntry<>(89, "eno");

        MyEntry.addToMap(map, myEntry1.getKey(), myEntry1.getValue());
        MyEntry.addToMap(map, myEntry2.getKey(), myEntry2.getValue());
        MyEntry.addToMap(map, myEntry3.getKey(), myEntry3.getValue());
        MyEntry.addToMap(map, myEntry4.getKey(), myEntry4.getValue());
        MyEntry.addToMap(map, myEntry5.getKey(), myEntry5.getValue());
        MyEntry.addToMap(map, myEntry6.getKey(), myEntry6.getValue());
        MyEntry.addToMap(map, myEntry7.getKey(), myEntry7.getValue());


        MyEntry.removeForKey(map, 2);

        MyEntry.removeForValue(map, "awk");

        MyEntry.setKeys(map.keySet());

        List<String> listOfValues = new ArrayList<>(map.values());
        MyEntry.listValues(listOfValues);

        MyEntry.allMap(map);
    }
}
