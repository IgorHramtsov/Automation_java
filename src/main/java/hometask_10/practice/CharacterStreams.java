package hometask_10.practice;

import java.io.FileReader;
import java.io.FileWriter;

public class CharacterStreams {

    public static void main(String[] args) throws Exception{
        writeToFileCharacterStream("hometask10/characterFile.txt");
        readFileCharacterStream("hometask10/characterFile.txt");
    }

    public static void writeToFileCharacterStream(String fileName) throws Exception{
        String text = "\nio nio streams";
        FileWriter fileWriter = new FileWriter("src/main/resources/" + fileName, true);
        fileWriter.write(text);
        fileWriter.close();
    }

    public static void readFileCharacterStream(String fileName) throws Exception {
        FileReader fileReader = new FileReader("src/main/resources/" + fileName);
        String text = "";
        while (fileReader.ready()){
            text += (char) fileReader.read();
        }
        System.out.println(text);
    }
}
