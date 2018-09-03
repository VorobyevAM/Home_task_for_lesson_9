package Task3_HumanRunSwim;

import Task3_HumanRunSwim.Human.Human;
import Task3_HumanRunSwim.Person.NormalHuman;
import Task3_HumanRunSwim.Person.ProfesionalSwimmer;
import Task3_HumanRunSwim.Person.ProfessionalRunner;

public class Main {

    public static void main(String[] args) {

        Human alex = new NormalHuman("Александр",25,'M',"Программист");
        System.out.println(alex);
        alex.normalRun();
        alex.normalSwim();
        alex.professionRun();
        alex.professionSwim();
        System.out.println();

        Human ivan = new ProfesionalSwimmer("Иван", 24, 'M', "Спорткомплекс МТЛ Арена");
        System.out.println(ivan);
        ivan.normalRun();
        ivan.normalSwim();
        ivan.professionRun();
        ivan.professionSwim();
        System.out.println();

        Human olga = new ProfessionalRunner("Ольга", 23, 'F', "Стадион Локомотив");
        System.out.println(olga);
        olga.normalRun();
        olga.normalSwim();
        olga.professionRun();
        olga.professionSwim();

    }

}
