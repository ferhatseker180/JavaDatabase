package sql.WriteAndRead.WriteAndReadStructures.src.input_output.byte_array_input_output_stream;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInputStreamMain {
    public static void main(String[] args) {
        byte[] arr = {1,2,3,4,5};
        byte[] arr2 = {'F','E','R','H','A','T'};
        ByteArrayInputStream input = new ByteArrayInputStream(arr);
        ByteArrayInputStream input2 = new ByteArrayInputStream(arr2);
        input.skip(1); // Skip : içerisine yazıldığı kadar eleman atlar.

//        for (byte a : arr){
//            System.out.print(a + " "); // Output: 1 2 3 4 5
//        }
        for (byte letter : arr2){
            System.out.print((char) letter + " "); // Output: F E R H A T
        }
        try {
            input2.close();
            input.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
