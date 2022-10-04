public class Bus extends Transport {


    public Bus(String brand, String model, int productionYear, String productionCountry, String color, double maxSpeed) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);

        System.out.println(getBrand() + ", модель " + getModel() + ", год производства " + getProductionYear() + ", " +
                getProductionCountry() + ", цвет " + getColor() + ", " + getMaxSpeed() + " км/ч");
    }

    public void refill1() {
        System.out.println("Заправить бензином");
    }

    public void refill2() {
        System.out.println("Заправить дизелем на заправке");
    }

    public void refill3() {
    }
}

