package demo1;

import java.util.Arrays;
import java.util.Random;
import java.util.function.Predicate;

public class TestPredicate {
    public static void main(String[] args) {
        Integer[] array = data();

        // Predicate<Integer> predicate = i -> isPrimeNumber(i);
        // TestPredicate.isPrimeNumber(Integer) 需要一个Integer的参数
        // 而Predicate.test(Integer) 提供了一个Integer的参数
        // 判断num是否为素数
        // Predicate<Integer> predicate = TestPredicate::isPrimeNumber;

        // 判断num是否为回文数
        Predicate<Integer> predicate = TestPredicate::isLoopNum;

        // printNum(array, predicate);

        test();
    }

    /**
     * 判断是否为回文数 是就输出 不是就没有输出 一般写法
     * @param array
     * @param predicate
     */
    private static void printNum(Integer[] array, Predicate<Integer> predicate) {
        for (Integer i : array) {
            // 按照用户提供的Predicate输出符合条件的数
            if (predicate.test(i)){
                System.out.println("i = " + i);
            }
        }
    }

    /**
     * 使用StreamAPI实现和printNum相同的效果 Stream + lambda写法
     */
    private static void test() {

        // 得到初始数据
        Integer[] data = data();
        // 将Integer[]转换为Stream
        Arrays.stream(data) // 长度为1万的随机整数
                // 从这1万个随机数中筛选处符合条件的数据
                .filter((num) -> isLoopNum(num))
                .forEach(System.out::println);
    }

    /**
     * 初始化1万个随机整数
     * @return
     */
    private static Integer[] data() {
        return new Random()
                .ints(10000) // 生成10000个随机数
                .boxed() // 装箱，流从 IntStream 转变为 Stream<Integer>
                .toArray(Integer[]::new);
    }

    /**
     * 判断num是否为素数
     * 除了1和本身外，不能被其他数整除
     * @param num
     * @return
     */
    private static boolean isPrimeNumber(Integer num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * 判断num是否为回文数
     * @param num
     * @return
     */
    private static boolean isLoopNum(Integer num){
        String str = num.toString();
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length / 2; i++) {
            char left = charArray[i];
            char right = charArray[charArray.length - 1 - i];
            if (left != right) {
                return false;
            }
        }
        return true;
    }
}
