package Lesson_3.task_2;

public class Circle extends Shape{
    protected double radius;

    public Circle(double radius, String fillColor, String borderColor) {
        super(fillColor, borderColor);
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return calculateCirclePerimeter(radius);
    }

    @Override
    public double getArea() {
        return calculateCircleArea(radius);
    }
}
