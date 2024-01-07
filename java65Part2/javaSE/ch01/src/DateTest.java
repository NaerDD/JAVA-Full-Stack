import java.util.Calendar;
// 静态导包，可以不用写类名，直接调用Calendar类中的静态方法和变量
import static java.util.Calendar.*;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DateTest {
    public static void main(String[] args) {
        // 当前系统时间
        // long time = 1 * 24 * 60 * 60 * 1000;
        // 计算1天的毫秒数
        long millis = TimeUnit.DAYS.toMillis(10);
        Date target = new Date(millis); // 系统起始时间从 1970-1-1 0:0:0 + 10天

        // 通过Calendar日历类获取所有与日期相关的属性
        // 这些属性已静态常量的形式位于Calendar类中
        // Calendar是一个抽象类，不能直接实例化
        // 获取Calendar对象
        Calendar instance = Calendar.getInstance(); // 默认是当前时间
        // 为日历对象指定时间
        instance.setTime(target);

        // 在当前日期上加一年
        instance.add(YEAR, 1);
        instance.add(MONTH, 24);
        instance.add(HOUR, 24);

        // 获取年份
        int year = instance.get(YEAR);
        // 获取当前的月份
        int month = instance.get(MONTH) + 1;
        // 获取多少号
        int date = instance.get(DATE);
        // 获取24小时制的小时
        int hours = instance.get(HOUR_OF_DAY);
        // 获取分钟
        int minutes = instance.get(MINUTE);
        int seconds = instance.get(SECOND);
        // 获取周几
        int day = instance.get(DAY_OF_WEEK);
        // 获取日期是这年的第多少天
        int dayOfYear = instance.get(DAY_OF_YEAR);
        // 获取日期是这年的第多少周
        int weekOfYear = instance.get(WEEK_OF_YEAR);
        // 获取日期是这个月的第几周
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
