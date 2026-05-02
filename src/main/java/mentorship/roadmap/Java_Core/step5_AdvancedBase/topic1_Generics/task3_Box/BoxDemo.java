package main.java.mentorship.roadmap.Java_Core.step5_AdvancedBase.topic1_Generics.task3_Box;

public class BoxDemo {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.set("Hello");
        System.out.println(stringBox.get());

        Box<Integer> intBox = new Box<>();
        intBox.set(123);
        System.out.println(intBox.get());
    }
}