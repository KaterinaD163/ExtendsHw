public class Main {
    public static void main(String[] args) {

        Herbivore herbivore1 = new Herbivore("газель", 8, "",
                80, " трава и листья");
        herbivore1.printHerbivore();
        herbivore1.sleep();
        herbivore1.eat();
        herbivore1.go();
        herbivore1.walk();
        herbivore1.graze();
        System.out.println();
        Herbivore herbivore2 = new Herbivore("жираф", 25, "саванны Африки",
                60, "листья деревьев");
        herbivore2.printHerbivore();
        herbivore2.sleep();
        herbivore2.eat();
        herbivore2.go();
        herbivore2.walk();
        herbivore2.graze();
        System.out.println();
        Herbivore herbivore3 = new Herbivore("лошадь", 30, "луга, степи и саванны",
                60, "сено, солома, овёс, трава");
        herbivore3.printHerbivore();
        herbivore3.sleep();
        herbivore3.eat();
        herbivore3.go();
        herbivore3.walk();
        herbivore3.graze();
        System.out.println();


        Predator predator1 = new Predator("гиена", 15, "Африка, юго-западная Азия",
                60, "мелкие позвоночные, ягнята, козлята");
        predator1.printPredator();
        predator1.sleep();
        predator1.eat();
        predator1.go();
        predator1.walk();
        predator1.hunting();
        System.out.println();
        Predator predator2 = new Predator("тигр", 15, "Россия, Индия, Вьетнам, Таиланд",
                60, "кабаны олени, косули");
        predator2.printPredator();
        predator2.sleep();
        predator2.eat();
        predator2.go();
        predator2.walk();
        predator2.hunting();
        System.out.println();
        Predator predator3 = new Predator("медведь", 40, "Евразия, Северная и Южная Америка",
                50, "насекомые, грызуны, косули");
        predator3.printPredator();
        predator3.sleep();
        predator3.eat();
        predator3.go();
        predator3.walk();
        predator3.hunting();
        System.out.println();

        Amphibian amphibian1 = new Amphibian("лягушка", 10,
                "пресноводные водоёмы,суша, крона деревьев, подземные норы");
        amphibian1.printAmphibian();
        amphibian1.sleep();
        amphibian1.eat();
        amphibian1.go();
        amphibian1.hunting();
        System.out.println();
        Amphibian amphibian2 = new Amphibian("уж пресноводный", 20,
                "Европа, Средняя Африка, Азия");
        amphibian2.printAmphibian();
        amphibian2.sleep();
        amphibian2.eat();
        amphibian2.go();
        amphibian2.hunting();
        System.out.println();

        FlightlessBird flightlessBird1 = new FlightlessBird("павлин", 15, "леса и саванны на полуострове Индостан и острове Цейлон",
                "в основном прогуливается, но может и подниматься на высоту более 900 метров");
        flightlessBird1.printFlightlessBird();
        flightlessBird1.sleep();
        flightlessBird1.eat();
        flightlessBird1.go();
        flightlessBird1.hunting();
        flightlessBird1.walk();
        System.out.println();
        FlightlessBird flightlessBird2 = new FlightlessBird("пингвин", 25,
                "Галапагосские острова", "передвигаются по суше, переваливаясь с боку на бок, либо плавают под водой");
        flightlessBird2.printFlightlessBird();
        flightlessBird2.sleep();
        flightlessBird2.eat();
        flightlessBird2.go();
        flightlessBird2.hunting();
        flightlessBird2.walk();
        System.out.println();
        FlightlessBird flightlessBird3 = new FlightlessBird("птица до-до", 10,
                "когда- то обитала на острове Маврикий", "способна бегать с большой скоростью");
        flightlessBird3.printFlightlessBird();
        flightlessBird3.sleep();
        flightlessBird3.eat();
        flightlessBird3.go();
        flightlessBird3.hunting();
        flightlessBird3.walk();
        System.out.println();

        FlyingBird flyingBird1 = new FlyingBird("чайка", 20,
                "Азия, Россия, Китай, Япония, Австралия, Африка, Индия, Северная и Южная Америка, возле Аляски и Канады, ОАЭ, отдельные острова",
                "прекрасно плавает, бегает посуше");
        flyingBird1.printFlyingBird();
        flyingBird1.sleep();
        flyingBird1.eat();
        flyingBird1.go();
        flyingBird1.hunting();
        flyingBird1.fly();
        System.out.println();
        FlyingBird flyingBird2 = new FlyingBird("альбатрос", 50, "ледяные воды Антарктиды и всё Южное полушарие",
                "прекрасно плавает, по суше передвигается с трудом, вразвалочку");
        flyingBird2.printFlyingBird();
        flyingBird2.sleep();
        flyingBird2.eat();
        flyingBird2.go();
        flyingBird2.hunting();
        flyingBird2.fly();
        System.out.println();
        FlyingBird flyingBird3 = new FlyingBird("сокол", 16,
                "пустыни, тундра, тайга, луга, саванны, кустарниковые леса, горы, прибрежных районы, водно-болотные угодья, устья рек, берега озер",
                "осёдлый образ жизни, но могут улетать от дома за тысячу километров");
        flyingBird3.printFlyingBird();
        flyingBird3.sleep();
        flyingBird3.eat();
        flyingBird3.go();
        flyingBird3.hunting();
        flyingBird3.fly();
    }
}