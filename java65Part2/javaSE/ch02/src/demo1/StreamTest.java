package demo1;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamTest {
    /**
     * 获取Stream的方式
     * @param args
     */
    public static void main(String[] args) {
        // 得到一个空的流
        Stream<Object> empty = Stream.empty();

        // Stream能够组装为任意类型的流
        // Stream<Object>,  Stream<String>, Stream<Integer> , Stream<Student>
        Stream<String> stream1 = Stream.of("a", "b", "c", "a", "b", "c");

        // 流有分类，整数int, long, 小数 double
        // Stream<Integer> ---->   IntStream, 流中所有的元素都是整数，int
        // Stream<Double> ---->    DoubleStream, 流中所有的元素都是double
        // Stream<Long> ---->      LongStream，, 流中所有的元素都是long
        IntStream stream2 = IntStream.range(1, 10); // 得到1-9的整数
        DoubleStream doubleStream = DoubleStream.of(1, 2, 3, 4, 5);
        LongStream range = LongStream.range(1, 10);

        // 将数组转换为Stream
        int[] arr = {1, 2, 3, 4};
        IntStream stream = Arrays.stream(arr);

        Integer[] array = {1, 2, 3, 4, 5};
        Stream<Integer> stream3 = Arrays.stream(array);

        // 将集合转换为Stream
        List<LocalDate> list = Arrays.asList(LocalDate.now(), LocalDate.of(1999, 2, 1), LocalDate.of(1998, 6, 1));
        Stream<LocalDate> stream4 = list.stream();
    }
}
