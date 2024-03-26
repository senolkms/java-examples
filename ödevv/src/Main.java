import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Eleman sayısını giriniz: ");
        Scanner scan= new Scanner(System.in);
        int n = scan.nextInt();
        int deger = 0,ort;
        int[] dizi = new int [n];
        int[] dizi2 = new int [n];
        int toplam=0;
        System.out.println("Eleman değerlerini giriniz:");
        for (int i = 0; i < n; i++) {
            deger = scan.nextInt();
            dizi[i]= deger;
        }
        for (int i = 0; i < n; i++) {
            dizi2[i]= dizi[i];
        }
        for (int i = 0; i < dizi2.length; i++) {
            toplam+=dizi2[i];
        }
        ort=toplam/n;
        System.out.println("ortalama: "+ort);

        System.out.println("2. soru");
        int [][] matris = new int[3][2];
        int i,j;
        Scanner scanner = new Scanner(System.in);

        for(i=0;i<3;i++){
            for(j=0;j<2;j++){
                System.out.print("Matris[" + i + "][" + j + "]: ");
                matris[i][j]= scanner.nextInt();
            }
        }
        for(i=0;i<3;i++){
            for(j=0;j<2;j++){
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("-------------");
        System.out.println("3. soru");

        int[] tamSayiDizisi = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ArrayList<Integer> sayilar = new ArrayList<>();
        for ( i = 0; i < tamSayiDizisi.length; i++) {
            sayilar.add(tamSayiDizisi[i]);
        }
        for (int sayi1 : sayilar) {
            System.out.println(sayi1);
        }
    }
}
