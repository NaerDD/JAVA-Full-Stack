import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Date;

public class DateTimeFormatterTest2 {
    /**
     * 对Date对象进行格式化的类 SimpleDateFormat
     *          new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
     * 对java8中的日期API格式化的类 DateTimeFormatter
     *          DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
     * @param args
     */
    public static void main(String[] args) throws ParseException {
        String time = "2012/08/20";
        //创建一个SimpleDateFormat对象 定义好格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        // SimpleDateFormat 将日期转换为字符串
        String dateStr = sdf.format(new Date());
//        System.out.println(dateStr);

        // SimpleDateFormat 将字符串转换为日期
        Date date = sdf.parse("2023-03-08 10:10:10");
//        System.out.println(date);

        //DateTimeFormatter 日期转成字符串
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);//2024-01-04T16:05:20.263
        //创建DateTimeFormatter的模板
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String format = dateTimeFormatter.format(now);
        System.out.println("通过DateTimeFormatter对日期格式化: "+format);//通过DateTimeFormatter对日期格式化: 2024-01-04 16:07:45

        //DateTimeFormatter 字符串转回日期
        String str = "2023-01-28 18:36:24";
        TemporalAccessor parse = dateTimeFormatter.parse(str);

        LocalDateTime from = LocalDateTime.from(parse);
        System.out.println("将日期字符串还原为LocalDateTime:"+from);

        LocalDate from1 = LocalDate.from(parse);
        System.out.println("将日期字符串还原为LocalDate:"+from1);

        LocalTime from2 = LocalTime.from(parse);
        System.out.println("将日期字符串还原为LocalTime:"+from2);

        //将日期对象转换为Instant
        //ZoneOffset.of("+8"),不是在日期之上加8小时,而是UTC+8小时代表当前时间
        Instant instant = from.toInstant(ZoneOffset.of("+0"));
        System.out.println("将日期字符串还原为Instant:"+instant);
    }
}
