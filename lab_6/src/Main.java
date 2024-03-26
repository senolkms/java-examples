import java.util.Scanner;
import java.util.ArrayList;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void karakter(){
        String cumle;
        Scanner string=new Scanner(System.in);
        System.out.println("Cümlenizi giriniz: ");
        cumle = string.nextLine();
        System.out.println("Cümlenin karakter sayısı: "+cumle.length());
    }
    public static void kelime(){
        Scanner scanner= new Scanner(System.in);

        String kelime1,kelime2;
        System.out.println("İki kelime giriniz:");
        System.out.println("İlk kelimeyi giriniz:");
        kelime1=scanner.nextLine();
        System.out.println("İkinci kelimeyi giriniz:");
        kelime2=scanner.nextLine();

        for (int i = 0; i < kelime1.length(); i++) {
            char karakter = kelime1.charAt(i);
            if (kelime2.indexOf(karakter) != -1 && kelime1.indexOf(karakter) == i) {
                System.out.print(karakter + " ");
            }
        }
        System.out.println(" ");
    }
    public static void cumle(){
        String cumle;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Cümleyi giriniz: ");
        cumle=scanner.nextLine();
        ArrayList<String> kelimeler = new ArrayList<>();
        String[] kelimelerDizisi = cumle.split(" ");
        for (String kelime : kelimelerDizisi) {
            if (kelime.matches("[a-zA-Z]+")) {
                kelimeler.add(kelime);
            }
        }
        System.out.println("Kelimeler: " + kelimeler.toString());
    }
    public static void main(String[] args) {
        int girdi;
        do {
            System.out.println("Seçeneğinizi giriniz(1-4): \n1-(Karakter sayısı say) \n2-(İki kelime arası ortak kelime) \n3-(Cümleyi arrayliste çevir) \n4-(Çıkış)");
            Scanner input = new Scanner(System.in);
            girdi = input.nextInt();
            switch (girdi) {
                case 1:
                    karakter();
                    break;
                case 2:
                    kelime();
                    break;
                case 3:
                    cumle();
                    break;
                case 4:
                    System.out.println("Çıkış yaptınız..");
                    break;
                default:
                    System.out.println("Geçerli seçenek giriniz.");
            }
        }
        while (girdi!=4);
    }
}