public class Main {
    public static void main(String[] args) {
Person secondPerson = new Person("Andrei", 49,180,85);
Person twoPerson = new Person("Dima",17,160,60);
        System.out.println("Имя "+ secondPerson.name);
        System.out.println(secondPerson.age);
        System.out.println(secondPerson.weight);
        System.out.println(secondPerson.growth);
        System.out.println(twoPerson);
secondPerson.info();
secondPerson.infoWork();
        twoPerson.info();
        twoPerson.infoWork();

    }





}
