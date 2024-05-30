package sql.WriteAndRead.WriteAndReadStructures.src.input_output.buffered_input_output_stream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOutput {
    public static void main(String[] args) {
        String data = " Buffer Output Denemesi";
        try {
            FileOutputStream file = new FileOutputStream("src/buffered_input_output_stream/buffer.txt",true);
            BufferedOutputStream buffer = new BufferedOutputStream(file);
            byte[] arr = data.getBytes();
            buffer.write(arr);
            buffer.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
