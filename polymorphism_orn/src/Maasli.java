public class Maasli extends Calisan {
    double maas;

    public Maasli(String ad, double maas) {
        super(ad);
        setMaas(maas);
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }

    public double getMaas() {
        return maas;
    }

    public double ode() {
        return maas;
    }

    public String yaz() {
        return super.yaz() + " (maas: " + maas + ")";
    }
}
