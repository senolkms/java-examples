// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       try {
           int[] sayilar = new int[]{2,4,6,7};
           System.out.println(sayilar[4]);
       } catch (StringIndexOutOfBoundsException exception){ //String hatası
           System.out.println(exception);
       } //catch (ArrayIndexOutOfBoundsException exception){ //Dizi hatası
         //  System.out.println(exception);
        catch (Exception exception){ //Exception:Hataların tümünü içerir
           System.out.println("Loglandı: "+exception);
       }
       finally {
           System.out.println("Ben her türlü çalışırım");
       }
    }
}