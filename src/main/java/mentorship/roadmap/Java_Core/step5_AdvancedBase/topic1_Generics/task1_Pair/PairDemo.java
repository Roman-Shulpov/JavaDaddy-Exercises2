package main.java.mentorship.roadmap.Java_Core.step5_AdvancedBase.topic1_Generics.task1_Pair;

public class PairDemo {
    public static void main(String[] args) {
        Pair pair = new Pair(5, 10);

        System.out.println("Пара: " + pair);

        System.out.println("Первое значение: " + pair.getFirst());
        System.out.println("Второе значение: " + pair.getSecond());

        pair.setFirst(15);
        pair.setSecond(20);

        System.out.println("Пара после изменений: " + pair);
        System.out.println("Первое значение: " + pair.getFirst());
        System.out.println("Второе значение: " + pair.getSecond());
    }
}