package sql.WriteAndRead.WriteAndReadStructures.src.input_output.buffered_input_output_stream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInput {
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("src/buffered_input_output_stream/buffer.txt");
            BufferedInputStream buffer = new BufferedInputStream(file);
            System.out.println("Kullanılabilir byte : " + buffer.available());

            int i = buffer.read();
            while (i != -1) {
                System.out.print((char) i);
                i = buffer.read();
            }
            System.out.println("Kullanılabilir byte : " + buffer.available());
            buffer.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
