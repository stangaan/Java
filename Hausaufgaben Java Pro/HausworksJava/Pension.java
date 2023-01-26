package HausworksJava;

public class Pension extends Main {

    private static final double PENSION_COEFFICIENT = 0.02;
    private static final int AVERAGE_SALARY = 1500;


    private String namePensionFond;

    private boolean isState;

    private int dateCreate;

    public Pension( String namePensionFond, boolean isState, int dateCreate) {
        this.namePensionFond = namePensionFond;
        this.isState = isState;
        this.dateCreate = dateCreate;
    }




    public double pensionСalculation(int age, double maxSalary, double minSalary){
       double averageSalary;
        if (isState){
            averageSalary = AveregeCalculationUtil.twoNamber(maxSalary,minSalary);
        }
        else {
            averageSalary = AveregeCalculationUtil.threeNamber(maxSalary, minSalary, AVERAGE_SALARY);
        }
        return averageSalary * age * PENSION_COEFFICIENT;

    }

}