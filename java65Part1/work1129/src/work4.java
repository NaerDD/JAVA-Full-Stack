import java.util.Scanner;

public class work4 {
    public static void main(String[] args) {
//        3.2、创建一个名为MyDate的类,
//                编写一个totalDays2的方法,该方法通过年份和月份和日期，判断用户从该年的1/1号开始到用户输入的日期，一共经历了多少天在主函调(程序入口)用该方法测试它.
        Scanner sc = new Scanner(System.in);
        System.out.println("输入年份:");
        int year = sc.nextInt();
        System.out.println("输入月份:");
        int month = sc.nextInt();
        System.out.println("输入日期:");
        int day = sc.nextInt();
        int totalDays = MyDate(year,month,day);
        System.out.println("从"+year+"年"+"1月1日起一共经历了"+totalDays+"天");
    }

    /**
     * 日期累加器
     * @param year  传年份
     * @param month 传月份
     * @param day 传天数
     * @return 总天数
     */
    public static int MyDate(int year,int month,int day){
    int totalDays = 0;
    String pingrun = whatYear(year);
    if(pingrun.equals("闰年")){
        int runNumber = 29;
        totalDays = CountMonth(month,runNumber)+day-1;
    }else{
        //平年
        int runNumber = 28;
        totalDays = CountMonth(month,runNumber)+day-1;
    }
    return totalDays;
    }

    /**
     * 平闰年判断
     * @param year 传年份
     * @return String 平年 闰年
     */
    public static  String whatYear(int year){
        String xxx = "";
        if((year%4==0 & year%100==0)||year%400==0){
            //是闰年
            xxx = "闰年";
        }else{
            //不是闰年
            xxx = "平年";
        }
        //返回平润
        return xxx;
    }

    /**
     * 月份累加器
     * @param month  传月份
     * @param runNumber 传2月天数
     * @return
     */
    public static int CountMonth(int month,int runNumber){
        int totalDays = 0;
        for (int i = 1; i < month; i++) {
            switch (month){
                case 2:
                    totalDays = runNumber;
                case 4:
                case 6:
                case 9:
                case 11:
                    totalDays =30;
                default:
                    totalDays =31;
            }
        }
        return totalDays;
    }
}
