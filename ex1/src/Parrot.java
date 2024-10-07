package ex1.src;

public class Parrot extends Bird {

    public Parrot(String name) {
        super(name);
        System.err.println("Parrot Constructor with name called.");
    }

    public Parrot() {
        super();
        System.err.println("Parrot Constructor called.");
    }

    public void makeSound() {
        System.out.println("Parrot sound");
    }

    public String getAnimalType() {
        return "Parrot";
    }
    
}

