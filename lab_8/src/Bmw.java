public class Bmw extends Otomobil {
    private String model;
    private String renk;
    private double fiyat;

    public Bmw(String tur, int yapimYili, String marka, double agirlik, int tekerSayisi, String model, String renk, double fiyat) {
        super(tur, yapimYili, marka, agirlik, tekerSayisi);
        this.model = model;
        this.renk = renk;
        this.fiyat = fiyat;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    @Override
    public void ekranaYazdir() {
        super.ekranaYazdir();
        System.out.println("Model: " + model);
        System.out.println("Renk: " + renk);
        System.out.println("Fiyat: " + fiyat);
    }
}
