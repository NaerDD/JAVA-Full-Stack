import java.util.Scanner;

public class work12 {
    public static void main(String[] args) {
//        6. 输出一批整数中的最大值和最小值
//        当用户输入0时结束循环（使用while或do while）
//        提示：可以使用do  while 循环，也可以使用while（ture）循环，然后使用break来控制循环
//        可以使用两个变量来存储最大值与最小值，int max ，int min
//        注意：在给max与min赋值的时候，需要使用第一次输入的值
//        示例：int num = input.nextInt();
//        max = min = num;
//        结果展示：
//        请输入一个数：15
//        请输入一个数：35
//        请输入一个数：55
//        请输入一个数：75
//        请输入一个数：-1
//        请输入一个数：0
//        由于用户输入0程序结束
//        其中最大数是：75
//        其中最小数是：-1
        Scanner sc = new Scanner(System.in);
        int max;
        int min;
        System.out.println("请输入一个数:");
        max = sc.nextInt();
        System.out.println("请输入一个数:");
        min = sc.nextInt();
        if (max>min){
            while (true){
                System.out.println("请输入一个数:");
                int num = sc.nextInt();
                if(num==0){
                    break;
                }
                if(num>max){
                    max = num;
                }else if(num<min){
                    min = num;
                }
            }
        }else if (max<min){
            int mid = 0;
            mid = max;
            max = min;
            min = mid;
            while (true){
                System.out.println("请输入一个数:");
                int num = sc.nextInt();
                if(num==0){
                    break;
                }
                if(num>max){
                    max = num;
                }else if(num<min){
                    min = num;
                }
            }
        }
        System.out.println("最大值:"+max+"最小值:"+min);
    }
}
