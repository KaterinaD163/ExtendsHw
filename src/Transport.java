public abstract class Transport {
    public String brand;
    public String model;
    private int productionYear;
    private String productionCountry;
    public String color;
    public double maxSpeed;
    public String typeOfFuel;


    public Transport(String brand, String model, int productionYear, String productionCountry, String color, double maxSpeed, String typeOfFuel) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.typeOfFuel = typeOfFuel;
        setColor(color);
        setMaxSpeed(maxSpeed);

    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getColor() {
        return color;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public String getTypeOfFuel() {
        return typeOfFuel;
    }

    public void setTypeOfFuel(String typeOfFuel) {
        this.typeOfFuel = typeOfFuel;
    }

    public void setColor(String color) {
        if (color.isBlank()) {
            System.out.println(" (Цвет не указан)");
        } else {
            this.color = color;
        }
    }

    public void setMaxSpeed(double maxSpeed) {
        if (maxSpeed != 0) {
            this.maxSpeed = maxSpeed;
        } else {
            System.out.println(" (Информация о скорости не указана");
        }
    }


    public abstract void refill();

    }





