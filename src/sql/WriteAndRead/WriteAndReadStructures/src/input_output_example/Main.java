package sql.WriteAndRead.WriteAndReadStructures.src.input_output_example;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {

        int sum = 0;
        try {
            FileReader file = new FileReader("src/data.txt");
            BufferedReader buffer = new BufferedReader(file);
            String line;
            while ((line = buffer.readLine()) != null){
              //  System.out.println(line);
               int number = Integer.parseInt(line);
                sum += number;
            }
            buffer.close();
            System.out.println("Sum Of Numbers = " + sum);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}