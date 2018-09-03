package Task3_HumanRunSwim.Person;

import Task3_HumanRunSwim.Human.Human;

public class NormalHuman extends Human {

    protected String profession;

    public NormalHuman(String name, int age, char sex, String profession) {
        super(name, age, sex);
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "NormalHuman{" +
                "profession='" + profession + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

    @Override
    public void professionRun() {
        System.out.println("Я бегаю не сильно быстро");
    }

    @Override
    public void normalRun() {
        System.out.println("Я могу плавать");
    }

    @Override
    public void professionSwim() {
        System.out.println("Я не профессиональный пловец");
    }

    @Override
    public void normalSwim() {
        System.out.println("Я могу бегать");
    }


}

