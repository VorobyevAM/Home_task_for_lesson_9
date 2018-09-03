package Task2_FlyRunSwim;

import Task1_AbstractClassAnimal.Animal.*;

public class Main {

    public static void main(String[] args) {

        Animal cat = new Cat();
        cat.setName("Мурка");
        cat.sayAnimalType();
        ((Cat) cat).run();
        ((Cat) cat).swim();
        System.out.println();

        Animal dog = new Dog();
        dog.setName("Барбос");
        dog.sayAnimalType();
        ((Dog) dog).run();
        ((Dog) dog).swim();
        System.out.println();

        Animal hamster = new Hamster();
        hamster.setName("Роджер");
        hamster.sayAnimalType();
        ((Hamster) hamster).run();
        System.out.println();

        Animal dolphin = new Dolphin();
        dolphin.setName("Фландер");
        dolphin.sayAnimalType();
        ((Dolphin) dolphin).swim();
        System.out.println();

        Animal gull = new Gull();
        gull.setName("Крюк");
        gull.sayAnimalType();
        ((Gull) gull).fly();
        ((Gull) gull).run();

    }

}
