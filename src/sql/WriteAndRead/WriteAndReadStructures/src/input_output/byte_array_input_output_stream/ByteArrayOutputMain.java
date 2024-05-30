package sql.WriteAndRead.WriteAndReadStructures.src.input_output.byte_array_input_output_stream;

import java.io.ByteArrayOutputStream;

public class ByteArrayOutputMain {
    public static void main(String[] args) {

        String data = "Bu bir Byte Array Output Denemesidir!";
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        byte[] dataGetBytes = data.getBytes();

        try {
            output.write(dataGetBytes);
            String newData = output.toString();
            System.out.println(newData); // Output: Bu bir Byte Array Output Denemesidir!
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
