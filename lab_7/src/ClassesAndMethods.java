import java.util.ArrayList;

class Ogrenci {
    private String ad;
    private int sinif;
    private ArrayList<Ders> dersListesi;
    private static int ogrenciSayisi;

    public Ogrenci() {
        ogrenciSayisi++;
        dersListesi = new ArrayList<>();
    }

    public Ogrenci(String ad, ArrayList<Ders> dersListesi) {
        this.ad = ad;
        this.dersListesi = dersListesi;
        ogrenciSayisi++;

    }

    public Ogrenci(String ad, int sinif, ArrayList<Ders> dersListesi) {
        this.ad = ad;
        this.sinif = sinif;
        this.dersListesi = dersListesi;
        ogrenciSayisi++;
    }

    public void OgrenciBilgisiYaz() {
        System.out.println("Öğrenci Adı: " + ad);
        System.out.println("Sınıf: " + sinif);
        System.out.println("Öğrenci Sayısı: " + ogrenciSayisi);
        System.out.println("Aldığı Ders Sayısı: " + dersListesi.size());
    }

    public void OgrenciDersBilgiYaz() {
        System.out.println("Aldığı Derslerin Bilgisi:");
        for (Ders ders : dersListesi) {
            ders.DersBilgisiYaz();
        }
    }
    public void addDers(Ders ders){
        dersListesi.add(ders);
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getSinif() {
        return sinif;
    }

    public void setSinif(int sinif) {
        this.sinif = sinif;
    }

    public ArrayList<Ders> getDersListesi() {
        return dersListesi;
    }

    public void setDersListesi(ArrayList<Ders> dersListesi) {
        this.dersListesi = dersListesi;
    }
}

class Ders {
    private String ad;
    private int sinif;
    private String hoca;
    private static int dersSayisi;

    public Ders() {
        dersSayisi++;
    }

    public Ders(String ad) {
        this.ad = ad;
        dersSayisi++;
    }
    public Ders(String ad, String hoca) {
        this.ad = ad;
        this.hoca=hoca;
        dersSayisi++;
    }

    public Ders(String ad, int sinif, String hoca) {
        this.ad = ad;
        this.sinif = sinif;
        this.hoca = hoca;
        dersSayisi++;
    }

    public void DersBilgisiYaz() {
        System.out.println("Ders Adı: " + ad);

        System.out.println("Hoca: " + hoca);
    }

    public static void DersSayiBilgisiYaz() {
        System.out.println("Toplam Ders Sayısı: " + dersSayisi);

    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getSinif() {
        return sinif;
    }

    public void setSinif(int sinif) {
        this.sinif = sinif;
    }

    public String getHoca() {
        return hoca;
    }

    public void setHoca(String hoca) {
        this.hoca = hoca;
    }
}

public class ClassesAndMethods {
    public static void main(String[] args) {
        ArrayList<Ders> dersListesi1 = new ArrayList<>();
        ArrayList<Ders> dersListesi2 = new ArrayList<>();
        ArrayList<Ders> dersListesi3 = new ArrayList<>();

        Ders ders1 = new Ders("Programlama", "Onur Hoca");
        Ders ders2 = new Ders("Matematik", "Aynur Hoca");
        Ders ders3 = new Ders("NYP",  "Ahmet Hoca");


        dersListesi1.add(ders1);
        dersListesi2.add(ders2);
        dersListesi3.add(ders3);

        Ogrenci ogrenci1 = new Ogrenci("Mete",10, dersListesi1);
        Ogrenci ogrenci2 = new Ogrenci("Osman", 11, dersListesi2);
        Ogrenci ogrenci3 = new Ogrenci("Ayşe", 12, dersListesi3);

        ogrenci1.addDers(ders2);
        ogrenci1.setSinif(22);

        ogrenci1.OgrenciBilgisiYaz();
        ogrenci1.OgrenciDersBilgiYaz();
        System.out.println("--------------");

        ogrenci2.setAd("Şenol");
        ogrenci2.OgrenciBilgisiYaz();
        ogrenci2.OgrenciDersBilgiYaz();
        System.out.println("--------------");

        ogrenci3.OgrenciBilgisiYaz();
        ogrenci3.OgrenciDersBilgiYaz();
        System.out.println("--------------");

        /*ogrenci4.OgrenciBilgisiYaz();
        ogrenci4.OgrenciDersBilgiYaz();
        System.out.println("--------------");*/

        Ders.DersSayiBilgisiYaz();
    }
}
