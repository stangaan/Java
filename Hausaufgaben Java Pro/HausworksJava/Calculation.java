package HausworksJava;


public class Calculation extends Main {

    public int averigePensioncalculation(int minPension, int maxPension, int children){
        return (minPension + maxPension) / 2 + (children * 200);
    }


}

