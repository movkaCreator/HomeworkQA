package Lesson_3.task_1;

public class Animal {
    protected static int animalsCount = 0;

    protected String name;
    protected int runLimit;
    protected int swimLimit;

    public Animal(String name, int runLimit, int swimLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        animalsCount++;
    }

    public void run(int distance) {
        if (distance <= runLimit) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать такое расстояние.");
        }
    }

    public void swim(int distance) {
        if (swimLimit == 0) {
            System.out.println(name + " не умеет плавать.");
            return;
        }
        if (distance <= swimLimit) {
            System.out.println(name + " проплыл " + distance + " м.");
        } else {
            System.out.println(name + " не может проплыть такое расстояние.");
        }
    }
}