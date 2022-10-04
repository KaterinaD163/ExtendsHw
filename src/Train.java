import java.sql.SQLOutput;

public class Train extends Transport {

    private double priceOfTrip;
    private double travelTime;
    private final String departureStation;
    private final String finalStop;
    private int numberOfWagons;

    public Train(String brand, String model, int productionYear, String productionCountry, String color, double maxSpeed, double priceOfTrip, double travelTime, String departureStation, String finalStop, int numberOfWagons) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
        this.priceOfTrip = priceOfTrip;
        this.travelTime = travelTime;
        this.departureStation = departureStation;
        this.finalStop = finalStop;
        this.numberOfWagons = numberOfWagons;


        if (color.isEmpty()) {
            System.out.println(getBrand() + ", модель " + getModel() + ", год выпуска " + getProductionYear() + ", " + getProductionCountry() +
                    ", " + getMaxSpeed() + " км/ч, цена поездки " +
                    this.priceOfTrip + " рублей, время в пути " + this.travelTime + " (часы, минуты), станция отбытия - " + this.departureStation
                    + ", конечная остановка " + this.finalStop + ", количество вагонов " + this.numberOfWagons);
        } else {
            System.out.println(getColor());
        }
    }

    public double getPriceOfTrip() {
        return priceOfTrip;
    }

    public double getTravelTime() {
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
        this.priceOfTrip = priceOfTrip;
    }

    public void setTravelTime(double travelTime) {
        this.travelTime = travelTime;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        this.numberOfWagons = numberOfWagons;
    }

    public void refill1() {
        System.out.println("Заправить дизелем");
    }

    public void refill2() {
    }

    public void refill3() {

    }
}
