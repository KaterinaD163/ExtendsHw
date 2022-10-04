import java.util.Objects;

public abstract class Animals {
    private String name;
    private int age;
    private String livingEnvironment;

    public Animals(String name, int age, String livingEnvironment) {
        this.name = name;
        this.age = age;
        this.livingEnvironment = livingEnvironment;
        if (!name.isEmpty() && !name.isBlank()) {
            this.name = name;
        } else {
            System.out.println("Информация не указана");
        }
        if (age != 0) {
            this.age = age;
        } else {
            System.out.println("Информация не указана");
        }
        if (!livingEnvironment.isEmpty() && !livingEnvironment.isBlank()) {
            this.livingEnvironment = livingEnvironment;
        } else {
            System.out.println("Информация не указана");
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
        Animals animals = (Animals) o;
        return age == animals.age && Objects.equals(name, animals.name) && Objects.equals(livingEnvironment, animals.livingEnvironment);
    }
}
