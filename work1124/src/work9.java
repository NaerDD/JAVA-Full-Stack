import java.util.Scanner;

public class work9 {
//    12  根据用户输入的年月日 判断该日期是星期几  1900/1/1是星期一 *****
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = sc.nextInt();
        System.out.println("请输入月份：");
        int month = sc.nextInt();
        System.out.println("请输入日份：");
        int day = sc.nextInt();
        //得 年份相差的天数
        int sum=0;
        for (int i = 1900; i < year ; i++) {
            if(i%4==0 & i%100!=0| i%400==0){
                sum+=366;
            }else{
                sum+=365;
            }
        }
        System.out.println(sum);
        //得 月份相差的天数
        int  monthCount =0;
        for (int i = 1; i < month; i++) {
            switch (i){
                case 2:
                    if((year%4==0 && year%100!=0) || (year%400==0)){
                        monthCount+=29;
                    }else{
                        monthCount+=28;
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    monthCount+=30;
                    break;
                default:
                    monthCount+=31;
                    break;
            }
        }

        System.out.println(monthCount);
        //得 天份相差的天数
        int dayCount = 0;
        dayCount = day-1;
        System.out.println(dayCount);

        int SumZone = (sum+monthCount+dayCount)%7;
        switch (SumZone){
            case 0:
                System.out.println("星期一");
                break;
            case 1:
                System.out.println("星期二");
                break;
            case 2:
                System.out.println("星期三");
                break;
            case 3:
                System.out.println("星期四");
                break;
            case 4:
                System.out.println("星期五");
                break;
            case 5:
                System.out.println("星期六");
                break;
            case 6:
                System.out.println("星期天");
                break;
        }

    }
}
