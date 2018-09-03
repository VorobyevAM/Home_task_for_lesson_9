package Task1_AbstractClassAnimal.Animal;

import Task2_FlyRunSwim.Animal_Interface.Swim;

public class Dolphin  extends Animal implements Swim {

    protected String nameTypeAnimal = "Дельфин";

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
    public void swim() {
        System.out.println("Я плаваю!");
    }
}
