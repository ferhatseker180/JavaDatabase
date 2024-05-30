package sql.WriteAndRead.WriteAndReadStructures.src.input_output.file_input_output_stream;
import java.io.FileOutputStream;
public class OutputMain {
    public static void main(String[] args) {

        String data = " Bu Metin Yazma Denemesidir";
        // Burada dosyaya veri eklendi, yazı yazıldı.
        try {
            FileOutputStream file = new FileOutputStream("src/file_input_output_stream/patika.txt",true);
            byte[] arr = data.getBytes();
            file.write(arr);
            file.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


}
