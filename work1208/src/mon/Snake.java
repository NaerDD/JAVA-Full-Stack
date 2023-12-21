package mon;

public class Snake extends Monster{
    public void move(){
        System.out.println("我是蛇怪,我走S型路线");
    }
    public void skill(){
        super.setHP(super.getHP()+20.0);
        System.out.println("实施大蛇补血术....,当前生命值是:"+super.getHP());
    }

    public Snake(String monsterName, double HP, double attackNumber) {
        super(monsterName, HP, attackNumber);
        skill();
        move();
    }

    public Snake() {
    }
}
