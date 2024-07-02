package hometask_10.practice;

import java.io.*;

public class Serializer {

    public static void main(String[] args) {
        serialize();
        System.out.println(deserialize());
    }

    public static void serialize() {
        User user = new User("Igor", "qwerty1234", 23);
        try (FileOutputStream fileOutputStream = new FileOutputStream("src/main/resources/user.txt")){
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(user);
    } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static User deserialize() {
        User user = null;
        try (FileInputStream fileInputStream = new FileInputStream("src/main/resources/user.txt")){
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            user = (User) objectInputStream.readObject();
        } catch (Exception e){
            e.printStackTrace();
        }

        return user;
    }
}
