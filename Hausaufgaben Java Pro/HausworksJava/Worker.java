package HausworksJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Worker extends Person implements AbleToCalculatePension {
    private double minSalary;
    private double maxSalary;

List<String> company = new ArrayList<>();

    public void setCompany(List<String> company) {
        this.company = company;
    }


    @Override
    public void die(){
        System.out.println("Этот человек не дожил до пенсии");
    }

    public double getMinSalary(int i) {
        return minSalary;
    }

    public void setMinSalary(double minSalary) {
        this.minSalary = minSalary;
    }

    public double getMaxSalary(int i) {
        return maxSalary;
    }

    public void setMaxSalary(double maxSalary) {
        this.maxSalary = maxSalary;
    }

    @Override
    public double calculatePension() {
        int children = getChildren();
    Pension pensionGermany = new Pension( "Germany", TypeOfFond.STATE, 1888);
    int years =  getYears(60);
    int result = (int) pensionGermany.pensionСalculation(years, minSalary, maxSalary, children);
        return result;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Worker worker = (Worker) o;
        int children = getChildren();
        return Double.compare(worker.minSalary, minSalary) == 0 && Double.compare(worker.maxSalary, maxSalary) == 0 && children == worker.children && company.equals(worker.company);
    }

    @Override
    public int hashCode() {
        Object children = new Object();
        return Objects.hash(super.hashCode(), minSalary, maxSalary, children, company);
    }
}
