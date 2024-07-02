package hometask_10.practice;


import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class ByteStreams {

    public static void main(String[] args) throws Exception {
       // writeToFile();
        readFromFile("readPdf.pdf");
        readFromPDFWithBuffer("hometask10/readPDF.pdf");
    }

    public static void writeToFile(String fileName) throws Exception {

        FileOutputStream outputStream = new FileOutputStream("src/main/resources/byteFile.txt", true);
        String text = "\ncole palmer";
        outputStream.write(text.getBytes());
        outputStream.close();

    }

    public static void readFromFile(String fileName) throws Exception {

        long startTime = System.currentTimeMillis();
        String text = "";
        FileInputStream fileInputStream = new FileInputStream("src/main/resources/" + fileName);
        while (fileInputStream.available() > 0) {
            text += (char) fileInputStream.read();
        }
        fileInputStream.close();
        //System.out.println(text);

        long endTime = System.currentTimeMillis();
        long seconds = (endTime - startTime) / 1000;
        System.out.println("Simple stream time: " + seconds);
    }

    public static void readFromPDFWithBuffer(String fileName) throws Exception {

        long startTime = System.currentTimeMillis();
        FileInputStream fileInputStream = new FileInputStream("src/main/resources/" + fileName);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream, 50000);

        while (bufferedInputStream.available() > 0){
            bufferedInputStream.read();
        }
        bufferedInputStream.close();

        long endTime = System.currentTimeMillis();
        long seconds = (endTime - startTime) / 1000;
        System.out.println("Buffered stream time: " + seconds);
    }
}
