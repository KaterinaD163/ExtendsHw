import java.util.Objects;

public class Predator extends Mammal {
    private String typeOfFood;

    public Predator(String name, int age, String livingEnvironment, int movementSpeed, String typeOfFood) {
        super(name, age, livingEnvironment, movementSpeed);
        this.typeOfFood = typeOfFood;
    }

    public void printPredator() {
        if (!typeOfFood.isBlank()) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Predator predator = (Predator) o;
        return Objects.equals(typeOfFood, predator.typeOfFood);
    }

    @Override
    public String toString() {
        return "Predator{" +
                "typeOfFood='" + typeOfFood + '\'' +
                '}';
    }
}
