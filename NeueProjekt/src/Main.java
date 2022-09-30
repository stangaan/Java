public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Задача");
        System.out.println("Феликс прожил 3011456567 секунд");
        System.out.println("Сколько лет прожил Феликс?");
        long liveFel =3011456_567L;
        int yours = (int) (liveFel / (60*60*24*360));
        System.out.println("Феликс прожил: " + yours + " лет");



    }
}