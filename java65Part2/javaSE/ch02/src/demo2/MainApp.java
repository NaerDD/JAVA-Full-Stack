package demo2;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.DoubleConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainApp {
    private final Trader raoul = new Trader("Raoul", "Cambridge");
    private final Trader mario = new Trader("Mario", "Milan");
    private final Trader alan = new Trader("Alan", "Cambridge");
    private final Trader brian = new Trader("Brian", "Cambridge");

    // 初始化的交易记录
    private List<Transaction> list = Arrays.asList(
            new Transaction(brian, 2011, 300),
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
    );

    public static void main(String[] args) {
        MainApp ma = new MainApp();
        // ma.test1();
        // ma.test2();
        // ma.test3();
        // ma.test4();
        // ma.test5();
        // ma.test7();
        // ma.test8();
        // ma.test9();
        ma.test10();
    }

    /*
     * 1. 找出`2011`年发生的所有交易，并按交易额排序（从高到低）。
     * 2. 交易员都在哪些不同的城市工作过？
     * 3. 查找所有来自`Cambridge`的交易员，并按姓名排序。
     * 4. 返回所有交易员的姓名字符串，按字母顺序排序。
     * 5. 有没有交易员在`Milan`工作
     * 6. 打印生活在`Cambridge`的交易员的所有交易额。
     * 7. 所有的交易额中，最高的交易额是多少？
     * 8. 所有的交易额中，找到交易额最小的交易
     */

    // 1. 找出`2011`年发生的所有交易，并按交易额排序（从高到低）。
    public void test1() {
        List<Transaction> collect = list.stream()
                // 从Stream<Transaction> 筛选出年份为2011的数据
                .filter(t -> t.getYear().equals(2011))
                // 交易额排序（从高到低）, 让t2比t1
                .sorted((t1, t2) -> t2.getValue().compareTo(t1.getValue()))
                .collect(Collectors.toList());

        collect.forEach(t -> {
            Integer year = t.getYear();
            Integer value = t.getValue();
            String name = t.getTrader().getName();
            System.out.println("年份:" + year + "， 金额： " + value + ", 交易员： " + name);
        });
    }

    // 交易员都在哪些不同的城市工作过？
    public void test2() {
        list.stream()
                .flatMap(t -> Stream.of(t.getTrader().getCity()))
                // 去重
                .distinct()
                .forEach(System.out::println);
    }

    // 查找所有来自`Cambridge`的交易员，并按姓名排序
    public void test3() {
        list.stream()
                // 将流从Stream<Transaction> 转换为 Stream<Trader>
                .map(t -> t.getTrader())
                // 筛选处所在城市为Cambridge的交易员
                .filter(t -> t.getCity().equals("Cambridge"))
                // 根据交易员姓名排序
                .sorted((o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName()))
                // Trader必须重写equals和hashCode方法
                .distinct()
                // 输出交易员对象
                .forEach(System.out::println);
    }

    // 返回所有交易员的姓名字符串，按字母顺序排序。
    public void test4() {
        String collect = list.stream()
                // 将流从Stream<Transaction> 转换为 Stream<Trader>
                .map(t -> t.getTrader())
                .map(trader -> trader.getName())
                .distinct()
                .sorted() // 因为String类实现了Comparable接口。可以直接调用sorted()方法
                .collect(Collectors.joining(","));

        System.out.println("所有交易员的姓名: " + collect);
    }

    // 有没有交易员在`Milan`工作
    public void test5() {
        // Optional是一个容器，包装了真实数据. 主要作用是避免了空指针异常的出现
        list.stream()
                .map(t -> t.getTrader())
                .filter(t -> t.getCity().equals("Milan"))
                .distinct()
                .findFirst() // Optional
                .ifPresent(t -> System.out.println(t)); // 如果有在Milan工作的交易员
    }

    // 打印生活在`Cambridge`的交易员的所有交易额
    public void test6() {
        double sum = list.stream()
                // 找到在Cambridge生活的交易员
                .filter(t -> t.getTrader().getCity().equals("Cambridge")) // Stream<Transaction>
                .mapToDouble(t -> t.getValue()) // DoubleStream
                .sum();

        System.out.println("生活在Cambridge的交易员的所有交易额：" + sum);
    }

    // 所有的交易额中，最高的交易额是多少？
    public void test7() {
        list.stream()
                .mapToDouble(t-> t.getValue())
                .max()
                .ifPresent(max -> {
                    System.out.println("所有交易中最高金额为： " + max);
                });
    }

    // 所有的交易额中，找到交易额最小的交易
    public void test8() {
        list.stream()
                .min((t1, t2) -> t1.getValue().compareTo(t2.getValue()))
                .ifPresent(t -> {
                    System.out.println("交易数据： " + t);
                });
    }

    // 统计每一年的所有交易额并输出
    public void test9(){
        // key为分组依据，年份
        // value： List<Transaction>， 该年份下的所有交易
        Map<Integer, List<Transaction>> map = list.stream()
                // 根据交易的年份分组； 将所有相同的年份划分到一组中
                .collect(Collectors.groupingBy(t -> t.getYear()));

        map.forEach((year, transactions) -> {
            // 统计该年份下的所有交易额
            double sum = transactions.stream().mapToDouble(t -> t.getValue()).sum();
            System.out.println("年份： " + year + ", 交易总金额： " + sum);
        });
    }

    // 将所有交易分区，输出单笔金额大于700的交易的总金额；并且输出单笔交易小于等于700的交易的总金额；
    public void test10() {
        // 所有金额大于700的，key为true，value为金额大于700的交易记录
        Map<Boolean, List<Transaction>> collect = list.stream()
                // 根据交易的年份分组； 将所有相同的年份划分到一组中
                .collect(Collectors.partitioningBy(t -> t.getValue() > 700));

        collect.forEach((key,transactions) -> {
            double sum = transactions.stream().mapToDouble(t -> t.getValue()).sum();
            System.out.println(key ? "金额大于700的交易的总金额：" + sum : "金额小于等于700的交易的总金额： " + sum);
        });

    }

}
