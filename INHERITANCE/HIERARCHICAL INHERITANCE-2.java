class Animal {
    void sound() {
        System.out.println("Animal makes a sound.");
    }
}

// Subclass 1
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks.");
    }
}
class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows.");
    }
}
public class Hierarchical2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat()
        
        dog.sound(); // Calls Dog's sound method
        cat.sound(); // Calls Cat's sound method
    }
}
