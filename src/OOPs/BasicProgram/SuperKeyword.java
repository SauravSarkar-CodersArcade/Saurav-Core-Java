package OOPs.BasicProgram;

class Animal {
    protected String species;

    public Animal(String species) {
        this.species = species;
    }

    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    private String breed;

    public Dog(String species, String breed) {
        super(species); // Call the parameter of the superclass
        this.breed = breed;
    }

    public void makeSound() {
        System.out.println("Dog barks");
    }

    public void displayInfo() {
        System.out.println("Species: " + super.species); // Accessing the field of the superclass
        System.out.println("Breed: " + this.breed);
        super.makeSound(); // Invoking the method of the superclass
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Dog dog = new Dog("Canine", "Labrador");
        dog.displayInfo();
    }
}

