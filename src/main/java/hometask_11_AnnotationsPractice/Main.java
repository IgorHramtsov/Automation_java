package hometask_11_AnnotationsPractice;

import org.apache.log4j.Logger;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class Main {
    private static final Logger logger = Logger.getLogger(hometask_11_AnnotationsPractice.Main.class);

    public static void main(String[] args) {
        test1();
    }
    @Environment()
    public static void test1() {
        int num1 = 23;
        int num2 = 38;

        int sum = num1 + num2;

        logger.info(sum);
    }
    @Environment(env = "PROD")
    public void test2(){
    }
    @Deprecated
    @Environment()
    public void test3() {
    }
    @Environment(env = "TEST")
    public void test4() {
    }

}
