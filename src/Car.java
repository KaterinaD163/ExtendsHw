public class Car extends Transport {
    public float engineVolume;
    public final String transmission;
    private final String bodyType;
    public final String registrationNumber;
    private final int numberOfSeats;
    public String typeOfRubber;

    public Car(String brand, String model, int productionYear, String productionCountry, String color,
               double maxSpeed, float engineVolume, String transmission, String bodyType, String registrationNumber, int numberOfSeats, String typeOfRubber) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
        this.engineVolume = engineVolume;
        this.transmission = transmission;
        this.bodyType = bodyType;
        this.registrationNumber = registrationNumber;
        this.numberOfSeats = numberOfSeats;
        this.typeOfRubber = typeOfRubber;


    if (transmission.isEmpty() || transmission.isBlank()) {
                System.out.println(getBrand() + " " + getModel() + ": объём двигателя " + this.engineVolume + " л, "
                        + getColor()+ ", максимальная скорость " + getMaxSpeed()  + "км/ч, год выпуска - " + getProductionYear() + ", " + getProductionCountry() +
                        ", (Информация не указана), " + this.bodyType + ", " + this.registrationNumber + ", число мест -  " +
                        this.numberOfSeats + ", " + this.typeOfRubber);
            }
            if (bodyType.isEmpty() || bodyType.isBlank()) {
                System.out.println(getBrand()+ " " + getModel() + ": объём двигателя " + this.engineVolume + " л, " +
                       getColor() + ", максимальная скорость " + getMaxSpeed()  + "км/ч, год выпуска - " + getProductionYear() + ", " + getProductionCountry()+
                        ", " + this.transmission + ", (Информация не указана), " + this.registrationNumber + ", число мест - " +
                        this.numberOfSeats + ", " + this.typeOfRubber);
            }
            if (registrationNumber.isEmpty()) {
                System.out.println(getBrand() + " " + getModel() + ": объём двигателя " + this.engineVolume + " л, " +
                        getColor()+ ", максимальная скорость " + getMaxSpeed()  + "км/ч, год выпуска - " + getProductionYear() + ", " + getProductionCountry() + ", " + this.transmission + ", " +
                        this.bodyType + ", (Информация не указана), число мест - "
                        + this.numberOfSeats + ", " + this.typeOfRubber);
            }
            if (registrationNumber.substring(0, 1).chars().allMatch(Character::isLetter)
                    && registrationNumber.substring(1, 4).chars().allMatch(Character::isDigit) &&
                    registrationNumber.substring(4, 6).chars().allMatch(Character::isLetter)
                    && registrationNumber.substring(6).chars().allMatch(Character::isDigit)) {
                System.out.println(getBrand() + " " + getModel() + ": объём двигателя " + this.engineVolume + " л, " +
                        getColor() + ", максимальная скорость " + this.getMaxSpeed() + "км/ч, год выпуска - " + getProductionYear() + ", " + getProductionCountry()+ ", " + this.transmission + ", " +
                        this.bodyType + ", " + this.registrationNumber + ", число мест - " + this.numberOfSeats + ", " + this.typeOfRubber);
            } else {
                System.out.println("Некорректный регистрационный номер");

            }

            if (numberOfSeats <= 0) {
                System.out.println(getBrand() + " " + getModel() + ": объём двигателя " + this.engineVolume + " л, " +
                        getColor()+ ", максимальная скорость " + this.getMaxSpeed() + "км/ч, год выпуска - " + getProductionYear()+ ", " + getProductionCountry() + ", " + this.transmission + ", " +
                        this.bodyType + ", " + this.registrationNumber + ", число мест - (Информация не указана), "
                        + this.typeOfRubber);
            }
            if (typeOfRubber.isEmpty() || typeOfRubber.isBlank()) {
                System.out.println(getBrand()+ " " + getModel() + ": объём двигателя " + this.engineVolume + " л, "
                        + getColor() + ", максимальная скорость " + this.getMaxSpeed() + "км/ч, год выпуска - " + getProductionYear()+ ", " + getProductionCountry() + ", " + this.transmission + ", " +
                        this.bodyType + ", " + this.registrationNumber + ", число мест - " +
                        this.numberOfSeats + ", (Информация не указана)");
            }
            if (brand.isEmpty() && model.isEmpty() && productionCountry.isEmpty()) {
                System.out.println("default");
            }
            if (engineVolume == 0) {
                System.out.println(getBrand() + " " + getModel() + ": объём двигателя " + " 1,5 л, "
                        + getColor() + ", максимальная скорость " + this.getMaxSpeed() + "км/ч, год выпуска - " + this.getProductionYear() + ", " + this.getProductionCountry() + ", " + this.transmission + ", " +
                        this.bodyType + ", " + this.registrationNumber + ", число мест - " + this.numberOfSeats + ", " + this.typeOfRubber);
            }
            if (color.isEmpty()) {
                System.out.println(this.getBrand() + " " + this.getModel() + ": объём двигателя " + this.engineVolume + " л, "
                        + "цвет кузова - белый, максимальная скорость " + this.getMaxSpeed() + "км/ч, год выпуска - " + this.getProductionYear() + ", " + this.getProductionCountry() +
                        ", " + this.transmission + ", " + this.bodyType + ", " + this.registrationNumber + ", чисор мест -  " + this.numberOfSeats + ", " + this.typeOfRubber);
            }
            if (productionYear == 0) {
                System.out.println(this.getBrand() + " " + this.getModel() + ": объём двигателя " + this.engineVolume + " л, "
                        + this.getColor() + ", максимальная скорость " + this.getMaxSpeed() + "км/ч, год выпуска - 2000 " + ", " + this.getProductionCountry() + ", " + this.transmission + ", " +
                        this.bodyType + ", " + this.registrationNumber + ", число мест - " + this.numberOfSeats + ", " + this.typeOfRubber);
            }
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


    public void refill1() {
        System.out.println("Заправить бензином");
    }
        public void refill2() {
            System.out.println("Заправить дизелем на заправке");
        }
            public void refill3() {
        System.out.println("Зарядить на специальной электрод-парковке");
    }

}
