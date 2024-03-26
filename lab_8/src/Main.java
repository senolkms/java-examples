// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Arac arac = new Arac("Binek", 2023);
        arac.ekranaYazdir();

        System.out.println("\n----------------\n");

        Otomobil otomobil = new Otomobil("Binek", 2023, "AUDI", 2000.0, 3);
        otomobil.ekranaYazdir();

        System.out.println("\n----------------\n");

        Bmw bmw = new Bmw("Binek", 2022, "BMW", 1700.0, 5, "İ5", "Beyaz", 3.950000);
        bmw.setModel("X5");
        bmw.ekranaYazdir();
    }
}