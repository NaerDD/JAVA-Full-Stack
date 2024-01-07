package demo1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class FlatMapTest {
    public static void main(String[] args) {
        // test1();
        test2();
    }
    /**
     * 展开一个二维数组，输出数组中的每个元素
     */
    private static void test1(){
        // 二维数组
        String[][] array = {
                new String[]{"张三", "李四", "王五", "赵六"}, // Stream.of(strings)
                new String[]{"小明", "小红", "小花", "小李"}, // Stream.of(strings)
                new String[]{"小陈", "大陈", "小赵", "小刘"}  // Stream.of(strings)
        };

        // 将数据源转换为Stream
        List<String> collect = Stream.of(array)
                .flatMap(Stream::of)
                .collect(Collectors.toList());

        System.out.println(collect);
    }

    private static class Student{
        String name;
        Sc sc;

        public Student(String name, Sc sc) {
            this.name = name;
            this.sc = sc;
        }
    }

    private static class Sc{
        double score;
        String course;

        public Sc(double score, String course) {
            this.score = score;
            this.course = course;
        }
    }

    private static List<Student> data(){
        Sc sc1 = new Sc(99, "语文");
        Sc sc2 = new Sc(69, "数学");
        Sc sc3 = new Sc(19, "英语");
        List<Student> list = new ArrayList<>();
        list.add(new Student("张三", sc1));
        list.add(new Student("李四", sc2));
        list.add(new Student("王五", sc3));
        return list;
    }

    /**
     * 使用flatmap对集合中的对象做展开操作
     */
    private static void test2() {
        OptionalDouble optionalDouble = data().stream()   // Stream<Student>
                .flatMapToDouble(stu -> DoubleStream.of(stu.sc.score)) // 展开student对象，获取成绩对象中的成绩，并转换为DoubleStream
                // .forEach(System.out::println);
                // .sum(); // 求总成绩，返回double
                // .average() // 求平均成绩
                // .max() // 求最高成绩
                .min();// 求最低分

        // 先判断是否存在最低分
        if (optionalDouble.isPresent()) {
            double min = optionalDouble.getAsDouble();
            System.out.println("最低分：" + min);
        }
    }


}
