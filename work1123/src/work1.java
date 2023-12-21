import java.util.Scanner;

public class work1 {
    public static void main(String[] args) {
//        1:接收用户输入的一个数,判断该数是奇数还是偶数;
        System.out.println("请输入一个数:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("偶数");
        }else{
            System.out.println("奇数");
        }
//        2:接收用户输入3个数,求出3个数中的最大值;
        System.out.println("依次输入三个数:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        if(num1>num2 & num1>num3){
            System.out.println("num1最大");
        }else if(num2>num1 & num2>num3){
            System.out.println("num2最大");
        }else{
            System.out.println("num3最大");
        }
//        2.2接收用户输入3个数a,b,c,求a这个数是第几大的
        System.out.println("依次输入三个数:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b & a>c){
            System.out.println("a最大");
        }else if(b>a & b>c){
            if(a>c){
                System.out.println("a第二大");
            }else{
                System.out.println("a最小");
            }
            //c最大
        }else{
            if(a>b){
                System.out.println("a第二大");
            }else {
                System.out.println("a最小");
            }
        }

//        :四则运算(接收用户输入的2个操作数，和运算符)，计算之后，输出结果:
        System.out.println("输入第一个数:");
        int num4 = sc.nextInt();
        System.out.println("输入一个操作符:");
        String calc = sc.next();
        System.out.println("输入第二个数:");
        int num5 = sc.nextInt();
        int result = 0;
        switch (calc){
            case "+":
                result = num4+num5;
                break;
            case "-":
                result = num4-num5;
                break;
            case "*":
                result = num4*num5;
                break;
            case "/":
                result = num4/num5;
                break;
        }
        System.out.println(num4+""+calc+""+num5+"="+result);

    }
}
