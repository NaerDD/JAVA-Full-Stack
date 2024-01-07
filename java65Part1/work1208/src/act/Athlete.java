package act;

public class Athlete extends people{
    String BestItem ="200米短跑";
    String BestScore = "22秒30";
    //全参构造
    public Athlete(String name, int age, String gender) {
        super(name, age, gender);
    }
    //无参构造
    public Athlete() {
        super();
    }

    public void selfIntroduce(){
        System.out.println("大家好!我是"+this.getName());
        System.out.println("今年"+this.getAge()+"岁");
        System.out.println("我最擅长的运动项目是:"+BestItem);
        System.out.println("历史最好成绩是:"+BestScore);
    };
}
