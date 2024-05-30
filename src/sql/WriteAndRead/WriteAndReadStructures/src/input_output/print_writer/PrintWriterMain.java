package sql.WriteAndRead.WriteAndReadStructures.src.input_output.print_writer;

import java.io.PrintWriter;

public class PrintWriterMain {
    public static void main(String[] args) {
        String data = "Print Writer Deneme Metni...";

        try {
            PrintWriter output = new PrintWriter("src/print_writer/printwriter.txt");
            output.print(data);
            output.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
