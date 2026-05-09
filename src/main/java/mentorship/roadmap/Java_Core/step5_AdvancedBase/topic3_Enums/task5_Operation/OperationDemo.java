package mentorship.roadmap.Java_Core.step5_AdvancedBase.topic3_Enums.task5_Operation;

public class OperationDemo {
    public static void main(String[] args) {
        double x = 10.0;
        double y = 5.0;

        for (Operation op : Operation.values()) {
            double result = op.apply(x, y);
            System.out.printf("%f %s %f = %f%n", x, op.name(), y, result);
        }
    }
}
