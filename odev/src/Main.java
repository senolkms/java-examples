import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double s1,s2;
        System.out.print("1. sayıyı giriniz: ");
        s1= scanner.nextDouble();
        System.out.print("2. sayıyı giriniz: ");
        s2= scanner.nextDouble();
        System.out.println("Toplamları: "+(s1+s2));
    }
}