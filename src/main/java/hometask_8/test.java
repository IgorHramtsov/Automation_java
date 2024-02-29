package hometask_8;

import org.apache.log4j.Logger;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class test {
    private static final Logger logger = Logger.getLogger(hometask_8.test.class);
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        Map <Integer, String> map1 = new  HashMap<>();
        Map <Integer, String> map2 = new LinkedHashMap<>();


        map1.put(345, "sdfgsdfg");
        map2.put(345, "sdfgsdfg");
        map1.put(654, "sdfsdfaghhhh");
        map2.put(654, "sdfsdfaghhhh");
        map1.put(544, "rreettaa");
        map2.put(544, "rreettaa");
        map1.put(null, "qqwweer");
        map2.put(null, "qqwweer");
        map1.put(34, "xfgdf");
        map1.put(34, "8dvsdfvd");
        map2.put(34, "kkffsa");
        map1.put(974, "sdfsdf");
        map2.put(974, "sdfsdf");

        logger.info(map1.get(345));

        map1.remove(544);

        logger.info(map1.size());

        logger.info(map1.containsKey(345));
        logger.info(map1.containsValue("qqwweer"));
        logger.info(map1.containsKey(544));

        logger.info(map1);
        logger.info(map2);

    }
}
