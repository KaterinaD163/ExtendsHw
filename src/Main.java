public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Lada", "Grande", 2015, "сборка в Росиии", "жёлтый цвет кузова",
                210, "бензин", 1.7f, "механическая коробка", "универсал", "к547ен163",
                5, "зимняя резина");
        car1.refill();
        System.out.println();
        Car car2 = new Car("Audi", "A8 50 L TDI quattro", 2020, "сборка в Германии",
                "черный цвет кузова", 300, "бензин", 3.0f,
                "автоматическая коробка", "седан", "н483ва777", 5, "зимняя резина");
        car2.refill();
        System.out.println();
        Car car3 = new Car("BMW", "Z8", 2021, "сборка в Германии",
                "чёрный цвет кузова", 280, "электрокар", 2.7f,
                "автоматическая коробка", "хэтчбэк", "г372ар113", 5, "зимняя резина");
        car3.refill();
        System.out.println();
        Car car4 = new Car("Kia", "Sportage 4 поколение", 2018, "Германия",
                "красный цвет кузова", 260.0, "бензин", 2.4f, "механическая коробка",
                "универсал", "в365вр182", 5, "зимняя резина");
        car4.refill();
        System.out.println();
        Car car5 = new Car("Hyundai", "Avante", 2016, "сборка в Южной Корее",
                "оранжевый цвет кузова", 310, "бензин", 1.6f,
                "автоматическая коробка", "минивэн", "о256вп763", 8, "летняя резина");
        car5.refill();
        System.out.println();
        Train train1 = new Train("Ласточка", "B-901", 2011, "Россия", "",
                301.0, "дизель", 3500, "34 часа 30 мин","Белорусский вокзал","Минск-пассажирский", 11 );
        train1.refill();
        System.out.println();
        Train train2 = new Train("Ленинград", "D-125", 2019, "Россия", "",
                270.0, "дизель",1700 , "24 ч 26 мин", "Ленинградский вокзал", "Ленинград-пассажирский", 8);
        train2.refill();
        System.out.println();
        Bus bus1 = new Bus("Икарус", "И-53", 1997, "Беларусь", "белый", 220,"бензин");
        bus1.refill();
        System.out.println();
        Bus bus2 = new Bus("ПАЗ", "П-2", 1982, "Россия", "жёлтый", 110, "дизель");
        bus2.refill();
        System.out.println();
        Bus bus3 = new Bus("ЛиАЗ", "Л-38", 1987, "Россия", "синий", 170, "");
        bus3.refill();
    }
    }
