package com.company;

public class Garage {

    Car[] garage = new Car[2];

    void parkCar(Car car) {

        if(garage[0] == null) {

            garage[0] = car;

        } else if (garage[1] == null) {

            garage[1] = car;

        } else {

            System.out.println("All spot are taken");

        }

    }

    void checkGarage() {

        int spot = 0;

        for(Car car : garage) {

            spot++;

            if(car != null) {
                System.out.println(car);
            } else {
                System.out.println("Spot " + spot + " is empty.");
            }



        }

    }

}
