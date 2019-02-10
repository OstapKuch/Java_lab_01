package com.company;

public class Main {

    public static void main(String[] args) {

        Plane airbus = new Plane();
        Plane boeing = new Plane("Boeing 737", 17865, 140, 900);
        Plane antonov = new Plane("An-225", 373618, 100, 750, 285000, "D-18T", 256);

        System.out.println(airbus.toString());
        System.out.println(boeing.toString());
        System.out.println(antonov.toString());

        System.out.println("Printing static int numberOfWings: " + airbus.printNumberOfWings());
        System.out.println("Printing static int numberOfWings: " + boeing.printNumberOfWings());
        System.out.println("Printing static int numberOfWings: " + antonov.printNumberOfWings());

        System.out.println("Static method printStaticNumberOfWings: " + Plane.printStaticNumberOfWings());

    }
}
