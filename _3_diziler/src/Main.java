// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        double[] dizi = {1.2, 3.4, 5.3, 8.4, 6.1};
        double total = 0;
        double max = dizi[0];

        for (double sayi : dizi) {
            total += sayi;
            System.out.println(sayi);
            if (sayi > max) {
                max = sayi;
            }
        }
        System.out.println("Toplam = " + total);
        System.out.println("En büyük sayı = " + max);
    }
}
