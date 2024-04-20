package hometask_10.practice;

import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class readUsers {

    public static void main(String[] args) throws Exception{

        readFromUsers("hometask10/users.txt");
    }

    public static void readFromUsers(String fileName) throws Exception {
        FileReader fileReader = new FileReader("src/main/resources/" + fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        List<User> usersList = new ArrayList<>();
        while (bufferedReader.ready()) {
            String [] values = StringUtils.split(bufferedReader.readLine(), " ");
            usersList.add(new User(values[0], values[1], Integer.valueOf(values[2]) ));
        }
        System.out.println(usersList);
    }
}
