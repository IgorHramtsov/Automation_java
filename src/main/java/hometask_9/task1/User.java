package hometask_9.task1;

public class User {

    private String userName;

    public User(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                '}';
    }
}
