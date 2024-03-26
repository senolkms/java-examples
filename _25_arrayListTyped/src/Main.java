import java.util.ArrayList;
import java.util.Collections;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<String> sehirler = new ArrayList<>();
        sehirler.add("Trabzon");
        sehirler.add("Bursa");
        sehirler.add("İzmir");

        sehirler.remove(2);
        sehirler.add("Ankara");

        Collections.sort(sehirler);//alfabetik sıra

        for(Object sehir:sehirler)
        {
            System.out.println(sehir);
        }
    }
}