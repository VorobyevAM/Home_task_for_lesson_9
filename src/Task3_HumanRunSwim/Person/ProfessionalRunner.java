package Task3_HumanRunSwim.Person;

import Task3_HumanRunSwim.Human.Human;
import Task3_HumanRunSwim.HumanInterfaces.Run;
import Task3_HumanRunSwim.HumanInterfaces.Swim;

public class ProfessionalRunner extends Human {

    protected String sportsStadium;

    public ProfessionalRunner(String name, int age, char sex, String sportsStadium) {
        super(name, age, sex);
        this.sportsStadium = sportsStadium;
    }

    public String getSportsStadium() {

        return sportsStadium;
    }

    public void setSportsStadium(String sportsStadium) {
        this.sportsStadium = sportsStadium;
    }

    @Override
    public String toString() {
        return "ProfessionalRunner{" +
                "sportsStadium='" + sportsStadium + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

    @Override
    public void professionRun() {
        System.out.println("Я профессиональный спортсмен");
    }

    @Override
    public void normalRun() {
        System.out.println("Я могу бегать");
    }

    @Override
    public void professionSwim() {
        System.out.println("Я могу плавать быстро");
    }

    @Override
    public void normalSwim() {
        System.out.println("Я могу плавать");
    }


}
