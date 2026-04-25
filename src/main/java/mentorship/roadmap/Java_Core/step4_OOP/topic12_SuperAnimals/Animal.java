package mentorship.roadmap.Java_Core.step4_OOP.topic12_SuperAnimals;

class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    void makeSound() {

    }
}

class Dog extends Animal {
    String breed;

    public Dog(String name) {
        super(name);
    }

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    @Override
    void makeSound() {
        System.out.println("Гав");
    }

    public static void main(String[] args) {
        Dog myDog = new Dog("Пэпа", "мопс");
        System.out.println(myDog.name + " (" + myDog.breed + ")");
        myDog.makeSound();
    }
}