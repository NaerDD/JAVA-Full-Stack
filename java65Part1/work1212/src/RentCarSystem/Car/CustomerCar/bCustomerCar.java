package RentCarSystem.Car.CustomerCar;

//大客车
public class bCustomerCar extends customerCar {
    private int setNumber;

    public bCustomerCar(int setNumber) {
        this.setNumber = setNumber;
    }

    public bCustomerCar(String carNumber, String band, String color, double moneyOfDay, int setNumber) {
        super(carNumber, band, color, moneyOfDay);
        this.setSetNumber(setNumber);
    }

    public int getSetNumber() {
        return setNumber;
    }

    public void setSetNumber(int setNumber) {
        if(setNumber<=20){
            System.out.println("数量不足20!无法更改或添加!");
            return;
        }else{
            this.setNumber = setNumber;
        }
    }
}
