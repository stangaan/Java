package Animal;

public class Hunter implements Speakable, Drivingable{
    @Override
    public void speak() {
        System.out.println("Hunter.speak Привет я человек!");
    }

    @Override
    public void drive() {
        System.out.println("Hunter drive");
    }
}
