public class work5 {
    public static void main(String[] args) {
//        5、给定如下5个字符串，将长度最大的一个输出。
//        s[0]="java applet";
//        s[1]="I love you";
//        s[2]="program is started";
//        s[3]="Boston is a city.a ED";
//        s[4]="good bye";
//        (1):首先求出所有字符串的长度,将这些长度储存起来
//        (2):使用最大值算法求出长度最大的一个
//        (3):对应输出长度最大的那一个字符串
//        (4)将所有字符串的空格换成*并进行拼接成一个字符串输出.
        String[] str = new String[5];
                str[0]="java applet";
                str[1]="I love you";
                str[2]="program is started";
                str[3]="Boston is a city.a ED";
                str[4]="good bye";
        int[] len = new int[5];
        for (int i = 0; i < len.length; i++) {
            len[i] = str[i].length();
        }
        int max = 0;
        for (int i = 1; i < len.length; i++) {
            if(len[i]>len[max]){
                max = i;
            }
        }
        System.out.println("长度最大的在"+max+"下标");

        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i].replace(" ","*"));
        }
    }
}
