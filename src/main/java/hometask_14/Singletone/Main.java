package hometask_14.Singletone;

public class Main {

    public static void main(String[] args) {

        Singletone singletone = Singletone.getInstance();

        singletone.showMessage();
    }
}
