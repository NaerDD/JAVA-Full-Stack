import java.util.Scanner;

public class work2 {
    public static void main(String[] args) {
        System.out.println("请输入一个HTPP或者FTP地址:");
        Scanner sc = new Scanner(System.in);
        String str  = sc.next();
        if(str.startsWith("HTTP")){
            String[] strArr = str.split(":");
            System.out.println(strArr[0]);
        }else{
            String[] strArr = str.split(":");
            System.out.println(strArr[0]);
        }
    }
}
