package demo1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class TestInterfaceInstance {
    /**
     * java中的接口和抽象类不能直接被实例化
     * 如果要实例化接口或者是抽象类，就必须实现所有的抽象方法
     * @param args
     */
    public static void main(String[] args) {
        Integer[] array = new Random() // 生成随机数的对象
                // 生成10个1000~10000内的随机数
                .ints(10, 1000, 10000)
                // 装箱操作，将int[] 转换为Integer[]
                .boxed()
                // 将IntStream转换为数组
                .toArray(Integer[]::new);

        System.out.println(Arrays.toString(array));

        // 实例化了Comparator接口，就必须要实现compare方法
        //自定义排序规则
        // Arrays.sort(array,new MyComparator());
        Comparator<Integer> comparator = TestLambda.comparator3();
        //降序排序
        Arrays.sort(array,comparator);

        System.out.println(Arrays.toString(array));
    }

    /**
     * 自定义类实现接口
     */
    private static class MyComparator implements Comparator<Integer>{

        @Override
        public int compare(Integer o1, Integer o2) {
            return 0;
        }
    }
}
