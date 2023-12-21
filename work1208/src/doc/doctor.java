package doc;

public class doctor extends people{
    private String keshi;

    public doctor() {
        //无参构造找父类
        super();

    }
    //全参构造
    public doctor(String name, int age, String gender, String position, String keshi) {
        super(name, age, gender, position);
        this.keshi = keshi;
        work();
    }

    public void work() {
        System.out.println("姓名:"+getName());
        System.out.println("职业:医生");
        System.out.println("年龄:"+getAge());
        System.out.println("所在科室:"+keshi);
        System.out.println("职务:"+getPosition());
    }
}
