public class Main {
    public static final int MAX_CALISAN = 10;
    public static void main(String[] args) {
        Calisan[] calisanlar = new Calisan[MAX_CALISAN];
        int csayi = 0;
        calisanlar[csayi++] = new Saatli("Ayse Durmuş", 75.00, 2.5);
        calisanlar[csayi++] = new Maasli("Mehmet Yalçın", 125.00);
        calisanlar[csayi++] = new Saatli("Veysel Doğru", 85.00, 3.0);
        calisanlar[csayi++] = new Maasli("Zehra Sümer", 150.00);
        calisanlar[csayi++] = new Saatli("Ahmet Kara", 65.00, 2.0);

        for (int i = 0; i < csayi; ++i)  {
            System.out.println("calisan:  " + calisanlar[i].yaz());
            System.out.println("ode:  " + calisanlar[i].ode());
            System.out.println();
        }
    }
}