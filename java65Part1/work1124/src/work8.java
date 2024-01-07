public class work8 {
    public static void main(String[] args) {
//        11. 打印   1  1   2   3   5  8   13.... 的前20项
        int a = 1,b=1;
        int n = 20;
        System.out.print(a + " " + b);
        for (int i = 2; i < n ; i++) {
            int c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
}
