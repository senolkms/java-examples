//Generics (Jenerikler), Java programlama dilinde kullanılan bir özelliktir
//ve sınıflar, arabirimler ve metodların tip belirsizliğini gidermek için kullanılır.
//Generics, Java'nın tip güvenliği (type safety) sağlama yeteneğini artırır
//ve kod tekrarını azaltır. Genellikle veri yapıları (örneğin, koleksiyonlar)
//ve yeniden kullanılabilir kod yazarken kullanılır.
public class Main {
    public static void main(String[] args) {
        // Jenerik bir kutu oluşturun
        Kutu<Integer> integerKutu = new Kutu<>();
        Kutu<String> stringKutu = new Kutu<>();

        // Kutulara değer atayın
        integerKutu.setIcerik(42);
        stringKutu.setIcerik("Merhaba, dünya!");

        // Değerleri alın
        Integer integerDeger = integerKutu.getIcerik();
        String stringDeger = stringKutu.getIcerik();

        // Değerleri yazdırın
        System.out.println("Integer Değer: " + integerDeger); // Çıktı: Integer Değer: 42
        System.out.println("String Değer: " + stringDeger);   // Çıktı: String Değer: Merhaba, dünya!
    }
}
//Bu örnekte, "Kutu" adında jenerik bir sınıf tanımlanmıştır.
//Bu sınıf, farklı veri tipleriyle kullanılabilen bir kutu oluşturmanızı sağlar.
//İlgili sınıfları belirtmek için "<>" operatörü kullanılır.
//Bu sayede aynı kod, farklı veri tipleriyle çalışabilir.