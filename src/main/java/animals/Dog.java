package animals;

public class Dog extends Pet implements Feedable {
    private boolean hungry;

    public Dog() {
    }

    public Dog(String name, double weight, String color, boolean hungry) {
        super(name, weight, color);
        this.hungry = hungry;
    }

    public boolean isHungry() {
        return hungry;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }


    @Override
    public boolean isHappy() {
        return true;
    }

    @Override
    public void feed(int amount) {
        if (amount >= 10) {
            hungry = false;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog dog)) return false;
        if (!super.equals(o)) return false;

        return isHungry() == dog.isHungry();
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (isHungry() ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "hungry=" + hungry +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                "} ";
    }
}
