public class Student {
//    属性:学号唯一、姓名、年龄、性别)(方法:show(),该方法显示自己信息)
    private int stuId;
    private String stuName;
    private String stuGender;
    private int stuAge;

    public Student(int stuId, String stuName, String stuGender, int stuAge) {
         setStuId(stuId);
        setStuName(stuName);
        setStuGender(stuGender);
        setStuAge(stuAge);
    }

    public Student() {
    }

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuGender() {
        return stuGender;
    }

    public void setStuGender(String stuGender) {
        this.stuGender = stuGender;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }

    public String show() {
        return "Student{" +
                "stuId='" + stuId + '\'' +
                ", stuName='" + stuName + '\'' +
                ", stuGender=" + stuGender +
                ", stuAge=" + stuAge +
                '}';
    }
}
