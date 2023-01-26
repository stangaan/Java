package HausworksJava;

public class Worker extends Person{
    private double minSalary;
    private double maxSalary;
@Override
    public void die(){
        System.out.println("Этот человек не дожил до пенсии");
    }

    public double getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(double minSalary) {
        this.minSalary = minSalary;
    }

    public double getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(double maxSalary) {
        this.maxSalary = maxSalary;
    }
}
