package CollectionReview;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
         * 3、Collection集合的遍历方式
         * 之前学习过的集合遍历方式（for循环），只能遍历List集合，不能遍历Set集合，
         * 因为以前的普通for循环遍历需要索引，只有List集合有索引，而Set集合没有索引。
         *
         * 3.1 迭代器遍历方式
         * 迭代器就是一种集合的通用遍历方式。
         * 遍历就是一个一个的把容器中的元素访问一遍。
         * 迭代器在Java中的代表是Iterator，迭代器是集合Set的专用的遍历方式。
         * Collection集合的遍历方式
         * 方式一：迭代器概述：
         *      迭代器是用来遍历集合的专用方式(数组没有迭代器)，在Java中迭代器的代表是Iterator。
         */
        public class test31 {
            public static void main(String[] args) {
                Collection<String> c = new ArrayList<>();
                c.add("赵敏");
                c.add("小昭");
                c.add("素素");
                c.add("灭绝");
                System.out.println(c); //[赵敏, 小昭, 素素, 灭绝]

                //第一步：先获取迭代器对象
                //解释：Iterator就是迭代器对象，用于遍历集合的工具)
                Iterator<String> it = c.iterator();

                //第二步：用于判断当前位置是否有元素可以获取
                //解释：hasNext()方法返回true，说明有元素可以获取；反之没有
                while(it.hasNext()){
                    //第三步：获取当前位置的元素，然后自动指向下一个元素.
                    String e = it.next();
                    System.out.print(e+" ");
                }
            }
        }
