package Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex4 {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("C:\\TienTran\\demo (1)\\RevisionJavaCore\\note.txtt");

        int character;
        while ((character = reader.read()) != -1) {
            System.out.print((char) character);
        }
    }
}
