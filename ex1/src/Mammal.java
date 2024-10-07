package ex1.src;

public class Mammal extends Animal {
    static int numberOfMammals = 0;
    public Mammal(String name) {
        super(name);
        numberOfMammals++;
        System.err.println("Mammal Constructor with name called.");
    }

    public Mammal() {
        super();
        numberOfMammals++;
        System.err.println("Mammal Constructor called.");
    }

    public String getAnimalType() {
        return "Mammal";
    }

    public void makeSound() {
        System.out.println("Mammal sound");
    }

    public static int getNumberOfMammals() {
        return numberOfMammals;
    }
}

