package Lesson_3.task_2;

public class Triangle extends Shape{
    protected double a, b, c;

    public Triangle(double a, double b, double c, String fillColor, String borderColor) {
        super(fillColor, borderColor);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getPerimeter() {
        return calculateTrianglePerimeter(a, b, c);
    }

    @Override
    public double getArea() {
        return calculateTriangleArea(a, b, c);
    }
}
