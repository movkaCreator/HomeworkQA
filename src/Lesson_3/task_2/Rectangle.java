package Lesson_3.task_2;

public class Rectangle extends Shape{
    protected double width;
    protected double height;

    public Rectangle(double width, double height, String fillColor, String borderColor) {
        super(fillColor, borderColor);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return calculateRectanglePerimeter(width, height);
    }

    @Override
    public double getArea() {
        return calculateRectangleArea(width, height);
    }
}
