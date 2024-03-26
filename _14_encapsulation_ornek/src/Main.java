// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Ogrenci ogrenci = new Ogrenci("Ahmet", 20);

        System.out.println("Öğrenci Adı: " + ogrenci.getAd());
        System.out.println("Öğrenci Yaşı: " + ogrenci.getYas());

        ogrenci.setYas(22); // Yaşı güncelle
        System.out.println("Yeni Öğrenci Yaşı: " + ogrenci.getYas());
    }
}
