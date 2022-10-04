public abstract class Transport {
    private final String brand;
    private final String model;
    private final int productionYear;
    private final String productionCountry;
    private String color;
    private double maxSpeed;


    public Transport(String brand, String model, int productionYear, String productionCountry, String color, double maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
        this.color = color;
        this.maxSpeed = maxSpeed;
        if (!color.isEmpty() && !color.isBlank()) {
            this.color = color;
        } else {
            System.out.println(" (Цвет не указан)");
        }
        if (maxSpeed != 0) {
            this.maxSpeed = maxSpeed;
        } else {
            System.out.println(" (Информация о скорости не указана");
        }
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

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public abstract void refill1();

    public abstract void refill2();
    public abstract void refill3();
    }





