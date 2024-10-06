public abstract class Animal implements SoundsMaker{
    static int numberOfAnimals = 0;

    String name;

    public Animal() {
        numberOfAnimals++;
        System.err.println("Animal Constuctor called.");
        this.name = "Unkown Animal";
    }

    public Animal(String name) {
        numberOfAnimals++;
        System.err.println("Animal Constuctor with name called.");
        this.name = name;
    }

    public abstract String getAnimalType();

    public int getNumberOfAnimals() {
        return numberOfAnimals;
    }

}

