package HausworksJava;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pension pensionPeople = new Pension("People", TypeOfFond.NOT_STATE, 1945);
        Pension pensionState = new Pension("State", TypeOfFond.STATE, 1998);
        Pension pensionNot = new Pension("SCAM", TypeOfFond.SCAM, 2023);

        double statePension = pensionPeople.pensionСalculation(40, 1000.0, 2500.0, 4);
        double notStatePension = pensionState.pensionСalculation(40, 1000.0, 2500.0, 4);
        double scamPension = pensionNot.pensionСalculation(40,1000, 2500,4);
        System.out.println("Гос пенсия " + statePension);
        System.out.println("Приват пенсия " + notStatePension);
        System.out.println("МММ " + scamPension);
        Person person = new Person() {
            @Override
            void die() {
                System.out.println("Зато у меня " + getChildren() + "детей.");
            }
        };
        List<String> childrenPersons = new ArrayList<>();
        childrenPersons.add("Andrei");
        childrenPersons.add("Даниил");
        childrenPersons.add("Сидрах");
        childrenPersons.add("Mисаил");

        person.setName("Johan");
        person.setYears(43);
        person.setHeight(180);
        person.setWeight(83.5);
        person.setChildren(4);
        System.out.println(person);
        System.out.println("У меня детей- " + childrenPersons);
        System.out.println(person + " Твоя пенсия составит Euro:" + notStatePension);


        Worker worker = new Worker(){

        };
        List<String> childrenWorker = new ArrayList<>();
        childrenWorker.add("Andrei");
        childrenWorker.add("Pavel");
        childrenWorker.add("Ivan");
        childrenWorker.add("Ruvim");


        worker.setName("Roman");
        worker.setMaxSalary(2800);
        worker.setMinSalary(3500);
        worker.setYears(65);
        worker.setHeight(175);
        worker.setWeight(77);
        worker.setChildren(4);
        worker.company.add("Apple");
        worker.company.add("Microsoft");
        System.out.println(worker);
        System.out.println("У меня детей- " + childrenWorker);
        System.out.println(worker + " Твоя пенсия составит Euro:" + statePension);
    }
}
