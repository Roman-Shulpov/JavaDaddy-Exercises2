package mentorship.roadmap.Java_Core.step5_AdvancedBase.topic2_Exceptions.task2_InvalidAgeException;

public class AgeChecker {

    public static void main(String[] args) {
        try {
            checkAge(25);
        } catch (InvalidAgeException e) {
            System.out.println("ошибка: " + e.getMessage());
        }
    }
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("возраст: " + age + ". Должен быть от 0 до 150.");
        }

        System.out.println("Возраст " + age + " норм");
    }
}