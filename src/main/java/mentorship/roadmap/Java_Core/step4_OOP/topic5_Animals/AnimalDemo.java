package mentorship.roadmap.Java_Core.step4_OOP.topic5_Animals;

import java.util.ArrayList;
import java.util.List;

public class AnimalDemo {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Dog());
        animals.add(new Cat());
        for(Animal animal : animals) {
            animal.makeSound();
        }
    }
}
