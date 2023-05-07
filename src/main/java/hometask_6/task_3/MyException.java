package hometask_6.task_3;

import org.apache.log4j.Logger;

public class MyException extends Exception {

    private static final Logger logger = Logger.getLogger(hometask_6.task_2.Main.class);


    public MyException() {
        super();
        logger.info("MyException");
    }
}
