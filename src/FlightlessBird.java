import java.util.Objects;

public class FlightlessBird extends Bird {
    private String typeOfMovement;

    public FlightlessBird(String name, int age, String livingEnvironment, String typeOfMovement) {
        super(name, age, livingEnvironment);
        this.typeOfMovement = typeOfMovement;
    }

    public void printFlightlessBird() {
        if (typeOfMovement.isBlank()) {
            System.out.println("Нелетающие птицы - " + getName() + ", срок жизни " + getAge() + " лет, среда обитания - " + getLivingEnvironment() +
                    ", тип передвижения - " + typeOfMovement);
        } else {
            System.out.println("Нелетающие птицы - " + getName() + ", срок жизни " + getAge() + " лет, среда обитания - " + getLivingEnvironment() +
                    ", тип передвижения - (информация не указана)");
        }
    }

    @Override
    public void eat() {
        System.out.println("Питается травой, побегами деревьв и кустарниками, насекомыми и мелкими позвоночными");
    }

    @Override
    public void go() {
        System.out.println("Перемещается по ветвям, земле и воде, иногда даже плавают под водой");
    }

    public void walk() {
        System.out.println("Не умеет летать");
    }

    @Override
    public void hunting() {
        System.out.println("Охотится на насекомых, рыбу и моллюсков");
    }

    public String getTypeOfMovement() {
        return typeOfMovement;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        FlightlessBird that = (FlightlessBird) o;
        return Objects.equals(typeOfMovement, that.typeOfMovement);
    }

    @Override
    public String toString() {
        return "FlightlessBird{" +
                "typeOfMovement='" + typeOfMovement + '\'' +
                '}';
    }
}
