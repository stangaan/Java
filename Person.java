public class Person {
    String name;
    int age;
    int growth;
    int weight;
    public Person(String name, int age, int growth, int weight) {
        this.name = name;
        this.age = age;
        this.growth = growth;
        this.weight = weight;
    }


public void info(){
    System.out.println("Name -" + name);
    System.out.println("age -" + age);
    System.out.println("growth -" +growth);
    System.out.println("weight -" +weight);
}
public void infoWork(){
        if (age>=60 || age<18){
            System.out.println("Отдыхаю дома!");
        }else {
            System.out.println("Иду на работу!");
        }
}
 }





