package main.java.mentorship.roadmap.Java_Core.step5_AdvancedBase.topic1_Generics.task5_MyStack;

public class MyStackDemo {
    public static void main(String[] args) {
        MyStack<String> stack = new MyStack<>();

        stack.push("one");
        stack.push("two");
        stack.push("three");

        System.out.println(stack.peek());

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        System.out.println("Пустой? " + stack.isEmpty());
        System.out.println("Поп из пустого: " + stack.pop());
    }
}
