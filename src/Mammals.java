import java.util.Objects;

public abstract class Mammals extends Animals {
    private int movementSpeed;

    public Mammals(String name, int age, String livingEnvironment, int movementSpeed) {
        super(name, age, livingEnvironment);
        this.movementSpeed = movementSpeed;
        if (movementSpeed != 0) {
            this.movementSpeed = movementSpeed;
        } else {
            System.out.println(" (информация не указана)");
        }
    }

    public int getMovementSpeed() {
        return movementSpeed;
    }

    @Override
    public void eat() {

    }

    @Override
    public void go() {

    }

    @Override
    public void sleep() {
        System.out.println("Иногда спит");
    }

    public abstract void walk();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammals mammals = (Mammals) o;
        return movementSpeed == mammals.movementSpeed;
    }

}
