package com.company;

public class Plane {

    private String name;
    private int fuelTanksVolume;
    private int numberOfPassengers;
    private int averageSpeed;
    private double weight;
    private static int numberOfWings;
    protected String engine;
    protected int illuminators;

    public Plane() {
        numberOfWings = 2;

    }


    public Plane(String name, int fuelTanksVolume, int numberOfPassengers, int averageSpeed) {
        this.name = name;
        this.fuelTanksVolume = fuelTanksVolume;
        this.numberOfPassengers = numberOfPassengers;
        this.averageSpeed = averageSpeed;
    }

    public Plane(String name, int fuelTanksVolume, int numberOfPassengers, int averageSpeed, double weight, String engine, int illuminators) {
        this(name, fuelTanksVolume, numberOfPassengers, averageSpeed);
        this.weight = weight;
        this.engine = engine;
        this.illuminators = illuminators;
    }

    public String toString() {
        return "Plane: " +
                "name='" + name + '\'' +
                ", fuelTanksVolume=" + fuelTanksVolume +
                ", numberOfPassengers=" + numberOfPassengers +
                ", averageSpeed=" + averageSpeed +
                ", weight=" + weight +
                ", engine='" + engine + '\'' +
                ", illuminators=" + illuminators;
    }

    public static void printStaticNumberOfWings(){
        System.out.println(numberOfWings);
    }

    public void printNumberOfWings() {
        System.out.println(numberOfWings);
    }
    public void resetValues(String name, int fuelTanksVolume, int numberOfPassengers, int averageSpeed, double weight, String engine, int illuminators) {
        this.name = name;
        this.fuelTanksVolume = fuelTanksVolume;
        this.numberOfPassengers = numberOfPassengers;
        this.averageSpeed = averageSpeed;
        this.weight = weight;
        this.engine = engine;
        this.illuminators = illuminators;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setFuelTanksVolume(int fuelTanksVolume) {

        this.fuelTanksVolume = fuelTanksVolume;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {

        this.numberOfPassengers = numberOfPassengers;
    }

    public void setAverageSpeed(int averageSpeed) {

        this.averageSpeed = averageSpeed;
    }

    public void setWeight(double weight) {

        this.weight = weight;
    }

    public String getName() {

        return name;
    }

    public int getFuelTanksVolume() {
        return fuelTanksVolume;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public int getAverageSpeed() {
        return averageSpeed;
    }

    public double getWeight() {
        return weight;
    }


}
