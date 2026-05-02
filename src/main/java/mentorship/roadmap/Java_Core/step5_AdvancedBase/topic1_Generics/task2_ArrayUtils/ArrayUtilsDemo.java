package main.java.mentorship.roadmap.Java_Core.step5_AdvancedBase.topic1_Generics.task2_ArrayUtils;

public class ArrayUtilsDemo {
    public static void main(String[] args) {
        Integer[] numbers = {10, 20, 30, 40, 50};
        printArray(numbers);
        ArrayUtils.swap(numbers, 0, 4);
        printArray(numbers);
        ArrayUtils.swap(numbers, -1, 10);
        printArray(numbers);

        String[] strings = {"a", "b", "c"};
        printArray(strings);
        ArrayUtils.swap(strings, 1, 2);
        printArray(strings);
        ArrayUtils.swap(strings, -1, 10);
        printArray(strings);
    }

    private static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}