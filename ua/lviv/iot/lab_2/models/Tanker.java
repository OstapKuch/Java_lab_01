package ua.lviv.iot.lab_2.models;

public class Tanker extends Ship {

    /**
     * This coefficient is used to norm the price calculation
     */
    private static final int TANKER_COEFFICIENT = 10000;
    private double capacity;
    private DangerLevel fireDangerLevel;

    public Tanker() {

    }

    public Tanker(double tonnage, int speed, double pricePerMile, String currency) {
        super(tonnage, speed, pricePerMile, currency);
    }

    @Override
    public double calculateFinalPricePerMile() {
        return getBasePricePerMile() * getTonnage() * capacity / TANKER_COEFFICIENT;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public DangerLevel getFireDangerLevel() {
        return fireDangerLevel;
    }

    public void setFireDangerLevel(DangerLevel fireDangerLevel) {
        this.fireDangerLevel = fireDangerLevel;
    }

}
