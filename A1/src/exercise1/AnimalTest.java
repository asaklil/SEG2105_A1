package exercise1;

import java.util.ArrayList;
import java.util.List;

public class AnimalTest {
    public static void main(String[] args) throws Exception {
        // Create lists for each type of animal
        List<Animal> animals = new ArrayList<>();
        List<Mammal> mammals = new ArrayList<>();
        List<Bird> birds = new ArrayList<>();
        List<Dog> dogs = new ArrayList<>();
        List<Parrot> parrots = new ArrayList<>();

        // Add instances to each list
        // Animals (abstract, so we add other instances)
        animals.add(new Dog());
        animals.add(new Parrot());
        animals.add(new Dog("Buddy", 3));
        animals.add(new Parrot("Polly", 2));

        // Mammals
        mammals.add(new Mammal());
        mammals.add(new Mammal());
        mammals.add(new Mammal("Generic Mammal", 5));
        mammals.add(new Mammal("Another Mammal", 4));

        // Birds
        birds.add(new Bird());
        birds.add(new Bird());
        birds.add(new Bird("Generic Bird", 2));
        birds.add(new Bird("Another Bird", 1));

        // Dogs
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog("Rex", 4));
        dogs.add(new Dog("Max", 2));

        // Parrots
        parrots.add(new Parrot());
        parrots.add(new Parrot());
        parrots.add(new Parrot("Rio", 3));
        parrots.add(new Parrot("Coco", 5));

        // Iterate over each list and call makeSound()
        System.out.println("Animals making sounds:");
        for (Animal animal : animals) {
            animal.makeSound();
        }

        System.out.println("\nMammals making sounds:");
        for (Mammal mammal : mammals) {
            mammal.makeSound();
        }

        System.out.println("\nBirds making sounds:");
        for (Bird bird : birds) {
            bird.makeSound();
        }

        System.out.println("\nDogs making sounds:");
        for (Dog dog : dogs) {
            dog.makeSound();
        }

        System.out.println("\nParrots making sounds:");
        for (Parrot parrot : parrots) {
            parrot.makeSound();
        }

        // Print total number of created instances for each class
        System.out.println("\nTotal number of instances:");
        System.out.println("Animals: " + Animal.getNumberOfAnimals());
        System.out.println("Mammals: " + Mammal.getNumberOfMammals());
        System.out.println("Birds: " + Bird.getNumberOfBirds());
        System.out.println("Dogs: " + Dog.getNumberOfDogs());
        System.out.println("Parrots: " + Parrot.getNumberOfParrots());
    }
}