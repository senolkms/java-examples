public class Kopek extends EvcilHayvan {
        public Kopek(String isim) {
            super(isim);
        }

        // Üst sınıftan miras alınan sesCikar metodu override edildi
        @Override
        public void sesCikar() {
            System.out.println(isim + " havlıyor.");
        }
}