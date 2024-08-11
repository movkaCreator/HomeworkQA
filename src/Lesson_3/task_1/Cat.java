package Lesson_3.task_1;

public class Cat extends Animal {
    protected static int catsCount = 0;
    private static int foodInBowl = 0;
    private boolean satiety;

    public Cat(String name) {
        super(name, 200, 0);
        satiety = false;
        catsCount++;
    }

    public static void addFood(int amount) {
        if (amount > 0) {
            foodInBowl += amount;
            System.out.println("Добавлено " + amount + " еды в миску. Текущий уровень еды: " + foodInBowl);
        }
    }

    public void eat(int amount) {
        if (amount > 0 && foodInBowl >= amount) {
            foodInBowl -= amount;
            satiety = true;
            System.out.println(name + " покушал " + amount + " еды и теперь сыт.");
        } else {
            satiety = false;
            System.out.println(name + " не смог покушать, так как в миске недостаточно еды.");
        }
    }

    public static int getFoodInBowl() {
        return foodInBowl;
    }

    public boolean isSatiety() {
        return satiety;
    }
}