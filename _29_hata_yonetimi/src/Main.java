// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        try { //Çalıştırmayı dene
            int[] sayilar=new int[]{1,2,3};
            System.out.println(sayilar[3]);
        }
        catch (Exception exception) { // try da hata varsa buraya girer
            System.out.println(exception);
        }
        finally { //try ve catch çalışsada çalışmazsada finally çalışır
            System.out.println("Her türlü çalışır");
        }
    }
}