package mentorship.roadmap.Java_Core.step5_AdvancedBase.topic2_Exceptions.task4_MultiExceptionDemo;

public class MultiExceptionDemo {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            int ghostNumber = numbers[2];
            String text = null;
            System.out.println("норм всё");
            // System.out.println(text.length());
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("ошибка: " + e.getClass().getSimpleName());
            System.out.println("Сообщение: " + e.getMessage());
        }
    }
}
