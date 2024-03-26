abstract public class Calisan {
    private String ad;

    public Calisan(String ad) {
        setAd(ad);
    }

    public String getAd() {
        return new String(ad);
    }

    private void setAd(String ad) {
        this.ad = new String(ad);
    }

    abstract public double ode();

    public String yaz() {
        return "ad: " + ad;
    }
}
