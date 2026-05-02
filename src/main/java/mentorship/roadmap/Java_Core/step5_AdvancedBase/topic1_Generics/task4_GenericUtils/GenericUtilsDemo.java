package main.java.mentorship.roadmap.Java_Core.step5_AdvancedBase.topic1_Generics.task4_GenericUtils;

public class GenericUtilsDemo {
    public static void main(String[] args) {
        Integer num1 = 10;
        Integer num2 = 20;
        System.out.println("Больше из чисел: " + GenericUtils.max(num1, num2));

        String str1 = "pepapepa";
        String str2 = "pepa";
        System.out.println("Больше из строк: " + GenericUtils.max(str1, str2));
    }
}
