package Lesson_3;

public class Dog extends Animal {
    protected static int dogsCount = 0;

    public Dog(String name) {
        super(name, 500, 10);
        dogsCount++;
    }
}
