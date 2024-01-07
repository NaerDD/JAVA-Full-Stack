package demo1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TestFunction {
    public static void main(String[] args) {
        // 将97，98，99，100几个数组转换为IntStream
        LinkedList<String> collect = IntStream.rangeClosed(97, 100)
                .parallel() // 并行，重复利用CPU多核心优势，在不写一行线程的代码的情况下，进行并发变成
                .boxed() // 将IntStream转换为Stream<Integer>
                // 将数字转换为字母；  int -> char
                .map(integer -> {
                    char aChar = (char) integer.intValue();
                    return String.valueOf(aChar);
                })

                // 利用Collectors类中的方法，将流中的元素保存到List集合
                // .collect(Collectors.toList())
                // 查看方法的参数列表，鼠标选择要查看的方法，ctrl + q 查看文档注释
                .collect(
                        // 自定义一个容器来接收Stream中的元素
                        LinkedList::new,
                        // 自定指定，如何将流中的元素添加到LinkedList中
                        LinkedList::add,
                        // 如果整合数据过程中产生了多个LinkedList; 第三个参数指定如何将多个集合的数据合并
                        LinkedList::addAll
                );

        System.out.println(collect);
    }
}
