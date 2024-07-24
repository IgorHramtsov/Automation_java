package hometask_14.Singletone;

public class Singletone {

    private static Singletone instance;

    private Singletone() {

    };

    public static Singletone getInstance() {
        if (instance == null) {
            synchronized (Singletone.class) {
                if (instance == null) {
                    instance = new Singletone();
                }
            }
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Singletone message");
    }
}
