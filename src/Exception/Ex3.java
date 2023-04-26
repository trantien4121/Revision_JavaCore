package Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex3 {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("C:\\TienTran\\demo (1)\\RevisionJavaCore\\note.txt");

            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("Unable to read the file!");
        }
    }
}
