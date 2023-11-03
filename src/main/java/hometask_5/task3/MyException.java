package hometask_5.task3;

public class MyException extends RuntimeException{

    public MyException(String message) {
        super(message);
        System.out.println("My Exception");
    }
}
