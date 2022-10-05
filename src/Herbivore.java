import java.util.Objects;

public class Herbivore extends Mammal {
    private String typeOfFood;

    public Herbivore(String name, int age, String livingEnvironment, int movementSpeed, String typeOfFood) {
        super(name, age, livingEnvironment, movementSpeed);
        this.typeOfFood = typeOfFood;
    }

    public void printHerbivore() {
        if (!typeOfFood.isBlank()) {
            System.out.println("Травоядное - " + getName() + ", срок жизни " + getAge() + " лет, среда обитания - " + getLivingEnvironment() +
                    ", скорость передвижения " + getMovementSpeed() + " км/ч, тип пищи - " + typeOfFood);
        } else {
            System.out.println("Травоядное - " + getName() + ", срок жизни " + getAge() + ", среда обитания - " + getLivingEnvironment() +
                    ", скорость передвижения " + getMovementSpeed() + " км/ч, тип пищи - (информация не указана)");
        }
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void graze() {
        System.out.println("Пасётся");
    }

    @Override
    public void eat() {
        System.out.println("Питается травой");
    }

    @Override
    public void go() {
        System.out.println("Перемещается по равнине или горной местности");
    }

    @Override
    public void walk() {
        System.out.println("Передвигается по суше");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Herbivore that = (Herbivore) o;
        return Objects.equals(typeOfFood, that.typeOfFood);
    }

    @Override
    public String toString() {
        return "Herbivores{" +
                "typeOfFood='" + typeOfFood + '\'' +
                '}';
    }
}


