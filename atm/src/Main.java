import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int bakiye=100,input,miktar;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Merhaba Hoşgeldiniz! ");
        System.out.println("Güncel Bakiyeniz: "+ bakiye + " TL");

        while (bakiye>0){
            System.out.println(" ");
            System.out.println("1-) Para Yatır");
            System.out.println("2-) Para Çek");
            System.out.println("3-) Bakiye Sorgula");
            System.out.println("4-) Çıkış Yap");
            System.out.println("Yapmak istediğiniz İşlemi Seçin: ");
            input = scanner.nextInt();

            if(input==1){
                System.out.print("Yatırmak istediğiniz tutar: ");
                miktar=scanner.nextInt();
                bakiye +=miktar;
            }else if(input==2){
                System.out.print("Çekmek istediğiniz tutar: ");
                miktar=scanner.nextInt();
                if(miktar>bakiye){
                    System.out.println("Yetersiz bakiye !!");
                }else{
                    bakiye-=miktar;
                }
            }else if(input==3){
                System.out.println("Güncel bakiye = "+bakiye);
            }else if(input==4){
                System.out.println("Çıkış yapılıyor..");
                break;
            }else{
                System.out.println("Geçersiz işlem !!");
            }
        }
        System.out.println("Tekrar Bekleriz..");
    }
}