package doc;

public class army extends people{
    private String budui;

    public army() {
        //无参构造找父类
        super();

    }
    //全参构造
    public army(String name, int age, String gender, String position, String budui) {
        super(name, age, gender, position);
        this.budui = budui;
        work();
    }

    @Override
    public void work() {
        System.out.println("姓名:"+getName());
        System.out.println("职业:军人");
        System.out.println("年龄:"+getAge());
        System.out.println("所属部队:"+budui);
        System.out.println("职务:"+getPosition());
        System.out.println("军龄:43");
    }
}
