import java.util.Scanner;
//km birim fiyatı 0.10 dolar
//12 yaşından küçükse toplam fiyata 50% indirim
//12-24 yaş arası 10% indirim
//65 yaşından büyükse 30% indirim
//gidiş dönüş alıcaksa 20% indirim
//bu koşullara göre uçak bileti hesaplayan program
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int km,yas,tip;
        System.out.println("Mesafeyi giriniz: ");
        km = scan.nextInt();
        System.out.println("Yaşınızı giriniz: ");
        yas = scan.nextInt();
        System.out.println("Yolculuk tipini seçiniz(1-Tek Gidiş , 2-Gidiş/Dönüş): ");
        tip = scan.nextInt();

        double normalFiyat,yasIndirimi,tipIndirimi;

        if(km>0 && yas>0 && (tip==1 ||tip==2)){
            normalFiyat= km * 0.10;
            if(yas<12){
                yasIndirimi=normalFiyat * 0.5;
            }
            else if(yas>=12 && yas<=24){
                yasIndirimi=normalFiyat * 0.1;
            } else if (yas>65) {
                yasIndirimi = normalFiyat * 0.3;

            } else {
                yasIndirimi=0;
            }
            normalFiyat -= yasIndirimi;
            if(tip==2)
            {
                tipIndirimi = normalFiyat * 0.3;
                normalFiyat -= tipIndirimi;
            }
            System.out.println("Ücret: "+normalFiyat);
        }
        else{
            System.out.println("Girdiler yanlış");
        }
    }
}