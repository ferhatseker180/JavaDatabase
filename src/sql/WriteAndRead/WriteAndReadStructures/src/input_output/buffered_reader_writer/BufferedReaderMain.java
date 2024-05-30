package sql.WriteAndRead.WriteAndReadStructures.src.input_output.buffered_reader_writer;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderMain {
    public static void main(String[] args) {

        try {
            FileReader file = new FileReader("src/buffered_reader_writer/input.txt");
            BufferedReader input = new BufferedReader(file);
            String line;
            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }
            input.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
