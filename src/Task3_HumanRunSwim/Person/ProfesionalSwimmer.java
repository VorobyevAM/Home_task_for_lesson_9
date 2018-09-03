package Task3_HumanRunSwim.Person;

import Task3_HumanRunSwim.Human.Human;

public class ProfesionalSwimmer extends Human {

    protected String swimmingPool;

    public ProfesionalSwimmer(String name, int age, char sex, String swimmingPool) {
        super(name, age, sex);
        this.swimmingPool = swimmingPool;
    }

    public String getSwimmingPool() {
        return swimmingPool;
    }

    public void setSwimmingPool(String swimmingPool) {
        this.swimmingPool = swimmingPool;
    }

    @Override
    public String toString() {
        return "ProfesionalSwimmer{" +
                "swimmingPool='" + swimmingPool + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

    @Override
    public void professionRun() {
        System.out.println("Быстро бегаю");
    }

    @Override
    public void normalRun() {
        System.out.println("Я могу бегать");
    }

    @Override
    public void professionSwim() {
        System.out.println("Я профессиональный спортсмен");
    }

    @Override
    public void normalSwim() {
        System.out.println("Я могу плавать");
    }
}
