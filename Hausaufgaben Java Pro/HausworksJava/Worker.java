package HausworksJava;

public class Worker extends Person implements AbleToCalculatePension {
    private double minSalary;
    private double maxSalary;
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
    Pension pensionGermany = new Pension( "Germany",true, 1888);
    int years =  getYears(60);
    double result = pensionGermany.pensionСalculation(years, minSalary, maxSalary);
        return result;
    }
}
