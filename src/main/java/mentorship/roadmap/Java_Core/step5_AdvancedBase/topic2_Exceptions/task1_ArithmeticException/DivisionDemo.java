package main.java.mentorship.roadmap.Java_Core.step5_AdvancedBase.topic2_Exceptions.task1_ArithmeticException;

public class DivisionDemo {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        try {
            int c = a / b;
            System.out.println(c);
        } catch(ArithmeticException e){
            System.out.println("division by zero is impossible!");
        }
    }
}
