import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class StringJoinerTest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        // 遍历集合，使用*将所有的元素拼接成一个字符串

        test1(list);
        test2(list);
    }

    /**
     * 采用StringBuilder拼接
     * @param list
     */
    private static void test1(List<Integer> list){
        StringBuilder builder = new StringBuilder();
        for (Integer i : list) {
            builder.append(i)
                    .append("*");
        }
        String substring = builder.substring(0, builder.length() - 1);
        System.out.println(substring);
    }

    /**
     * 采用StringJoiner拼接字符串
     * @param list
     */
    private static void test2(List<Integer> list) {
        StringJoiner stringJoiner = new StringJoiner("*","<",">");
        for (Integer i : list) {
            stringJoiner.add(i.toString());
        }
        String string = stringJoiner.toString();
        System.out.println(string);
    }

}
