public class Calisan {
    private String ad;
    private int yas;
    private double maas;
    public Calisan(String ad,int yas,double maas){
        this.ad=ad; //ad adındaki sınıf alanına erişim için "this" kullanılır
        this.yas=yas;
        this.maas=maas;
    }
    public String getAd(){
        return ad;
    }
    public int getYas(){
        return yas;
    }
    public double getMaas(){
        return maas;
    }
    public void setMaas(double yeniMaas){
        if(yeniMaas>0)
        {
            maas=yeniMaas;
        }
        else {
            System.out.println("Geçersiz maaş girdiniz");
        }
    }
}
