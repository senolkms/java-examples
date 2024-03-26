// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String[] ogrenciler = new String[4];
        ogrenciler[0]="Şe";
        ogrenciler[1]="Şen";
        ogrenciler[2]="Şeno";
        ogrenciler[3]="Şenol";
        int i;
        for(i=0;i<ogrenciler.length;i++){
            System.out.println(ogrenciler[i]);
        }
        System.out.println("-----------------");
        for (String ogrenci:ogrenciler){ //ogrenci herhangi isim olabilir
            System.out.println(ogrenci);
        }
    }
}