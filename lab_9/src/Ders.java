public abstract class Ders implements IDersIsle{
    protected String DersAd;
    protected String DersSinif;

    public Ders(String dersAd,String dersSinif){
        this.DersAd=dersAd;
        this.DersSinif=dersSinif;
    }
    public abstract String IsimGetir();

    public abstract String SinifGetir();


    public void IsmiBuyut(String dersAd) {
        System.out.println("Büyük harfle ders adı: " + dersAd.toUpperCase());
    }
    static class Matematik extends Ders {

        public Matematik(String dersAd, String dersSinif) {
            // Üst sınıf olan Ders'in yapılandırıcısını çağırarak değerleri ayarlıyor
            super(dersAd, dersSinif);
        }

        @Override
        public String IsimGetir() {
            return "Ders: " + DersAd;
        }

        @Override
        public String SinifGetir() {
            return "Sınıf: " + DersSinif;
        }

        // Arayüz metotları
        @Override
        public void SozluSunum() {
            System.out.println("Matematik Sözlü Sunum");
        }

        @Override
        public void YaziliSunum() {
            System.out.println("Matematik Yazılı Sunum");
        }

    }
    static class Fizik extends Ders {
        public Fizik(String dersAd, String dersSinif) {
            super(dersAd, dersSinif);
        }


        @Override
        public String IsimGetir() {
            return "Ders: " + DersAd;
        }

        @Override
        public String SinifGetir() {
            return "Sınıf: " + DersSinif;
        }

        @Override
        public void SozluSunum() {
            System.out.println("Fizik Sözlü Sunum");
        }

        @Override
        public void YaziliSunum() {
            System.out.println("Fizik Yazılı Sunum");
        }
    }
    static class Kimya extends Ders {

        public Kimya(String dersAd, String dersSinif) {
            super(dersAd, dersSinif);
        }

        @Override
        public String IsimGetir() {
            return "Ders: " + DersAd;
        }

        @Override
        public String SinifGetir() {
            return "Sınıf: " + DersSinif;
        }
        @Override
        public void SozluSunum() {
            System.out.println("Kimya Sözlü Sunum");
        }

        @Override
        public void YaziliSunum() {
            System.out.println("Kimya Yazılı Sunum");
        }
    }
}
