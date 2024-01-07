import java.util.Scanner;

public class work3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入年份:");
        int year = sc.nextInt();
        System.out.println("输入月份:");
        int month = sc.nextInt();
        int totalDays = MyDate(year,month);
        System.out.println("这个月一共有"+totalDays+"天");
    }
    public static  int MyDate(int year,int month){
        int totalDays = 0;
    if((year%4==0 & year%100==0)||year%400==0){
        //是闰年
        int runNumber = 29;
        //调用方法拿到天数
        totalDays = CountMonth(month,runNumber);
    }else{
        //不是闰年
        int runNumber = 28;
        //调用方法拿到天数
        totalDays = CountMonth(month,runNumber);
    }
    //返回天数
    return totalDays;
    }

    /**
     * 计算月份所拥有天数
     * @param month 月份
     * @param runNumber 闰平年2月天数
     * @return 返回天数
     */
    public static int CountMonth(int month,int runNumber){
            int totalDays = 0;
            switch (month){
                case 2:
                    totalDays = runNumber;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    totalDays =30;
                    break;
                default:
                    totalDays =31;
                    break;
            }
            return totalDays;
        }
}
