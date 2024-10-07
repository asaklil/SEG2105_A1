package ex1.src;

public class Bird extends Animal {
    static int numberOfBirds = 0;
    public Bird(String name) {
        super(name);
        numberOfBirds++;
        System.err.println("Bird Constructor with name called.");
    }

    public Bird() {
        super();
        numberOfBirds++;
        System.err.println("Bird Constructor called.");
    }

    public String getAnimalType() {
        return "Bird";
    }

    public void makeSound() {
        System.out.println("Bird sound");
    }

    public static int getNumberOfBirds() {
        return numberOfBirds;
    }
}
