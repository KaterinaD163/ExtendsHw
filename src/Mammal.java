public abstract class Mammal extends Animal {
    private int movementSpeed;

    public Mammal(String name, int age, String livingEnvironment, int movementSpeed) {
        super(name, age, livingEnvironment);
        this.movementSpeed = movementSpeed;
        if (movementSpeed <= 0) {
            this.movementSpeed = 0;
        } else {
            this.movementSpeed = movementSpeed;
        }
    }

    public int getMovementSpeed() {
        return movementSpeed;
    }

    @Override
    public void eat() {
        System.out.println("Питается травой или мелкими грызунами");
    }

    @Override
    public void go() {
        System.out.println("Перемещается по равнинной или горной местности");
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
        Mammal mammals = (Mammal) o;
        return movementSpeed == mammals.movementSpeed;
    }

}
