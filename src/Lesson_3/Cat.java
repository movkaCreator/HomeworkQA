package Lesson_3;

public class Cat extends Animal {
    protected static int catsCount = 0;

    public Cat(String name) {
        super(name, 200, 0);
        catsCount++;
    }
}