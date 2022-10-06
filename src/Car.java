public class Car extends Transport {
    private final float engineVolume;
    private final String transmission;
    private final String bodyType;
    public String registrationNumber;
    private final int numberOfSeats;
    public String typeOfRubber;


    public Car(String brand, String model, int productionYear, String productionCountry, String color, double maxSpeed, String typeOfFuel, float engineVolume, String transmission, String bodyType, String registrationNumber, int numberOfSeats, String typeOfRubber) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed, typeOfFuel);
        this.engineVolume = engineVolume;
        this.transmission = transmission;
        this.bodyType = bodyType;
        this.registrationNumber = registrationNumber;
        this.numberOfSeats = numberOfSeats;
        this.typeOfRubber = typeOfRubber;
        setTypeOfFuel(typeOfFuel);
        setRegistrationNumber(registrationNumber);
        printCar();
    }

    public void printCar() {
        System.out.println(getBrand() + " " + getModel() + ": объём двигателя " + this.engineVolume + " л, " +
                getColor() + ", максимальная скорость " + this.getMaxSpeed() + " км/ч, год выпуска - " + getProductionYear() + ", " + getProductionCountry() + ", " + this.transmission + ", " +
                this.bodyType + ", регистрационный номер " + this.registrationNumber + ", число мест - " + this.numberOfSeats + ", " + this.typeOfRubber + ", тип топлива - " + getTypeOfFuel());

    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getTypeOfRubber() {
        return typeOfRubber;
    }

    public void setTypeOfRubber(String typeOfRubber) {
        if (typeOfRubber.isBlank()) {
            System.out.println(" (информация не указана");
        } else {
            this.typeOfRubber = typeOfRubber;
        }
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (!registrationNumber.isEmpty() && registrationNumber.substring(0, 1).chars().allMatch(Character::isLetter)
                && registrationNumber.substring(1, 4).chars().allMatch(Character::isDigit) &&
                registrationNumber.substring(4, 6).chars().allMatch(Character::isLetter)
                && registrationNumber.substring(6).chars().allMatch(Character::isDigit)) {
            this.registrationNumber = registrationNumber;
        } else {
            System.out.println(" (некорректный регистрационный номер)");

        }
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
