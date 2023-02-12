package HausworksJava;

public class Main {
    public static void main(String[] args) {
        Pension pensionPeople = new Pension( "People", TypeOfFond.NOT_STATE, 1945);
        Pension pensionState = new Pension( "State",TypeOfFond.STATE, 1998);
        Pension pensionNot = new Pension("SCAM", TypeOfFond.SCAM, 2023);

        double statePension = pensionPeople.pensionСalculation(40,1000.0,2500.0, children "Andrei");
        double notStatePension = pensionState.pensionСalculation(40,1000.0,2500.0, children 1);
        System.out.println(statePension);
        System.out.println(notStatePension);
        System.out.println(pensionNot);
        Person person = new Person() {
            @Override
            void die() {
                System.out.println("Зато у меня " + children + "детей.");
            }
        };
        person.setName("Johan");
        person.setYears(43);
        person.setHeight(180);
        person.setWeight(83.5);
        person.setChildren("Andrei");



        Worker worker = new Worker();

        double answer = worker.calculatePension();
        worker.setMaxSalary(2800);
        worker.setMinSalary(3500);
        worker.setYears(65);
        worker.setChildren("Andrei");
        worker.setChildren("Pavel");
        System.out.println(worker + " Твоя пенсия составит Euro:" + answer);
    }
}
