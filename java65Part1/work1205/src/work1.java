import java.util.Scanner;

public class work1 {
    public static void main(String[] args) {
        System.out.println("请按此格式输入一个日期(月/日/年):");
        Scanner sc = new Scanner(System.in);
        String str  = sc.next();
        String[] strArr = str.split("/");
        System.out.println(strArr[2] + "年"+strArr[0]+"月"+strArr[1]+"日");
    }
}
