package Task1_AbstractClassAnimal;

import Task1_AbstractClassAnimal.Animal.*;

public class Main {

    public static void main(String[] args) {

        Animal cat = new Cat();
        cat.setName("Мурка");
        System.out.println(cat);
        cat.sayAnimalType();
        System.out.println();

        Animal dog = new Dog();
        dog.setName("Барбос");
        System.out.println(dog);
        dog.sayAnimalType();
        System.out.println();

        Animal hamster = new Hamster();
        hamster.setName("Роджер");
        System.out.println(hamster);
        hamster.sayAnimalType();
        System.out.println();

        Animal dolphin = new Dolphin();
        dolphin.setName("Фландер");
        System.out.println(dolphin);
        dolphin.sayAnimalType();
        System.out.println();

        Animal gull = new Gull();
        gull.setName("Крюк");
        System.out.println(gull);
        gull.sayAnimalType();
        System.out.println();

    }
}
