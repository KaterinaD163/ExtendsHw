public class Main {
    public static void main(String[] args) {
        Herbivores herbivores1 = new Herbivores("газель", 8, "саванны Африки и Азии",
                80, " трава и листья");
        herbivores1.sleep();
        herbivores1.eat();
        herbivores1.go();
        herbivores1.walk();
        herbivores1.graze();
        System.out.println();
        Herbivores herbivores2 = new Herbivores("жираф", 25, "саванны Африки",
                60, "листья деревьев");
        herbivores2.sleep();
        herbivores2.eat();
        herbivores2.go();
        herbivores2.walk();
        herbivores2.graze();
        System.out.println();
        Herbivores herbivores3 = new Herbivores("лошадь", 30, "луга, степи и саванны",
                60, "сено, солома, овёс, трава");
        herbivores3.sleep();
        herbivores3.eat();
        herbivores3.go();
        herbivores3.walk();
        herbivores3.graze();
        System.out.println();


        Predators predators1 = new Predators("гиена", 15, "Африка, юго-западная Азия",
                60, "мелкие позвоночные, ягнята, козлята");
        predators1.sleep();
        predators1.eat();
        predators1.go();
        predators1.walk();
        predators1.hunting();
        System.out.println();
        Predators predators2 = new Predators("тигр", 15, "Россия, Индия, Вьетнам, Таиланд",
                60, "кабаны олени, косули");
        predators2.sleep();
        predators2.eat();
        predators2.go();
        predators2.walk();
        predators2.hunting();
        System.out.println();
        Predators predators3 = new Predators("медведь", 40, "Евразия, Северная и Южная Америка",
                50, "насекомые, грызуны, косули");
        predators3.sleep();
        predators3.eat();
        predators3.go();
        predators3.walk();
        predators3.hunting();
        System.out.println();

        Amphibians amphibians1 = new Amphibians("лягушка", 10,
                "пресноводные водоёмы,суша, крона деревьев, подземные норы");
        amphibians1.sleep();
        amphibians1.eat();
        amphibians1.go();
        amphibians1.hunting();
        System.out.println();
        Amphibians amphibians2 = new Amphibians("уж пресноводный", 20,
                "Европа, Средняя Африка, Азия");
        amphibians2.sleep();
        amphibians2.eat();
        amphibians2.go();
        amphibians2.hunting();
        System.out.println();

        FlightlessBirds flightlessBirds1 = new FlightlessBirds("павлин", 15, "леса и саванны на полуострове Индостан и острове Цейлон",
                "в основном прогуливается, но может и подниматься на высоту более 900 метров");
        flightlessBirds1.sleep();
        flightlessBirds1.eat();
        flightlessBirds1.go();
        flightlessBirds1.hunting();
        flightlessBirds1.walk();
        System.out.println();
        FlightlessBirds flightlessBirds2 = new FlightlessBirds("пингвин", 25,
                "Галапагосские острова", "передвигаются по суше, переваливаясь с боку на бок, либо плавают под водой");
        flightlessBirds2.sleep();
        flightlessBirds2.eat();
        flightlessBirds2.go();
        flightlessBirds2.hunting();
        flightlessBirds2.walk();
        System.out.println();
        FlightlessBirds flightlessBirds3 = new FlightlessBirds("птица до-до", 10,
                "когда- то обитала на острове Маврикий", "способна бегать с большой скоростью");
        flightlessBirds3.sleep();
        flightlessBirds3.eat();
        flightlessBirds3.go();
        flightlessBirds3.hunting();
        flightlessBirds3.walk();
        System.out.println();

        FlyingBirds flyingBirds1 = new FlyingBirds("чайка", 20,
                "Азия, Россия, Китай, Япония, Австралия, Африка, Индия, Северная и Южная Америка, возле Аляски и Канады, ОАЭ, отдельные острова",
                "прекрасно плавает, бегает посуше");
        flyingBirds1.sleep();
        flyingBirds1.eat();
        flyingBirds1.go();
        flyingBirds1.hunting();
        flyingBirds1.fly();
        System.out.println();
        FlyingBirds flyingBirds2 = new FlyingBirds("альбатрос", 50, "ледяные воды Антарктиды и всё Южное полушарие",
                "прекрасно плавает, по суше передвигается с трудом, вразвалочку");
        flyingBirds2.sleep();
        flyingBirds2.eat();
        flyingBirds2.go();
        flyingBirds2.hunting();
        flyingBirds2.fly();
        System.out.println();
        FlyingBirds flyingBirds3 = new FlyingBirds("сокол", 16,
                "пустыни, тундра, тайга, луга, саванны, кустарниковые леса, горы, прибрежных районы, водно-болотные угодья, устья рек, берега озер",
                "осёдлый образ жизни, но могут улетать от дома за тысячу километров");
        flyingBirds3.sleep();
        flyingBirds3.eat();
        flyingBirds3.go();
        flyingBirds3.hunting();
        flyingBirds3.fly();
    }
}