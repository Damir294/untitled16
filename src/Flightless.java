

import java.util.Objects;


public class Flightless extends Birds {

   private final String typeOfMovement;

    public Flightless(String name, int age, String livingEnvironment, String typeOfMovement) {
        super(name, age, livingEnvironment);

        this.typeOfMovement = ValidateUtils.validateString(typeOfMovement);
    }

    public void printInfo() {
        System.out.println(this);
    }

    @Override
    public void hunt() {
        System.out.println("Hunting to live");
    }

    @Override
    public void eat() {
        System.out.println("I eat what I catch");
    }

    @Override
    public void go() {
        System.out.println("I quickly move my legs");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flightless that = (Flightless) o;
        return Objects.equals(typeOfMovement, that.typeOfMovement);
    }

    @Override
    public int hashCode() {
        int hash1 = Objects.hash(super.hashCode(), typeOfMovement);
        return hash1;
    }

    @Override
    public String toString() {
        String name = null;
        String livingEnvironment = null;
        return "Class Flightless; " +
                "typeOfMovement: " + typeOfMovement +
                "; livingEnvironment: " + livingEnvironment +
                "; name: " + name +
                "; age: " + age +
                " years.";
    }
}