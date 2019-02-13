package com.company;

public class Main {


    public static void main(String[] args) {

        Plane airbus = new Plane();
        Plane boeing = new Plane("Boeing 737", 17865, 140, 900);
        Plane antonov = new Plane("An-225", 373618, 100, 750, 285000, "D-18T", 256);

        System.out.println(airbus);
        System.out.println(boeing);
        System.out.println(antonov);

        airbus.printNumberOfWings();
        boeing.printNumberOfWings();
        antonov.printNumberOfWings();

        Plane.printStaticNumberOfWings();

    }
}
