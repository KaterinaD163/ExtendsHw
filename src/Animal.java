import java.util.Objects;

public abstract class Animal {
    private String name;
    private int age;
    private String livingEnvironment;

    public Animal(String name, int age, String livingEnvironment) {
        this.name = name;
        this.age = age;
        this.livingEnvironment = livingEnvironment;
        if (!name.isBlank()) {
            this.name = name;
        } else {
            this.name = " (информация не указана)";
        }
        if (age <= 0) {
            this.age = 0;
        } else {
            this.age = age;
        }
        if (!livingEnvironment.isBlank()) {
            this.livingEnvironment = livingEnvironment;
        } else {
            this.livingEnvironment = " (информация не указана)";
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public abstract void eat();

    public abstract void sleep();

    public abstract void go();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animals = (Animal) o;
        return age == animals.age && Objects.equals(name, animals.name) && Objects.equals(livingEnvironment, animals.livingEnvironment);
    }
}
