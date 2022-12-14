
import java.util.Objects;



public class Herbivores extends Mammals {

    private  String typeOfFood;

    public Herbivores(String name) {
        this(name, 0, "no information", 0.0, "no information");
    }

    public Herbivores(String name, int age, String livingEnvironment, double movementSpeed, String typeOfFood) {
        super(name, age, livingEnvironment, movementSpeed);

        //this.typeOfFood = validateString(typeOfFood);
    }

    public void graze() {
    }

    public void printInfo() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Herbivores{" +
                "typeOfFood='" + typeOfFood + '\'' +
                ", movementSpeed=" + movementSpeed +
                ", age=" + age +
                '}';
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    //public void setTypeOfFood(String typeOfFood) {
      //  this.typeOfFood = validateString(typeOfFood);
   // }

    @Override
    public void walk() {
        System.out.println("I like to run fast");
    }

    @Override
    public void eat() {
        System.out.println("Eating grass");
    }

    @Override
    public void go() {
        System.out.println("I move quickly to any place I want");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Herbivores that = (Herbivores) o;
        return Objects.equals(typeOfFood, that.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfFood);
    }

}