package mentorship.roadmap.Java_Core.step4_OOP.topic13_ManagerAndEmployee;

public class Main {

    static class Employee {
        private String name;
        private double salary;

        private static int employeeCount = 0;

        public Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
            employeeCount++;
        }

        public double getAnnualSalary() {
            return salary * 12;
        }

        public static int getCount() {
            return employeeCount;
        }
    }

    static class Manager extends Employee {
        private final double bonus;

        public Manager(String name, double salary, double bonus) {
            super(name, salary);
            this.bonus = bonus;
        }

        @Override
        public double getAnnualSalary() {
            return super.getAnnualSalary() + bonus;
        }
    }

    public static void main(String[] args) {
        Manager m1 = new Manager("Roma", 100000, 50000);
        Manager m2 = new Manager("Vitya", 120000, 70000);

        System.out.println(m1.getAnnualSalary());
        System.out.println(m2.getAnnualSalary());

        System.out.println("Общее число сотрудников: " + Employee.getCount());
    }
}