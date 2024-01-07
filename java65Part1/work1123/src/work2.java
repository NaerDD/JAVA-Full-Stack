import java.util.Scanner;

public class work2 {
    public static void main(String[] args) {
//        4:编写程序接收用户输入的姓名和成绩;给该成绩判断等级;最后输出该生成绩等级(90分以上输入优秀,70-90良好,60-70及格,0-60以下不及格)
        System.out.println("请输入成绩:");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        switch (score/10){
            case 10:
            case 9:
                System.out.println("优秀");
                break;
            case 8:
            case 7:
                System.out.println("良好");
                break;
            case 6:
                System.out.println("及格");
                break;
            default:
                System.out.println("不及格");
        }
    }
}
