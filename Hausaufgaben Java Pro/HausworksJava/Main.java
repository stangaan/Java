package HausworksJava;

public class Main {
    public static void main(String[] args) {
        Pension pensionPeople = new Pension( "People", true, 1945);
        Pension pensionState = new Pension( "State", false, 1998);

        double statePension = pensionPeople.pensionСalculation(40,1000.0,2500.0);
        double notStatePension = pensionState.pensionСalculation(40,1000.0,2500.0);
        System.out.println(statePension);
        System.out.println(notStatePension);
    }
}
