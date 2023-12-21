package RentCarSystem.Car;

public class Car {
    private String CarNumber;
    private String Band;
    private String Color;
    private double MoneyOfDay;

    public Car() {
    }

    public Car(String carNumber, String band, String color, double moneyOfDay) {
        this.setCarNumber(carNumber);
        this.setBand(band);
        this.setColor(color);
        this.setMoneyOfDay(moneyOfDay);
    }

    public String getCarNumber() {
        return CarNumber;
    }

    public void setCarNumber(String carNumber) {
        CarNumber = carNumber;
    }

    public String getBand() {
        return Band;
    }

    public void setBand(String band) {
        Band = band;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public double getMoneyOfDay() {
        return MoneyOfDay;
    }

    public void setMoneyOfDay(double moneyOfDay) {
        MoneyOfDay = moneyOfDay;
    }


}
