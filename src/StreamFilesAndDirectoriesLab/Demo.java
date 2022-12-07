package StreamFilesAndDirectoriesLab;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
     //   Scanner scanner = new Scanner(System.in);

        String path = "D:\\streams\\input.txt";


        try {

            FileInputStream fileInputStream = new FileInputStream(path);

            //011010101 -> byte
             int bytes = fileInputStream.read();

           while(bytes != -1){

               System.out.print((char) bytes);
               bytes = fileInputStream.read();
            }


//            Scanner scanner = new Scanner(fileInputStream);
//            String input = scanner.nextLine();
//            ArrayList<String> fileContent = new ArrayList<>();
//            while (!input.equals("END")) {
//                fileContent.add(input);
//                input = scanner.nextLine();
//            }
//            System.out.println(String.join((System.lineSeparator()),fileContent));

        } catch (IOException e) {

            throw new RuntimeException(e);

        }


    }
}
