package ex1.src;

import java.util.ArrayList;
import java.util.List;

public class AnimalTest {
    public static void main(String[] args) throws Exception {

        // Lists for each type of animal
        List<Animal> animals = new ArrayList<>();
        List<Mammal> mammals = new ArrayList<>();
        List<Bird> birds = new ArrayList<>(); 
        List<Dog> dogs = new ArrayList<>();
        List<Parrot> parrots = new ArrayList<>();

        
        animals.add(new Dog());
        animals.add(new Parrot());
        animals.add(new Dog("Sam"));
        animals.add(new Parrot("Merty"));

        // Mammals
        mammals.add(new Mammal());
        mammals.add(new Mammal());
        mammals.add(new Mammal("Generic Mammal"));
        mammals.add(new Mammal("Another Mammal"));

        // Birds
        birds.add(new Bird());
        birds.add(new Bird());
        birds.add(new Bird("Generic Bird"));
        birds.add(new Bird("Another Bird"));

        // Dogs
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog("Rex"));
        dogs.add(new Dog("Max"));

        // Parrots
        parrots.add(new Parrot());
        parrots.add(new Parrot());
        parrots.add(new Parrot("Rio"));
        parrots.add(new Parrot("Coco"));

        
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

        
        System.out.println("\nTotal number of instances:");
        System.out.println("Animals: " + Animal.getNumberOfAnimals());
        System.out.println("Mammals: " + Mammal.getNumberOfMammals());
        System.out.println("Birds: " + Bird.getNumberOfBirds());
    }
}