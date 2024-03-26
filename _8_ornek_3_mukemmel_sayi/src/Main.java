// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int sayi = 28;
        int i;
        int total = 0;
        for (i = 1; i < sayi; i++) {
            if (sayi % i == 0)
                total += i;
        }
        if (total == sayi) {
            System.out.println("Sayı mükemmel sayıdır");
        } else {
            System.out.println("Sayı mükemmel sayı değildir");
        }
    }
}