package animals;

public class Cat extends Pet implements Feedable {

    private String name;
    private boolean hungry;

    public Cat() {
    }

    public Cat(String name, boolean hungry) {
        this.name = name;
        this.hungry = hungry;
    }

    public String animalSound() {
        return "miau";
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHungry() {
        return hungry;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    @Override
    public boolean isHappy() {
        return false;
    }

    @Override
    public void feed(int amount) {
        if (amount >= 5) {
            hungry = false;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat cat)) return false;

        if (isHungry() != cat.isHungry()) return false;
        return getName() != null ? getName().equals(cat.getName()) : cat.getName() == null;
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (isHungry() ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "animals.Cat{" +
                "name='" + name + '\'' +
                ", hungry=" + hungry +
                '}';
    }
}
