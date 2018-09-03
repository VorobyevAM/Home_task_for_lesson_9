package Task1_AbstractClassAnimal.Animal;

import Task2_FlyRunSwim.Animal_Interface.Run;
import Task2_FlyRunSwim.Animal_Interface.Swim;

public class Cat extends Animal implements Run, Swim {

    protected String nameTypeAnimal = "Кошка";

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
        System.out.println("Бегаю быстро!");
    }

    @Override
    public void swim() {
        System.out.println("Плаваю так себе, стараюсь в воду не лезть.");
    }
}
