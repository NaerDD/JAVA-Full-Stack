package CarSystem;


abstract class Car {
    //发动机对象
    private String Engine;
    //变速箱对象
    private String Gearbox;
    //底盘对象
    private String Chassis;

    public Car(String engine, String gearbox, String chassis) {
        Engine = engine;
        Gearbox = gearbox;
        Chassis = chassis;
    }
}
