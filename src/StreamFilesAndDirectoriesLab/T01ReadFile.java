package StreamFilesAndDirectoriesLab;

import java.io.FileInputStream;
import java.io.IOException;

public class T01ReadFile {
    public static void main(String[] args) throws IOException {

        String path = "Resources\\input.txt";



            FileInputStream fileInputStream = new FileInputStream(path);

            int bytes = fileInputStream.read();

            while (bytes != -1) {

                System.out.print(Integer.toBinaryString(bytes) + " ");

                bytes = fileInputStream.read();
            }



//
//        try {
//
//            FileInputStream fileInputStream = new FileInputStream(path);
//
//            int bytes = fileInputStream.read();
//
//            while (bytes != -1) {
//
//                System.out.print(Integer.toBinaryString(bytes) + " ");
//
//                bytes = fileInputStream.read();
//            }
//
//            System.out.println();
//
//        } catch (IOException e) {
//
//        }
//
//
//





    }
}
