package animals;

public class Pet {

    protected String name;
    protected double weight;
    protected String color;


    public Pet() {
    }

    public Pet(String name, double weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    public String animalSound() {
        return "animal sound";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isHappy() {
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pet pet)) return false;

        if (Double.compare(pet.getWeight(), getWeight()) != 0) return false;
        if (getName() != null ? !getName().equals(pet.getName()) : pet.getName() != null) return false;
        return getColor() != null ? getColor().equals(pet.getColor()) : pet.getColor() == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getName() != null ? getName().hashCode() : 0;
        temp = Double.doubleToLongBits(getWeight());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (getColor() != null ? getColor().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "animals.Pet{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }
}
