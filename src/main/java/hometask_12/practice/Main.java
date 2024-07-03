package hometask_12.practice;

import org.apache.log4j.Logger;

import java.lang.reflect.*;
import java.util.Arrays;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) throws Exception{
         /*Class fridgeClass = Fridge.class;
           Method[] methods = fridgeClass.getDeclaredMethods();
        for (Method method: methods) {
            logger.info(method);
        }

        logger.info(Modifier.isPublic(fridgeClass.getModifiers()));
        logger.info(fridgeClass.isAnnotation());

        Method method = fridgeClass.getDeclaredMethod("calculateAppliancePrice");
        logger.info(method.isAnnotationPresent(Override.class));
        logger.info(method.isAnnotationPresent(Deprecated.class));

        Fridge fridge = new Fridge("dd","aaa", 10, 120);
        Field field = fridgeClass.getDeclaredField("isFrezer");
        field.setAccessible(true);
        field.setBoolean(fridge, true);
        logger.info("field: " + field);
        logger.info(fridge);

        logger.info(fridgeClass.getName());
        logger.info(fridgeClass.getTypeName());
        logger.info(fridgeClass.getSimpleName());*/

        Class ElectricApplianceClass = ElectricAppliance.class;

      /*  Constructor constructor = ElectricApplianceClass.getConstructor(String.class, String.class, int.class, int.class);
        Method method1 = ElectricApplianceClass.getDeclaredMethod("calculatePrice");
        method1.setAccessible(true);
        method1.invoke(constructor.newInstance("asd", "dfsaf", 32, 452)); */

        Fridge fridge = new Fridge("fa", "afswa", 42, 234);

        Method[] methods = ElectricApplianceClass.getDeclaredMethods();
        System.out.println("methods: ");
        for (Method method: methods) {
            if (method.isAnnotationPresent(Deprecated.class)){
                Parameter[] parameters = method.getParameters();
                method.setAccessible(true);
                method.invoke(fridge, null);
                logger.info(Arrays.toString(parameters));
            }
        }


    }

}
