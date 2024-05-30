package sql.WriteAndRead.WriteAndReadStructures.src.input_output.file_input_output_stream;

import java.io.FileInputStream;

public class InputMain {
    public static void main(String[] args) {
        try {
            FileInputStream input = new FileInputStream("src/file_inputstream/patika.txt");
            int i = input.read();
            while (i != -1){
                System.out.print((char) i);
                i = input.read();
                // Output : Bu bir deneme metnidir!!
            }
            input.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
