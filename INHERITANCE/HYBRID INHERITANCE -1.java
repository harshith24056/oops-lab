class Animal {
    public void displayAnimal() {
        System.out.println("This is an animal.");
    }
}

interface Mammal {
    void mammalSound();
}

interface Bird {
    void birdSound();
}

public class HybridAnimal extends Animal implements Mammal, Bird {
    @Override
    public void mammalSound() {
        System.out.println("Mammal sound: Roar");
    }
    @Override
    public void birdSound() {
        System.out.println("Bird sound: Chirp");
    }
    public void displayHybrid() {
        System.out.println("This is a hybrid animal.");
    }
    public static void main(String[] args) {
        HybridAnimal hybrid = new HybridAnimal();
        System.out.println("Implementation of Hybrid Inheritance in Java");
        hybrid.displayAnimal();  
        hybrid.mammalSound();    
        hybrid.birdSound();      
        hybrid.displayHybrid();   
    }
}
