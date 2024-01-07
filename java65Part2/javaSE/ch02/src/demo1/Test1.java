package demo1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.function.IntFunction;

public class Test1 {
    public static void main(String[] args) {
        Integer[] array = new Random() //生成随机数对象
                //生成10个1000~10000内的随机数
                .ints(10,1000,10000)
                //装箱操作,将int[] 转换为Integer[]
                .boxed()
                //将IntStream转换为数组
                .toArray(Integer[]::new);
                //上面方法的lambda表达式 将从流中传来的value每一个都转型并返回
//                .toArray(new IntFunction<Integer[]>() {
//                    @Override
//                    public Integer[] apply(int value) {
//                        return new Integer[value];
//                    }
//                });
        System.out.println(Arrays.toString(array));

        // 实例化了Comparator接口，就必须要实现compare方法
        Comparator<Integer> comparator = TestLambda.comparator3();
        Arrays.sort(array,comparator);

        System.out.println(Arrays.toString(array));
        }
        /**
         * 自定义实现接口
         */
        private static class MyComparator implements Comparator<Integer>{
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        }

}
