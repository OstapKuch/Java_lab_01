package ua.lviv.iot.lab_2.models;

public abstract class Ship {

    private double tonnage;
    private int speed;
    private double basePricePerMile;
    private String currency;

    public Ship() {

    }

    public Ship(double tonnage, int speed, double basePricePerMile, String currency) {
        this.tonnage = tonnage;
        this.speed = speed;
        this.basePricePerMile = basePricePerMile;
        this.currency = currency;
    }

    public abstract double calculateFinalPricePerMile();

    public double getTonnage() {
        return tonnage;
    }

    public void setTonnage(double tonnage) {
        this.tonnage = tonnage;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getBasePricePerMile() {
        return basePricePerMile;
    }

    public void setBasePricePerMile(double basePricePerMile) {
        this.basePricePerMile = basePricePerMile;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
