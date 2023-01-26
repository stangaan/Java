package HausworksJava;

public class Pensioner extends Person {

    private double pension;
    @Override
    public void die(){
        double x = (getYears() -50) * pension;

        System.out.println("Пенсионер умер и он не дожил до " + x);
    }

    public double getPension() {
        return pension;
    }

    public void setPension(double pension) {
        this.pension = pension;
    }
}
