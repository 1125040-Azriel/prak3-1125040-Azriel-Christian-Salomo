import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        ArrayList<Animal> animals = new ArrayList<>();

        // Hewan darat
        animals.add(new Dog("Bruno", 3, "Meat", 4));
        animals.add(new Cat("Luna", 2, "Fish", 4));
        animals.add(new Mouse("Mickey", 1, "Cheese", 4));

        // Hewan laut
        animals.add(new Fish("Nemo", 1, "Plankton", 20));
        animals.add(new Shark("Jaws", 5, "Fish", 500));
        animals.add(new Whale("Willy", 8, "Plankton", 100));

        // Hewan udara
        animals.add(new Eagle("Sky", 4, "Meat", 2.2));
        animals.add(new Parrot("Rio", 2, "Fruit", 0.5));
        animals.add(new Duck("Donald", 3, "Grain", 0.8));


        System.out.println("========================================");
        System.out.println("=== DATA SEMUA HEWAN (FOR-EACH LOOP) ===");
        System.out.println("========================================");

        for (Animal animal : animals) {
            System.out.println("Animal Type : " + animal.getClass().getSimpleName());
            System.out.println(animal.printData());
            System.out.println("Sound : " + animal.printSound());
            System.out.println("Movement : " + ((Movable) animal).move());
            ((Feedable) animal).eat();
            System.out.println("----------------------------------------");
        }


        System.out.println();
        System.out.println("========================================");
        System.out.println("=== HEWAN SORTED BY NAME (A - Z) ===");
        System.out.println("========================================");

        Collections.sort(animals, new Comparator<Animal>() {
            @Override
            public int compare(Animal a1, Animal a2) {
                return a1.getName().compareToIgnoreCase(a2.getName());
            }
        });

        int no = 1;
        for (Animal animal : animals) {
            System.out.println(no + ". " + animal.getName() + " (" +
                    animal.getClass().getSimpleName() + ", " +
                    animal.getAge() + " tahun)");
            no++;
        }


        System.out.println();
        System.out.println("========================================");
        System.out.println("=== HEWAN SORTED BY AGE (ASCENDING) ===");
        System.out.println("========================================");

        Collections.sort(animals, new Comparator<Animal>() {
            @Override
            public int compare(Animal a1, Animal a2) {
                return Integer.compare(a1.getAge(), a2.getAge());
            }
        });

        no = 1;
        for (Animal animal : animals) {
            System.out.println(no + ". " + animal.getName() + " - " +
                    animal.getAge() + " tahun");
            no++;
        }
    }
}
