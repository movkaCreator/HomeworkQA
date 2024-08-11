package Lesson_3.task_2;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[] {
                new Circle(3.0, "Красный", "Черный"),
                new Rectangle(4.0, 6.0, "Голубой", "Зеленый"),
                new Triangle(3.0, 4.0, 5.0, "Желтый", "Розовый")
        };

        for (Shape o : shapes) {
            System.out.println("Результат полученных характеристик:");
            o.printCharacteristics();
        }
    }
}
