

import java.util.Objects;



public abstract class Animals {
    private String name;
    int age;

    public Animals(String name) {
        this(name, 0);
    }

    public Animals(String name, int age) {
        this.name = ValidateUtils.validateString(name);
        this.age = ValidateUtils.validateNum(age);
    }

    public abstract void eat();

    public void sleep() {
    }

    public abstract void go();

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = ValidateUtils.validateString(name);
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return age == animals.age && Objects.equals(name, animals.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}