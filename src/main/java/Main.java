import animals.Cat;
import animals.Dog;
import animals.Feedable;
import animals.Pet;

public class Main {

    public static void main(String[] args) {


        Dog myDog = new Dog("Lisa", 1.0, "rot", true);

        Cat myCat = new Cat("Steffen", true);

        myCat.feed(1);
        myDog.feed(10);

        Feedable myAnimal = new Dog("Florian", 3.6, "schwarz", true);

        myAnimal.feed(15);

        System.out.println(myDog);
        myDog.setHungry(true);
        System.out.println(myDog);

        Pet myPet = new Pet();

        System.out.println(myPet);

    }
}
