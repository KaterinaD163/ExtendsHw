public class Amphibian extends Animal {
    public Amphibian(String name, int age, String livingEnvironment) {
        super(name, age, livingEnvironment);
    }

    public void printAmphibian() {
        System.out.println("Земноводное - " + getName() + ", срок жизни " + getAge() + " лет, среда обитания - " + getLivingEnvironment());
    }

    public void hunting() {
        System.out.println("Охотится за добычей");
    }

    @Override
    public void eat() {
        System.out.println("Питается насекомыми, рыбой или другими земноводными");
    }

    @Override
    public void go() {
        System.out.println("Перемещается в водной среде");
    }

    @Override
    public void sleep() {
        System.out.println("Иногда спит");
    }

    @Override
    public String toString() {
        return "Amphibians{}";
    }
}
