// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int i;
        int sayi=11;
        boolean isPrime=true;

        if(sayi==1){
            System.out.println("Sayi asal değildir");
            return;
        }
        if(sayi<1){
            System.out.println("Geçersiz sayi girdiniz.");
            return;
        }

        for(i=2;i<sayi;i++)
        {
            if(sayi % i==0){
                isPrime=false;
            }
        }
        if(isPrime){
            System.out.println("Sayı asaldır");
        }
        else{
            System.out.println("Sayı asal değildir");
        }
    }
}