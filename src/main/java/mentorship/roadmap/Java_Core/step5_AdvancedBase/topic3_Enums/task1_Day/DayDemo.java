package mentorship.roadmap.Java_Core.step5_AdvancedBase.topic3_Enums.task1_Day;

public class DayDemo {
    public static void main(String[] args) {
        Day[] allDays = Day.values();
        for (Day day : allDays) {
            System.out.println(day);
        }
    }
}
