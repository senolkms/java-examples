import java.util.Locale;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";
        System.out.println(mesaj);
        System.out.println("Eleman sayısı: " + mesaj.length());
        System.out.println("9. eleman : " + mesaj.charAt(9));
        System.out.println(mesaj.startsWith("u")); //u ile başlıyor mu
        System.out.println(mesaj.endsWith(".")); // . ile bitiyor mu
        char[] karakterler = new char[5];
        mesaj.getChars(0, 5, karakterler, 0); // Kaynak dizinin belirli bir aralığındaki karakterleri hedef diziye kopyala
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf('n')); //dizideki kaçıncı eleman
        System.out.println(mesaj.lastIndexOf('ü')); //sondan başlar
        System.out.println(mesaj.replace(' ', '-')); //değiştirme
        System.out.println(mesaj.substring(2, 15)); //2 den 15 e kadar olan karakterleri getir
        for (String parcala : mesaj.split(" ")) //diziyi parcalar
            System.out.println(parcala);
        System.out.println(mesaj.toLowerCase()); //tüm karakterleri küçült
        System.out.println(mesaj.toUpperCase()); //tüm karakterleri büyült
        System.out.println(mesaj.trim()); //kenarlardan boşlukları kaldırır
    }
}
