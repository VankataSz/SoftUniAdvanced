package StreamFilesAndDirectoriesLab;

import java.io.FileInputStream;
import java.io.IOException;

public class TryCatchFinally {
    public static void main(String[] args) {

        String path = "D:\\streams\\input.txt";


        try {

            FileInputStream fileInputStream = new FileInputStream(path);

            //011010101 -> byte
            int bytes = fileInputStream.read();

            while (bytes != -1) {

                System.out.print((char) bytes);
                bytes = fileInputStream.read();

            }

            //recovery steps
        } catch (IOException e) {
            System.out.println("The file " + path + " is missing");
            //   throw new RuntimeException(e);

        } finally { //независимо какво се случва преди това винаги се изпълнява

            System.out.println("I am always executed no matter what");

        }

    }
}
