package Task1_AbstractClassAnimal.Animal;

import Task2_FlyRunSwim.Animal_Interface.Fly;
import Task2_FlyRunSwim.Animal_Interface.Run;

public class Gull  extends Animal implements Fly, Run {

    protected String nameTypeAnimal = "Чайка";

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
    public void fly() {
        System.out.println("Я летаю!");
    }

    @Override
    public void run() {
        System.out.println("Я бегаю!");
    }
}
