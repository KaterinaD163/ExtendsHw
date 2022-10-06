public class Bus extends Transport {


    public Bus(String brand, String model, int productionYear, String productionCountry, String color, double maxSpeed, String typeOfFuel) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed, typeOfFuel);
        printBus();
    }
public void printBus(){
    System.out.println(getBrand() + ", модель " + getModel() + ", год производства " + getProductionYear() + ", " +
            getProductionCountry() + ", цвет " + getColor() + ", " + getMaxSpeed() + " км/ч, тип топлива - " + getTypeOfFuel());
}
    public void refill() {
        if (typeOfFuel.isBlank()) {
            System.out.println(" Тип топлива не указан");
        }
        if (typeOfFuel == "бензин") {
            System.out.println(" Заправься бензином");
        }
        if (typeOfFuel == "дизель") {
            System.out.println(" Заправься дизелем");
        }
        if (typeOfFuel == "электрокар") {
            System.out.println(" Зарядка на специальной электрод-парковке");
        }
}
}