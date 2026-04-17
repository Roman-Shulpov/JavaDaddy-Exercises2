package main.java.mentorship.roadmap.Java_Core.step4_OOP.topic7_Shapes;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public double getArea() {
        return height * width;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
