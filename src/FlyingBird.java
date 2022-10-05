import java.util.Objects;

public class FlyingBird extends Bird {
    private String typeOfMovement;

    public FlyingBird(String name, int age, String livingEnvironment, String typeOfMovement) {
        super(name, age, livingEnvironment);
        this.typeOfMovement = typeOfMovement;

    }
public void printFlyingBird() {
    if (typeOfMovement.isBlank()) {
        System.out.println("Летающие птицы - " + getName() + ", срок жизни " + getAge() + " лет, среда обитания - " + getLivingEnvironment() +
                ", тип передвижения - " + typeOfMovement);
    } else {
        System.out.println("Летающие птицы - " + getName() + ", срок жизни " + getAge() + " лет, среда обитания - " + getLivingEnvironment() +
                ", тип передвижения - (информация не указана)");
    }
}
    @Override
    public void eat() {
        System.out.println("Питается всевозможными насекомыми и другими беспозвоночными,семенами, плодами,рыбой, грызунами");
    }
    @Override
    public void go() {
        System.out.println("Перемещается в воздушной среде");
    }

    public void fly() {
        System.out.println("Умеет летать");
    }

    @Override
    public void hunting() {
        System.out.println("Охотится за мелкими млекопитающими, насекомыми и рыбой");
    }

    public String getTypeOfMovement() {
        return typeOfMovement;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        FlyingBird that = (FlyingBird) o;
        return Objects.equals(typeOfMovement, that.typeOfMovement);
    }

    @Override
    public String toString() {
        return "FlyingBirds{" +
                "typeOfMovement='" + typeOfMovement + '\'' +
                '}';
    }
}


