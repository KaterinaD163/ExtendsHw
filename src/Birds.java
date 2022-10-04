public abstract class Birds extends Animals {
    public Birds(String name, int age, String livingEnvironment) {
        super(name, age, livingEnvironment);
    }

    @Override
    public void eat() {
        System.out.println("Питается растительной пищей, насекомыми, червями или млекопитающими");
    }

    @Override
    public void sleep() {
        System.out.println("Иногда спит");
    }

    @Override
    public void go() {
        System.out.println("Обитает в воздушной среде");
    }

    public abstract void hunting();
}
