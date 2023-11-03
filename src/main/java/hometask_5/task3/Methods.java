package hometask_5.task3;
import org.apache.log4j.Logger;

public class Methods {

    private static final Logger logger = Logger.getLogger(Main.class);

    public static void Calculation(double number1, double number2) throws MyException, IllegalAccessException {
        if (number1 > 0 && number2 > 0) {
            throw new MyException("number1 > 0 && number2 > 0");
        }
        if (number1 < 0 && number2 < 0) {
            throw new IllegalArgumentException("number1 < 0 && number2 < 0");
        }
        if ((number1 == 0 && number2 != 0) || (number1 != 0 && number2 == 0)) {
            throw new ArithmeticException("(number1 == 0 && number2 != 0) || (number1 != 0 && number2 == 0)");
        }
        if (number1 == 0 && number2 == 0) {
            throw new IllegalAccessException("number1 == 0 && number2 == 0");
        } else {

            logger.info("sum = " + (number1 + number2));
            logger.info("difference = " + (number1 - number2));
            logger.info("product = " + number1 * number2);
            logger.info("dividing = " + number1 / number2);

        }
    }
}
