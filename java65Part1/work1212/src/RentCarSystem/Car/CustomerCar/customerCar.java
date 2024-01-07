package RentCarSystem.Car.CustomerCar;

import RentCarSystem.Car.Car;

//客车
public class customerCar extends Car {
    public customerCar() {
    }

    public customerCar(String carNumber, String band, String color, double moneyOfDay) {
        super(carNumber, band, color, moneyOfDay);
    }
}
