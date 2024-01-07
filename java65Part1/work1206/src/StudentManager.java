import java.util.Scanner;
public class StudentManager {
//    创建一个学生管理类StudentManager,该类用来管理学生情况，
        public StudentManager(){
        //    学生人数最多只能30人,该类拥有功能（提示:StudentManager中会有学生类的集合用来管理学生）
        stus[0] = (new Student(100,"张三","男",20));
        stus[1] = (new Student(101,"李四","女",21));
        stus[2] = (new Student(102,"王五","女",22));
        }
        int index = 3;
        Student[] stus = new Student[30];
        Scanner sc = new Scanner(System.in);

        //1.	添加新学员 方法add() 提示:接收用户输入创建新学员,放入学生数组中
        public void add(){
            System.out.println("输入新学员的学号：");
            int stuID = sc.nextInt();
            System.out.println("输入新学员的姓名：");
            String stuName = sc.next();
            System.out.println("输入新学员的年龄：");
            int stuAge = sc.nextInt();
            System.out.println("输入新学员的性别：");
            String stuGender = sc.next();
            stus[index] = (new Student(stuID,stuName,stuGender,stuAge));
            index++;
        }
        //2.	删除学员	方法delete(int id) 提示:通过学生学号在学生数组中删除该学员
        public void delete(int id){
            for (int i = 0; i < index; i++) {
                if(stus[i].getStuId()==id){
                    for (int j = i+1; j < index; j++) {
                        if(stus[j]!=null){
                            stus[i] = stus[j];
                            //将
                            index--;
                        }else {
                            index--;
                        }
                    }
                }
            }
        }
        //展示所有学员
        public void queryAll(){
            for (int i = 0; i < index; i++) {
                System.out.println(stus[i].show());
            }
        }
        //3.	查询学员方法findById(int id) 提示: 通过学生学号在学生数组中查询该学号学生
        public void findById(int id){
            int flag = -1;
            for (int i = 0; i < index; i++) {
                if(stus[i].getStuId()==id) {
                    flag = i;
                }
            }
            if(flag!=-1){
                //找到了
                System.out.println(stus[flag].show());
            }else {
                //没找到
                System.out.println("没找到！");
            }
        }
        //4.	显示所有学员信息 findAll()	提示: 显示所有学生的信息，按年龄降序排序 （对原数组进行操作）
        public void findAll(){
            for (int i = 0; i < index; i++) {
                for (int j = i+1; j < index; j++) {
                    if(stus[j].getStuAge()>stus[i].getStuAge()){
                        Student tempstu = stus[i];
                        stus[i] = stus[j];
                        stus[j] = tempstu;
                    }
                }
                System.out.println(stus[i].show());
            }
        }
        //5.	显示年龄最大的学员信息 getMaxAge()	提示: 显示年龄最大的学生的信息
        public void getMaxAge(){
            for (int i = 0; i < index; i++) {
                for (int j = i+1; j < index; j++) {
                    if(stus[j].getStuAge()>stus[i].getStuAge()){
                        Student tempstu = stus[i];
                        stus[i] = stus[j];
                        stus[j] = tempstu;
                    }
                }
                System.out.println(stus[i].show());
                break;
            }
        }
        //6.	显示不同性别学生个数 size()
        public void size(){
            int ManCount = 0;
            int woManCount = 0;
            for (int i = 0; i < index; i++) {
                if(stus[i].getStuGender().equals("男")){
                    ManCount++;
                }else{
                    woManCount++;
                }
            }
            System.out.println("男生有"+ManCount+"位");
            System.out.println("女生有"+woManCount+"位");
        }

        public void menu(){
            System.out.println("欢迎来到学生管理系统");
            System.out.println("1.添加新学员");
            System.out.println("2.删除学员");
            System.out.println("3.查找学员");
            System.out.println("4.展示全部学员");
            System.out.println("5.显示年龄最大的学员信息");
            System.out.println("6.显示不同性别学生个数");
            System.out.println("7.退出");
            a:while (true){
                int flag= sc.nextInt();
                switch (flag){
                    case 1:
                        add();
                        queryAll();
                        break;
                    case 2:
                        System.out.println("输入需要删除的学员ID:");
                        int id = sc.nextInt();
                        delete(id);
                        queryAll();
                        break;
                    case 3:
                        System.out.println("输入要查找的学生ID");
                        int ida = sc.nextInt();
                        findById(ida);
                        break;
                    case 4:
                        findAll();
                        break;
                    case 5:
                        getMaxAge();
                        break;
                    case 6:
                        size();
                        break;
                    case 7:
                        System.out.println("谢谢使用");
                        break a;
                }
            }
        }

}
