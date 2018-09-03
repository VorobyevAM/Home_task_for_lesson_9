package Task3_HumanRunSwim.Human;


import Task3_HumanRunSwim.HumanInterfaces.Run;
import Task3_HumanRunSwim.HumanInterfaces.Swim;

public abstract class Human implements Run, Swim {

    protected String name;
    protected int age;
    protected char sex;

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

    public Human() {
    }

    public Human(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

}
