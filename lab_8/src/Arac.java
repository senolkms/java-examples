public class Arac {
    private String tur;
    private int yapimYili;

    public Arac(String tur, int yapimYili) {
        this.tur = tur;
        this.yapimYili = yapimYili;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    public int getYapimYili() {
        return yapimYili;
    }

    public void setYapimYili(int yapimYili) {
        this.yapimYili = yapimYili;
    }

    public void ekranaYazdir() {
        System.out.println("Araç Türü: " + tur);
        System.out.println("Yapım Yılı: " + yapimYili);
    }
}