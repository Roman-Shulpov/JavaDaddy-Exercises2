package main.java.mentorship.roadmap.Java_Core.step4_OOP.topic9_String.task2_StringComparison;

public class StringComparison {
    public static void main() {
        String a = "Велосипед";
        String b = new String("Велосипед");
        System.out.println("a == b: " + (a == b));
        System.out.println("a.equals(b): " + a.equals(b));
    }
}
