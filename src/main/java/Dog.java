public class Dog implements Feedable {

    private String name;
    private boolean hungry;

    public Dog() {
    }

    public Dog(String name, boolean hungry) {
        this.name = name;
        this.hungry = hungry;
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
    public void feed(int amount) {
        if (amount >= 10) {
            hungry = false;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog dog)) return false;

        if (isHungry() != dog.isHungry()) return false;
        return getName() != null ? getName().equals(dog.getName()) : dog.getName() == null;
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (isHungry() ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", hungry=" + hungry +
                '}';
    }
}
