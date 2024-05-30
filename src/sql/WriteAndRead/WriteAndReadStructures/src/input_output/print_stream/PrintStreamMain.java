package sql.WriteAndRead.WriteAndReadStructures.src.input_output.print_stream;

import java.io.PrintStream;

public class PrintStreamMain {
    public static void main(String[] args) {
        String data = "Bu bir Print Stream Yapısı Deneme Metnidir!";
        try {
            PrintStream pr = new PrintStream("src/print_stream/print.txt");
            pr.print(data);
            pr.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
