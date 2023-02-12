package HausworksJava;

public class Worker extends Person implements AbleToCalculatePension {
    private double minSalary;
    private double maxSalary;
    private int children;

    @Override
    public int getChildren() {
        return children;
    }

    public void setChildren(int children) {
        this.children = children;
    }

    private
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
    Pension pensionGermany = new Pension( "Germany", TypeOfFond.STATE, 1888);
    int years =  getYears(60);
    double result = pensionGermany.pensionСalculation(years, minSalary, maxSalary, children);
        return result;
    }
}
