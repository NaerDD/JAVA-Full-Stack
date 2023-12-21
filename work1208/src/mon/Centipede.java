package mon;

public class Centipede extends Monster{
    public void move(){
        System.out.println("我是蜈蚣精,御风飞行");
    }

    public Centipede(String monsterName, double HP, double attackNumber) {
        super(monsterName, HP, attackNumber);
        move();
    }

    public Centipede() {
    }
}
