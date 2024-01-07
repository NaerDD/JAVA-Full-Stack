public class work10 {
    public static void main(String[] args) {
//        .计算1-10的累加结果以及1-10的累乘结果
        int sum = 0;
        for (int i = 0; i < 11; i++) {
            sum = sum+i;
        }
        System.out.println(sum);

        int sum2 = 1;
        for (int j = 2; j < 11; j++) {
            sum2 = sum2*j;
        }
        System.out.println(sum2);
    }
}
