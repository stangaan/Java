package HausworksJava;

public class Main {
    public static void main(String[] args) {
        Pension pensionPeople = new Pension( "People", true, 1945);
        Pension pensionState = new Pension( "State", false, 1998);

        double statePension = pensionPeople.pensionСalculation(40,1000.0,2500.0);
        double notStatePension = pensionState.pensionСalculation(40,1000.0,2500.0);
        System.out.println(statePension);
        System.out.println(notStatePension);
        Person person = new Person() {
            @Override
            void die() {

            }
        };
        person.setName("Johan");
        person.setYears(43);
        person.setHeight(180);
        person.setWeight(83.5);

        Worker worker = new Worker();

        double answer = worker.calculatePension();
        worker.setMaxSalary(2800);
        worker.setMinSalary(3500);
        worker.setYears(65);
        System.out.println(worker + " Твоя пенсия составит Euro:" + answer);
    }
}
