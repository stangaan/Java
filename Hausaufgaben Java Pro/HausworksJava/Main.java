package HausworksJava;

public class Main {
    public static void main(String[] args) {
        Pension pensionPiple = new Pension(0.02, "Stars", true, 1945);
        pensionPiple.pensionСalculation(20,1000,1500);
        System.out.println(pensionPiple);
    }
}
