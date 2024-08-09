package Lesson_3;

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
    }
}