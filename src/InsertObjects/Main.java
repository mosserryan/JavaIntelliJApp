package InsertObjects;

public class Main {

    public static void main(String[] args) {

        Car carOne = new Car("white", 2016, "Subaru", "Forester");

        Garage garage = new Garage();

        garage.parkCar(carOne);

        garage.checkGarage();

    }
}
