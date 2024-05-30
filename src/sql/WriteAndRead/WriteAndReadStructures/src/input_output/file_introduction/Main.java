package sql.WriteAndRead.WriteAndReadStructures.src.input_output.file_introduction;

import java.io.File;
public class Main {
    public static void main(String[] args) {

      //  File file = new File("patika.txt");
      //  File file2 = new File("test/patika/calisma");
        File dizin = new File("test");

          /* Dosya oluşturma işlemi yapar
        try {
            if (file.createNewFile()){
                System.out.println(file.getName() + " created");
            } else {
                System.out.println(file.getName() + " have been already created");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
         */

        /* Delete işlemi yapar.
         file.delete();
         */

        /* mkdir : Tek bir dizin oluşturur. mkdirs : Birden fazla dizin oluşturabilir.
       file2.mkdirs();
         */

        /* Klasör içerisindeki dosyaları listeler.
        String[] list = dizin.list();
        for (String f : list){
            System.out.println(f);
        }
         */

    }
}
