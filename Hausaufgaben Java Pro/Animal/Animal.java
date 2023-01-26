package Animal;

public class Animal implements Speakable {
    @Override
    public void speak() {
        System.out.println("Животное произносит звук" );
    }
}
