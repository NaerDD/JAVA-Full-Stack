package act;

public class people {
    public String name;
    public int age;
    public String gender;

    public people(String name, int age, String gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public people() {
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
}
