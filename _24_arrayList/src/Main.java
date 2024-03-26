import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList sayilar = new ArrayList();
        sayilar.add(61);
        sayilar.add(31);
        sayilar.add("Trabzon");

        System.out.println("Dizinin boyutu: "+sayilar.size());
        sayilar.set(1,16);
        System.out.println("Dizinin ikinci degeri: "+sayilar.get(1));

        sayilar.remove(1);

        System.out.println("Dizinin ikinci degeri: "+sayilar.get(1));


        for(Object dizi:sayilar){
            System.out.println(dizi);
        }

        sayilar.clear();
        System.out.println("Dizinin boyutu: "+sayilar.size());

    }
}