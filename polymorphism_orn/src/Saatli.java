public class Saatli extends Calisan {
    private double oran;
    private double saat;

    public Saatli(String ad, double oran, double saat) {
        super(ad);
        setOran(oran);
        setSaat(saat);
    }

    public void setOran(double oran) {
        this.oran = oran;
    }

    public void setSaat(double saat) {
        this.saat = saat;
    }

    public double getOran() {
        return oran;
    }

    public double getSaat() {
        return saat;
    }

    public double ode() {
        return oran * saat;
    }

    public String yaz() {
        return super.yaz() + " (oran: " + oran + ", saat: " + saat + ')';
    }
}
