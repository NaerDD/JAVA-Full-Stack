import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

public class DateTimeFormatterTest {
    /**
     * 对Date对象进行格式化的类 SimpleDateFormat
     *          new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
     * 对java8中的日期API格式化的类 DateTimeFormatter
     *          DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
     * @param args
     */
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String format = dateTimeFormatter.format(now);
        System.out.println("通过DateTimeFormatter对日期格式化： " + format);

        // 将日期字符串转换为日期对象
        String str = "2023-01-28 18:36:25";
        TemporalAccessor parse = dateTimeFormatter.parse(str);

        LocalDateTime from = LocalDateTime.from(parse);
        LocalDate from1 = LocalDate.from(parse);
        LocalTime from2 = LocalTime.from(parse);

        // 将日期对象转换为Instant
        // ZoneOffset.of("+8"), 不是在日期之上加8小时，而是UTC+8小时代表了当前时间
        Instant instant = from.toInstant(ZoneOffset.of("+8"));

        System.out.println("将日期字符串还原为LocalDateTime： " + from);
        System.out.println("将日期字符串还原为LocalDate： " + from1);
        System.out.println("将日期字符串还原为LocalTime： " + from2);
        System.out.println("将日期字符串还原为Instant： " + instant);
    }
}
