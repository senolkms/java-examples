import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Bir HashMap oluştur
        HashMap<String, Integer> notlar = new HashMap<>();

        // Anahtar-değer çiftleri ekleyin
        notlar.put("Ali", 85);
        notlar.put("Veli", 92);
        notlar.put("Ayşe", 78);
        notlar.put("Mehmet", 95);

        for(Object item: notlar.keySet()){
            System.out.println("İsim: "+item+" Notu: "+notlar.get(item));
        }

        // Bir anahtarı kaldırın
        notlar.remove("Ali");

        // HashMap'in boyutunu alın
        int boyut = notlar.size();
        System.out.println("HashMap Boyutu: " + boyut); // Çıktı: HashMap Boyutu: 3
    }
}
