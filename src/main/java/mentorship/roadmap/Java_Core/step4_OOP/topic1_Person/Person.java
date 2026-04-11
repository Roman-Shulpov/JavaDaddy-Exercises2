package mentorship.roadmap.Java_Core.step4_OOP.topic1_Person;

public class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void displayInfo(){
        System.out.println("Name: " + name + ", Age: " + age);
    }
}


