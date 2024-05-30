package sql.WriteAndRead.WriteAndReadStructures.src.input_output.buffered_reader_writer;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterMain {
    public static void main(String[] args) {
        String data = " Bu bir Buffered Writer deneme metnidir!";

        try {
            FileWriter file = new FileWriter("src/buffered_reader_writer/input.txt",true);
            BufferedWriter output = new BufferedWriter(file);
            output.write(data);
            output.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
