public class Employee {
    String name;
    int age;
    String dept;
    static String company;

    public void showInfo(){
        System.out.println(this.name+" "+this.age+" "+this.dept+" "+company);
    }

    public static int compareByAge(int age1, int age2){
        return Math.max(age1,age2);
    }

    public Employee(String name, int age, String dept) {
        this.name = name;
        this.age = age;
        this.dept = dept;
    }

    public Employee() {
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

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public static String getCompany() {
        return company;
    }

    public static void setCompany(String company) {
        Employee.company = company;
    }
}
