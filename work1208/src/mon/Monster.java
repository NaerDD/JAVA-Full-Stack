package mon;

public class Monster {
    //私有属性
    private String MonsterName;
    private double HP;
    private double attackNumber;
    //攻击方法
    public void attack(){
        System.out.println(this.MonsterName+"展开攻击");
        System.out.println("当前生命值是:"+this.HP);
        System.out.println("攻击力是:"+this.attackNumber);
    }

    public Monster(String monsterName, double HP, double attackNumber) {
        setMonsterName(monsterName);
        setAttackNumber(attackNumber);
        setHP(HP);
        attack();
    }

    public Monster() {
    }

    public String getMonsterName() {
        return MonsterName;
    }

    public void setMonsterName(String monsterName) {
        MonsterName = monsterName;
    }

    public double getHP() {
        return HP;
    }

    public void setHP(double HP) {
        this.HP = HP;
    }

    public double getAttackNumber() {
        return attackNumber;
    }

    public void setAttackNumber(double attackNumber) {
        this.attackNumber = attackNumber;
    }
}
