package CollectionReview;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Collection集合的遍历方式
 * 方式二：增强for循环
 *      * 增强for可以用来遍历集合或者数组。
 *      * 增强for遍历集合，本质就是迭代器遍历集合的简化写法。
 */
public class test32 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("赵敏");
        c.add("小昭");
        c.add("苏苏");
        c.add("灭绝");
        System.out.println(c);
        // c = [赵敏, 小昭, 苏苏, 灭绝]
        //      ele

        // 使用增强for遍历集合或者数组。(简化写法：集合名.for)
        for (String s : c) {
            System.out.println(s);
        }

        System.out.println("---------------------");

        // 增强for循环遍历数组
        String[] names = {"东方月初", "涂山红红", "涂山雅雅", "涂山容容", "王权富贵"};
        for (String name : names) {
            System.out.println(name);
        }
    }
}