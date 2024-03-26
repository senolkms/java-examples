public class Otomobil extends Arac {
    private String marka;
    private double agirlik;
    private int tekerSayisi;

    public Otomobil(String tur, int yapimYili, String marka, double agirlik, int tekerSayisi) {
        super(tur, yapimYili);
        this.marka = marka;
        this.agirlik = agirlik;
        this.tekerSayisi = tekerSayisi;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public double getAgirlik() {
        return agirlik;
    }

    public void setAgirlik(double agirlik) {
        this.agirlik = agirlik;
    }

    public int getTekerSayisi() {
        return tekerSayisi;
    }

    public void setTekerSayisi(int tekerSayisi) {
        this.tekerSayisi = tekerSayisi;
    }

    @Override
    public void ekranaYazdir() {
        super.ekranaYazdir();
        System.out.println("Marka: " + marka);
        System.out.println("Ağırlık: " + agirlik);
        System.out.println("Teker Sayısı: " + tekerSayisi);
    }
}
