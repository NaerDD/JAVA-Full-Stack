package RentCarSystem.Car.CustomerCar;

//小客车
public class sCustomerCar extends customerCar {
    private int setNumber;


    public sCustomerCar(String carNumber, String band, String color, double moneyOfDay, int setNumber) {
        super(carNumber, band, color, moneyOfDay);
        this.setSetNumber(setNumber);
    }

    public sCustomerCar() {
    }

    public int getSetNumber() {
        return setNumber;
    }

    public void setSetNumber(int setNumber) {
        if(setNumber>20){
            System.out.println("数量超过20!无法更改或添加!");
            return;
        }else{
            this.setNumber = setNumber;
        }
    }
}
