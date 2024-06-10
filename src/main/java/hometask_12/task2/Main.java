package hometask_12.task2;

import org.apache.log4j.Logger;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {

    private static final Logger logger = Logger.getLogger(hometask_12.task2.Main.class);

    public static void main(String[] args) {

        try {

        Methods methodsInstance = new Methods();
        Class methodsClass = Methods.class;

            Method method1 = methodsClass.getDeclaredMethod("myMethod", String[].class);
            Method method2 = methodsClass.getDeclaredMethod("myMethod", String.class, int[].class);

            method1.invoke(methodsInstance, (Object) new String[]{"asdas", "ggdsfas", "efadasd"});
            method2.invoke(methodsInstance, "fasdfasdf", new int[]{3, 5, 134} );

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
