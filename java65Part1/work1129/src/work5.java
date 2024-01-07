import java.util.Scanner;

public class work5 {
    public static void main(String[] args) {
//   3.3、创建一个名为MyDate的类,编写一个totalDays3的方法,该方法通过用户输入今天的年和月，计算你一共活了多少天,并显示结果在主函调(程序入口)用该方法测试它.
        Scanner sc = new Scanner(System.in);
        System.out.println("输入今天的年份:");
        int year = sc.nextInt();
        System.out.println("输入今天的月份:");
        int month = sc.nextInt();
        int totalDays = totalDays3(year,month);
        System.out.println("你一共活了"+totalDays+"天");
    }

    /**
     * 寿命累计器 距离1998/1/1
     * @param year 当前年份
     * @param month 当前月份
     * @return 已活天数
     */
    public static int totalDays3(int year,int month){
        int totalDays = 0;
        for (int i = 1998; i <= year; i++) {
            for (int j = 1; j <= month ; j++) {
                if (j==2){
                    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                        totalDays += 29;
                    } else {
                        totalDays += 28;
                    }
                }else if(j==4||j==6||j==9||j==11){
                    totalDays += 30;
                }else{
                    totalDays += 31;
                }
            }
        }
    return totalDays;
    }
}
