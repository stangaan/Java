package HausworksJava;

import java.util.Objects;

public class Pension extends Main {

    private static final double PENSION_COEFFICIENT = 0.02;
    private static final int AVERAGE_SALARY = 3000;


    private String namePensionFond;

    private TypeOfFond type;

    private int dateCreate;

    public Pension(String namePensionFond, TypeOfFond type, int dateCreate) {
        this.namePensionFond = namePensionFond;
        this.type = type;
        this.dateCreate = dateCreate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pension pension = (Pension) o;
        return dateCreate == pension.dateCreate && Objects.equals(namePensionFond, pension.namePensionFond) && type == pension.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(namePensionFond, type, dateCreate);
    }

    @Override
    public String toString() {
        return "Pension{" +
                "namePensionFond='" + namePensionFond + '\'' +
                ", type=" + type +
                ", dateCreate=" + dateCreate +
                '}';
    }

    public double pensionСalculation(int age, double maxSalary, double minSalary){
       double averageSalary;
       switch (type){
           case STATE;
               averageSalary = AveregeCalculationUtil.averege(maxSalary,minSalary);
            break;
           case NOT_STATE;
               averageSalary = AveregeCalculationUtil.averege(maxSalary, minSalary, AVERAGE_SALARY);
            break;
           case SCAM;
               averageSalary = 0;
               default;
               averageSalary = 0;
       }
        return averageSalary * age * PENSION_COEFFICIENT;



    }

}