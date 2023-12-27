package CollectionReview;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

/**
 * Collection集合的遍历方式
 * 方式三：lambda表达式
 * Lambda表达式遍历集合
 *      得益于JDK8开始的新技术Lambda表达式，提供了一种更简单，更直接的方式来遍历集合。
 */
public class test33 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("赵敏");
        c.add("小昭");
        c.add("苏苏");
        c.add("灭绝");
        System.out.println(c);
        // c = [赵敏, 小昭, 苏苏, 灭绝]
        //       s

        // default void forEach(Consumer<? super T> action)：集合Lambda遍历集合。
        // 原始方法(Consumer是接口，通过匿名内部类创建对象)
//        c.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });
//
        // Lambda简化1
//        c.forEach((String s) -> {
//                System.out.println(s);
//        });
//
        // Lambda简化2
//        c.forEach(s -> {
//            System.out.println(s);
//        });
//
        // Lambda简化3
//        c.forEach(s -> System.out.println(s));

        // Lambda简化4(最终简化：println是一个方法)
//        c.forEach(System.out::println);
    }
}