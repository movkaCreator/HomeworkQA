package Lesson_3.task_2;

public interface IShape {
    double getPerimeter();
    double getArea();
    String getFillColor();
    String getBorderColor();

    default void printCharacteristics() {
        System.out.println("Периметр: " + getPerimeter() + "\nПлощадь: " + getArea()
                + "\nЦвет фона: " + getFillColor() + "\nЦвет границ: " + getBorderColor());
    }

    default double calculateCirclePerimeter(double radius) {
        return 2 * Math.PI * radius;
    }

    default double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    default double calculateRectanglePerimeter(double width, double height) {
        return 2 * (width + height);
    }

    default double calculateRectangleArea(double width, double height) {
        return width * height;
    }

    default double calculateTrianglePerimeter(double a, double b, double c) {
        return a + b + c;
    }

    default double calculateTriangleArea(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}