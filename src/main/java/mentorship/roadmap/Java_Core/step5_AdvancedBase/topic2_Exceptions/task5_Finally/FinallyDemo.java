package mentorship.roadmap.Java_Core.step5_AdvancedBase.topic2_Exceptions.task5_Finally;

public class FinallyDemo {
    public static void main(String[] args) {
        try {
            System.out.println("Ресурс открыт");
            int a = 10;
            int b = 2;
            int result = a / b;
            System.out.println("Результат: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: Деление на ноль невозможно!");
        } finally {
            System.out.println("Ресурс закрыт");
        }
    }
}
