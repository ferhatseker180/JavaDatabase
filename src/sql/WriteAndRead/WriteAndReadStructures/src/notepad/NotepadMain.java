package sql.WriteAndRead.WriteAndReadStructures.src.notepad;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class NotepadMain {
    // Bu fonksiyon verilerin okunması işlevini yerine getirir.
    public static void reader() {
        try {
            FileReader fileReader = new FileReader("not.txt");
            BufferedReader reader = new BufferedReader(fileReader);
            String yourText;
            while ((yourText = reader.readLine()) != null){
                System.out.println(yourText);
            }
            reader.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Bu fonksiyon verilerin yazılması işlevini yerine getirir.
    public static void writer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir Metin Giriniz: ");
        String text = scanner.nextLine();
        try {
            FileWriter file = new FileWriter("not.txt",true);
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.println(text);
            printWriter.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Fonksiyonlar burada çağrılır.
       reader();
       writer();
    }
}