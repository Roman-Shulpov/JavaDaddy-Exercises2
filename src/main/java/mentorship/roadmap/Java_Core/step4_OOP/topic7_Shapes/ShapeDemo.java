package main.java.mentorship.roadmap.Java_Core.step4_OOP.topic7_Shapes;

public class ShapeDemo {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        circle.setRadius(50.00);
        System.out.println("Площадь окружности: " + circle.getArea());
        System.out.println("Периметр окружности : " + circle.getPerimeter());
        rectangle.setHeight(40.00);
        rectangle.setWidth(100.00);
        System.out.println("Площадь прямоугольника: "+ rectangle.getArea());
        System.out.println("Периметр прямоугольника: " + rectangle.getPerimeter());
    }
}
