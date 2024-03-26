public class Ogrenci {
    private String ad;
    private int yas;
    public Ogrenci(String ad, int yas){
        this.setAd(ad);
        this.setYas(yas);
    }

    public String getAd() {
        return ad;
    }
    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if(yas>0)
            this.yas=yas;
        else
            System.out.println("Geçersiz yaş değeri");
    }

    public void setAd(String ad) {
        this.ad = ad;
    }
}
