import java.math.BigInteger;

public class Big {
    public static void main(String[] args) {
        //BigInteger 类是 Java 中用于处理大整数的类。它可以表示任意大小的整数，包括正整数、负整数和零。
        // BigInteger 类提供了许多方法来处理大整数，例如加法、减法、乘法、除法和模运算。
        // 加法 add 减法 subtract  乘法 multiply 除法 divide 模运算 mod
        //要创建一个 BigInteger 对象，可以使用 BigInteger 构造函数。构造函数有两种形式：
        //* 带有 long 参数的构造函数：这个构造函数将 long 值转换为 BigInteger 对象。
        //* 带有 String 参数的构造函数：这个构造函数将 String 值转换为 BigInteger 对象。
        BigInteger bigInteger = new BigInteger("1");
        BigInteger bigInteger1 = BigInteger.ONE;
        for (int i = 1; i < 101; i++) {
            bigInteger = bigInteger.multiply(BigInteger.valueOf(i));
            bigInteger1 = bigInteger1.multiply(BigInteger.valueOf(i));
        }
        System.out.println(bigInteger);
        System.out.println(bigInteger1);

    }
}
