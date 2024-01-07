public class work5 {
    public static void main(String[] args) {
//        有鸡兔子共35只，它们一共有94只脚，问有多少只鸡多少只兔子。利用编程求出结果
        int sum1 = 35;
        int sum2 = 94;
        //兔
        int tu =4;
        //鸡
        int ji =2;
        //i是兔子的数量
        for (int i = 35; i >1 ; i--) {
            if(i*4+(sum1-i)*ji==94){
                System.out.println("兔子有"+i+"只,"+"鸡有"+(35-i)+"只");
            }
        }
    }
}
