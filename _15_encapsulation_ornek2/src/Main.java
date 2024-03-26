// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Calisan calisan= new Calisan("Şenol",22,30000);
        System.out.println("Çalışan adı: "+calisan.getAd());
        System.out.println("Çalışan yaşı: "+calisan.getYas());
        System.out.println("Çalışan maaşı: "+calisan.getMaas());

        calisan.setMaas(35000);

        System.out.println("Güncellenen maaş: "+calisan.getMaas());

    }
}