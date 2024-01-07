import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;
//静态导包 可以不用写类名,直接调用Calendar类中的静态方法和变量
import static java.util.Calendar.*;

public class DateTest2 {
    public static void main(String[] args) {
        //当前系统时间
        //long time = 1*24*60*60*1000;
        //计算1天的毫秒数
        long mills = TimeUnit.DAYS.toMillis(10);
//        System.out.println(mills);//864000000毫秒
        Date target = new Date(mills);//系统起始时间 1970-1-1 0:0:0 +10天
//        System.out.println(target);//Sun Jan 11 08:00:00 CST 1970

        //通过Calendar日历类获取所有与日期相关的属性
        //这些属性已静态常量的形势位于Calendar类中
        //Calendar是一个抽象类,不能直接实例化
        //获取Calender对象
        Calendar instance = Calendar.getInstance();//默认是当前时间
        System.out.println(" "+instance);
        instance.setTime(target);
        System.out.println(" "+instance);

        //在当前日期上加一年
        instance.add(YEAR,1);
        instance.add(MONTH,24);
        instance.add(HOUR,24);
        //加10天 加3年 加24小时 1973年 1月 12日 0点 加8小时

        //获取年份
        int year = instance.get(YEAR);
        //获取当前的月份
        int month = instance.get(MONTH)+1;
        //获取当前日期
        int date = instance.get(DATE);
        //获取24小时值的小时
        int hours = instance.get(HOUR_OF_DAY);
        //获取分钟
        int minutes = instance.get(MINUTE);
        //获取秒数
        int seconds = instance.get(SECOND);
        //获取周几
        int day = instance.get(DAY_OF_WEEK);
        //获取日期是这一年的第多少天
        int dayOfYear = instance.get(DAY_OF_YEAR);
        //获取日期是这年的多少周
        int weekOfYear = instance.get(WEEK_OF_MONTH);
        //获取日期是这个月的第几周
        int weekOfMonth = instance.get(WEEK_OF_MONTH);
        int dayOfWeekInMonth = instance.get(DAY_OF_WEEK_IN_MONTH);

        System.out.println("年份：" + year);
        System.out.println("月份：" + month);
        System.out.println("日期：" + date);
        System.out.println("小时：" + hours);
        System.out.println("分钟：" + minutes);
        System.out.println("秒钟：" + seconds);
        System.out.println("周几：" + day);
        System.out.println("这年的第多少天：" + dayOfYear);
        System.out.println("这年的第多少周：" + weekOfYear);
        System.out.println("周几：" + day);
        System.out.println("这个月的第几周：" + weekOfMonth); // 按日历上的星期计算
        System.out.println("这个月的第几周：" + dayOfWeekInMonth); // 从每个月的1号累计的周数
    }

}
