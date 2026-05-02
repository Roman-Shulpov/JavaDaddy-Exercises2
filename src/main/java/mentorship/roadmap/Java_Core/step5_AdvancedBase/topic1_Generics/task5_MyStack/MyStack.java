package main.java.mentorship.roadmap.Java_Core.step5_AdvancedBase.topic1_Generics.task5_MyStack;

import java.util.ArrayList;

public class MyStack<T> {
    private ArrayList<T> elements = new ArrayList<>();

    public void push(T element) {
        elements.add(element);
    }

    public T pop() {
        if (isEmpty()) {
            return null;
        }
        return elements.remove(elements.size() - 1);
    }

    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return elements.get(elements.size() - 1);
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }
}
