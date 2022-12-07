package StreamFilesAndDirectoriesLab;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class T02WriteToFile {
    public static void main(String[] args) throws IOException {

        String path = "resources\\input.txt";

        FileInputStream fileInputStream = new FileInputStream(path);

        int bytes = fileInputStream.read();

        while (bytes != -1){






        }

    }
}
