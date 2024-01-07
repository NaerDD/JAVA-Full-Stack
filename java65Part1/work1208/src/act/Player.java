package act;
//演员类
public class Player extends people{

    String graduateSchool ="北京电影学院";
    String masterPiece = "寄往天国的家书";


    //子类全参构造 直接调用父类的就可以了
    public Player(String name, int age, String gender) {
        super(name, age, gender);
    }
    //子类无参构造 调父类的无参构造
    public Player() {
        super();
    }

    public void selfIntroduce(){
        System.out.println("大家好!我是"+this.getName());
        System.out.println("今年"+this.getAge()+"岁");
        System.out.println("我毕业于:"+graduateSchool);
        System.out.println("代表作有:"+masterPiece);
    };

}
