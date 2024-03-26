public class Main {
    public static void main(String[] args) {
        Hesaplama hesaplama=new HesapMakinesi(); {
            int sonucTopla,sonucCikar;

            sonucTopla=hesaplama.toplama(8,10);
            sonucCikar=hesaplama.cikarma(15,8);

            System.out.println("Toplama: "+sonucTopla);
            System.out.println("Cikarma: "+sonucCikar);
        }
    }
}