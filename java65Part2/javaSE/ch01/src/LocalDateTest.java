import java.time.*;

public class LocalDateTest {
    public static void main(String[] args) {
        // 根据当前操作系统的时区获取当前时间
        // 只精确时间到yyyy-MM-dd
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        // 根据具体的时区获取时间
        // 参考时区id：  参照ZoneId类中的注释
        ZoneId zoneId = ZoneId.of("Asia/Tokyo");
        LocalDate localDate1 = LocalDate.now(zoneId);
        System.out.println(localDate1);

        // 精确时间到 yyyy-MM-dd HH:mm:ss.sss
        LocalDateTime localDateTime = LocalDateTime.now(zoneId);
        System.out.println(localDateTime);

        // 根据当前操作系统获取时间
        // 精确时间到时分秒，毫秒
        LocalTime localTime = LocalTime.now();
        System.out.println("localTime:" + localTime);

        // Instant代表了时间线上的一个瞬间，精确到纳秒
        // Instant不是按照当前操作系统时区获取时间，而是获取的标准的UTC时间
        Instant instant = Instant.now();
        System.out.println("instant: " + instant);
        // 将一个Instant对象，按照时区获取其时间
        ZonedDateTime zonedDateTime = instant.atZone(ZoneId.of("Asia/Shanghai"));
        System.out.println("zonedDateTime: " + zonedDateTime);

        // 将ZonedDateTime转换为LocalDateTime
        LocalDateTime from1 = LocalDateTime.from(zonedDateTime);
        System.out.println("将ZonedDateTime转换为LocalDateTime: " + from1);

        // 将Instant转换为LocalTime
        // Instant不能直接转换为LocalTime，需要获取到ZonedDateTime后再转
        LocalTime from = LocalTime.from(zonedDateTime);
        System.out.println("将Instant转换为LocalTime: " + from);

        // 将Instant转换为LocalDate
        LocalDate from2 = LocalDate.from(zonedDateTime);
        System.out.println("将Instant转换为LocalDate: " + from2);

        // 结论： 在日常开发中，在多线程环境下，采用Instant替代Date
        // Instant可以和其他LocalDate,LocalDateTime,LocalTime之间相互转化
    }
}
