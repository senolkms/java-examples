public class Main {
    public static void main(String[] args) {
        EvcilHayvan kedi = new EvcilHayvan("Pamuk");
        Kopek kopek = new Kopek("Max");

        kedi.sesCikar(); // Pamuk ses çıkarıyor.
        kopek.sesCikar(); // Max havlıyor.
    }
}
