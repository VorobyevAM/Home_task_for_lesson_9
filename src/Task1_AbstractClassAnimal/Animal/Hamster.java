package Task1_AbstractClassAnimal.Animal;

import Task2_FlyRunSwim.Animal_Interface.Run;

public class Hamster extends Animal implements Run {

    protected String nameTypeAnimal = "Хомяк";

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void sayAnimalType() {

        System.out.println(name + ": \"Я " + nameTypeAnimal + "\"");

    }

    @Override
    public void run() {
        System.out.println("Бегаю быстро! Только в колесе. Ну и от кошки.");
    }
}
