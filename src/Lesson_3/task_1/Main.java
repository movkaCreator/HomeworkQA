package Lesson_3.task_1;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("Барсик"),
                new Cat("Дарсик"),
                new Dog("Бобик"),
                new Dog("Мухтар")
        };

        for (Animal o : animals) {
            o.run(400);
            o.swim(5);
        }

        System.out.println("Количество созданных животных: " + Animal.animalsCount);
        System.out.println("Количество созданных котов: " + Cat.catsCount);
        System.out.println("Количество созданных собак: " + Dog.dogsCount);

        Cat[] cats = {
                new Cat("Рыжик"),
                new Cat("Фунтик"),
                new Cat("Кузя"),
        };

        Cat.addFood(50);

        for (Cat o : cats) {
            o.eat(20);
        }

        for (Cat o : cats) {
            System.out.println(o.name + " сыт: " + o.isSatiety());
        }

        System.out.println("Остаток еды в миске: " + Cat.getFoodInBowl());
    }
}