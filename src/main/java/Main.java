
public class Main {

    public static void main(String[] args) {


        Dog myDog = new Dog("Lisa", true);

        Cat myCat = new Cat("Steffen", true);

        myCat.feed(1);
        myDog.feed(10);

        Feedable myAnimal = new Dog("Florian", true);

        myAnimal.feed(15);

        myDog.getAddress(true);
    }
}
