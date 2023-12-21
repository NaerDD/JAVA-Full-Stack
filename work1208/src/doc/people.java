package doc;

public class people {
    //私有化之后 子类只能继承到公有方法 进行设置
    private String name;
    private int age;
    private String gender;
    //职务
    private String position;

    //工作
    public void work(){
       System.out.println("父类中继承的工作");
    }
    //父类无参构造
    public people() {
        work();
    }
    //父类全参构造
    public people(String name, int age, String gender, String position) {
        setName(name);
        setAge(age);
        setGender(gender);
        setPosition(position);
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
