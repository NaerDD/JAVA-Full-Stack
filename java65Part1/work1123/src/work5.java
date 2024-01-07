import java.util.Scanner;

public class work5 {
    public static void main(String[] args) {
//        1、	去衣服店买衣服，男装统一80元1件,女装60元1件,可供我们选择的衣服店有3家,
//                第一家的男装打8折扣,女装打4折,
//                第二家男装打6折扣,女装打3折,
//                第三家男装打9折扣,女装不打折.
//                现询问用户去哪家衣服店,男装买多少件，女装多少件,求最后应该付的价钱?
        int man = 80;
        int wman = 60;
        System.out.println("请输入要去的店:");
        Scanner sc = new Scanner(System.in);
        int dian = sc.nextInt();
        switch (dian){
            case 1:
                System.out.println("男装要买多少件:");
                int count1= sc.nextInt();
                System.out.println("女装要买多少件:");
                int count2= sc.nextInt();
                System.out.println("总价为:"+(man*count1*0.8)+(wman*count2*0.4));
                break;
            case 2:
                System.out.println("男装要买多少件:");
                int count3= sc.nextInt();
                System.out.println("女装要买多少件:");
                int count4= sc.nextInt();
                System.out.println("总价为:"+(man*count3*0.6)+(wman*count4*0.3));
                break;
            case 3:
                System.out.println("男装要买多少件:");
                int count5= sc.nextInt();
                System.out.println("女装要买多少件:");
                int count6= sc.nextInt();
                System.out.println("总价为:"+(man*count5*0.9)+(wman*count6));
        }
    }
}
