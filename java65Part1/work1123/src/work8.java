import java.util.Scanner;

public class work8 {
    public static void main(String[] args) {
//        2．为了帮助张浩尽快提高成绩，老师给他安排了每天的学习任务，
//        其中上午阅读教材，学习理论部分，下午上机编程，掌握代码部分。
//        老师每天检查学习成果。如果不合格，则继续进行
//                使用while循环的步骤
//                 (1)、分析循环条件和循环操作
//                (2)、套用while语法写出代码
//                (3)、检查循环是否能够退出
        System.out.println("合格了吗?(y/n):");
        Scanner sc = new Scanner(System.in);
        String hege = sc.next();
        while (true){
            if(hege.equals("y")){
                System.out.println("完成学习任务");
                break;
            }else{
                System.out.println("上午阅读");
                System.out.println("下午实操");
                System.out.println("合格了吗?(y/n)");
            }
            hege = sc.next();
        }
    }
}
