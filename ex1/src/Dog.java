package ex1.src;

public class Dog extends Mammal {

    public Dog(String name) {
        super(name);
        System.err.println("Dog Constructor with name called.");
    }

    public Dog() {
        super();
        System.err.println("Dog Constructor called.");
    }

    public void makeSound() {
        System.out.println("Dog sound");
    }
    
    public String getAnimalType() {
        return "Dog";
    }

}

