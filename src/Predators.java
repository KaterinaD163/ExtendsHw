import java.util.Objects;

public class Predators extends Mammals {
    private String typeOfFood;

    public Predators(String name, int age, String livingEnvironment, int movementSpeed, String typeOfFood) {
        super(name, age, livingEnvironment, movementSpeed);
        this.typeOfFood = typeOfFood;
        if (!typeOfFood.isEmpty() && !typeOfFood.isBlank()) {
            System.out.println("Хищник - " + getName() + ", срок жизни " + getAge() + " лет, среда обитания - " + getLivingEnvironment() +
                    ", скорость передвижения " + getMovementSpeed() + " км/ч, тип пищи - " + typeOfFood);
        } else {
            System.out.println("Хищник - " + getName() + ", срок жизни " + getAge() + ", среда обитания - " + getLivingEnvironment() +
                    ", скорость передвижения " + getMovementSpeed() + " км/ч, тип пищи - (информация не указана)");
        }
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void hunting() {
        System.out.println("Охотится за добычей");
    }

    @Override
    public void walk() {
        System.out.println("Передвигается по суше");
    }

    @Override
    public void eat() {
        System.out.println("Питаются другими млекопитающими");
    }

    @Override
    public void go() {
        System.out.println("Перемещаются по равнинамм и степям");
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Predators predators = (Predators) o;
        return Objects.equals(typeOfFood, predators.typeOfFood);
    }

    @Override
    public String toString() {
        return "Predators{" +
                "typeOfFood='" + typeOfFood + '\'' +
                '}';
    }
}
