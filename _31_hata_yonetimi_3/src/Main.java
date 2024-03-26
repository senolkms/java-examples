import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=null;
        int total=0;
        try {
            reader = new BufferedReader(new FileReader("C:\\Users\\senol\\Desktop\\JAVA\\_31_hata_yonetimi_3\\src\\sayilar.txt"));
            String line=null;
            while ((line= reader.readLine())!=null){
                total+=Integer.valueOf(line);
            }
            System.out.println(total);
        } catch (FileNotFoundException e) { //dosya yoksa hatası
            e.printStackTrace(); //hatanın izini yazdırır
        }
        finally {
            reader.close();//dosya işlem sonu kapatılmalı
        }
    }
}