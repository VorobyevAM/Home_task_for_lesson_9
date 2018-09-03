package Task1_AbstractClassAnimal.Animal;

public abstract class Animal {

    protected String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "кличка животного ='" + name + '\'' +
                '}';
    }

    public abstract void sayAnimalType();

}
