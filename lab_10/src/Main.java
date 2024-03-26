import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();

        // Animal nesnesi oluştur
        Animal animal1 = new Fish(1, "Male", 2, true);
        animals.add(animal1);

        // Başka bir Animal nesnesi oluştur
        Animal animal2 = new Zebra(3, "Female", true);
        animals.add(animal2);

        // Duck nesneleri oluştur
        Duck duck1 = new Duck(2, "Female", "Yellow");
        Animal duck2 =new Duck(1,"male","Red");
        Duck duck3 = new Duck(2, "Female", "Brown");
        animals.add(duck1);
        animals.add(duck2);
        animals.add(duck3);

        // Fish nesneleri oluştur
        Fish fish1 = new Fish(2, "Male", 1, true);
        Animal fish2 = new Fish(3, "Female", 2, false);
        animals.add(fish1);
        animals.add(fish2);

        // Zebra nesneleri oluştur
        Animal zebra1 = new Zebra(4, "Male", true);
        Animal zebra2 = new Zebra(5, "Female", false);
        Zebra zebra3 = new Zebra(3, "Male", true);
        Zebra zebra4 = new Zebra(2, "Female", false);
        animals.add(zebra1);
        animals.add(zebra2);
        animals.add(zebra3);
        animals.add(zebra4);

        // ArrayList içindeki her bir nesne için tüm metotları çağır
        for (Animal animal : animals) {
            System.out.println("---------------");
            System.out.println(animal.toString());
            animal.mate();
            animal.voice();
            animal.sleep();

            // Fish ise swim metodunu çağır
            if (animal instanceof Fish) {
                ((Fish) animal).swim();
            }

            // Duck ise swim ve quack metodlarını çağır
            if (animal instanceof Duck) {
                ((Duck) animal).swim();
                ((Duck) animal).quack();
            }

            // Zebra ise run metodunu çağır
            if (animal instanceof Zebra) {
                ((Zebra) animal).run();
            }
        }
    }
}