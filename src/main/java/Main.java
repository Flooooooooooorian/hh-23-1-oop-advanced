import animals.Cat;
import animals.Dog;
import animals.Feedable;
import animals.Pet;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        Dog myDog = new Dog("Lisa", 1.0, "rot", true);

        Cat myCat = new Cat("Steffen", true);

        myCat.feed(1);
        myDog.feed(10);

        Feedable myAnimal = new Dog("Florian", 3.6, "schwarz", true);

        myAnimal.feed(15);

//        System.out.println(myDog);
//        myDog.setHungry(true);
//        System.out.println(myDog);

//        Pet myPet = new Pet("Olaf", 16.2, "weiß");
//
//        System.out.println(myPet);


        Dog dog = new Dog();
        System.out.println(dog.animalSound());

        Cat cat = new Cat();
        System.out.println(cat.animalSound());

        Pet pet = new Pet();
        System.out.println(pet.animalSound());

        Pet currywurst = new Dog();
        System.out.println(currywurst.animalSound());

        List<String> myList = new ArrayList<>();

        List<Pet> myPets =  new ArrayList<>();
        myPets.add(cat);
        myPets.add(dog);

        System.out.println(myPets.get(0).animalSound());
        System.out.println(myPets.get(0));
    }
}
