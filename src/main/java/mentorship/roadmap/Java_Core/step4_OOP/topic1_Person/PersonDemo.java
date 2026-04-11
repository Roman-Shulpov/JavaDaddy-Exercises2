package mentorship.roadmap.Java_Core.step4_OOP.topic1_Person;

public class PersonDemo {
    public static void main(String[] args) {
        Person person = new Person("Roma", 15);
        person.setName("Vitya");
        String oldName = person.getName();
        person.setName("Roma");
        System.out.println("oldName: " + oldName);
        System.out.println("newName: " + person.getName());
        person.displayInfo();
    }
}
