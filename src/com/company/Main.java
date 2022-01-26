package com.company;

public class Main {

    public static void main(String[] args) {

        Car carOne = new Car("white", 2016, "Subaru", "Forester");
        //System.out.println(carOne);

        Garage garage = new Garage();
        garage.parkCar(carOne);

        garage.checkGarage();

    }
}
