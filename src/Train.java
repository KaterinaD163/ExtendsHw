import java.sql.SQLOutput;

public class Train extends Transport {

    public double priceOfTrip;
    public String travelTime;
    private final String departureStation;
    private final String finalStop;
    public int numberOfWagons;

    public Train(String brand, String model, int productionYear, String productionCountry, String color, double maxSpeed, String typeOfFuel, double priceOfTrip, String travelTime, String departureStation, String finalStop, int numberOfWagons) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed, typeOfFuel);
        this.priceOfTrip = priceOfTrip;
        this.travelTime = travelTime;
        this.departureStation = departureStation;
        this.finalStop = finalStop;
        this.numberOfWagons = numberOfWagons;
    printTrain();
    }

    public void printTrain() {
        System.out.println(getBrand() + ", модель " + getModel() + ", год выпуска " + getProductionYear() + ", " + getProductionCountry() +
                ", " + getMaxSpeed() + " км/ч, цена поездки " + this.priceOfTrip + " рублей, время в пути " + this.travelTime + ", станция отбытия - " + this.departureStation
                + ", конечная остановка - " + this.finalStop + ", количество вагонов " + this.numberOfWagons + ", тип топлива - " + getTypeOfFuel());
    }

    public double getPriceOfTrip() {
        return priceOfTrip;
    }

    public String getTravelTime() {
        return travelTime;
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public String getFinalStop() {
        return finalStop;
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public void setPriceOfTrip(double priceOfTrip) {
        if (priceOfTrip <= 0) {
            System.out.println(" Некорректная стоимость поездки");
        } else {
            this.priceOfTrip = priceOfTrip;
        }
    }
    public void setTravelTime(String travelTime) {
        this.travelTime = travelTime;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        this.numberOfWagons = numberOfWagons;
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
