package demo1;

import java.util.Comparator;
import java.util.function.Predicate;

public class TestLambda {
    public static void main(String[] args) {

        Predicate<Integer> predicate = i -> i % 2 == 0;

        // lambda表达式有限制，因此lambda需要搭配StreamAPI才能够真正的发挥威力

    }

    /**
     * 匿名实现类
     * @return
     */
    public static Comparator<Integer> comparator1(){
        /**
         * 升序排序： o1 比 o2
         *          如果o1 > o2, 方法返回正数
         *          o1 < 02, 方法返回负数
         *          o1 == o2, 返回0
         * 倒序排序：
         *          o1 比 o2
         *          如果o1 > o2, 方法返回负数
         *          o1 < 02 方法返回正数
         *          o1 == o2, 返回0
         * @param o1 the first object to be compared.
         * @param o2 the second object to be compared.
         * @return
         */
        // 匿名实现类
        return new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        };
    }

    public static Comparator<Integer> comparator2(){
        // 匿名实现类

        // 如果接口中有且仅有一个自定义的方法时，匿名实现类则可以替换为lambda表达式
        // 满足函数式变成的风格, 接口上使用@FunctionalInterface注解标注
        // 反而言之，如果接口中有多个抽象方法（Object中的方法除外），则不能使用lambda表达式替代匿名实现类

        // lambda表达式是一种语法糖，用于简化匿名实现类中的抽象方法的实现
        // lambda表达式实现了Comparator接口
        return (Integer o1, Integer o2) -> {
            return o2 - o1;
        };
    }

    public static Comparator<Integer> comparator3(){
        // 当方法只有一行代码时，可以省略代码块和return
        return (o1, o2) -> o2 - o1;
    }

    /**
     * 被@FunctionalInterface标注的接口只能有一个抽象方法
     */
    @FunctionalInterface
    public interface MyInterface{
        void c(int x, int y);

        boolean equals(Object obj);
    }
}
