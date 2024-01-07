import java.util.Scanner;

public class work9 {
    public static void main(String[] args) {
//        3、用户输入一个字符串，然后再输入一个字符，判断该字符在该字符串出现过几次
//        如：输入  "我爱android编程，android也爱我"
//        输入要查询的字符：  '爱'
//        结果是：  爱出现过2次
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个字符串内容:");
        String str1 = sc.next();
        char[] str1Arr = str1.toCharArray();

        System.out.println("输入要查找的内容:");
        String str2 = sc.next();
        char[] str2Arr = str2.toCharArray();

        int count = 0;
        for (int i = 0; i < str1Arr.length; i++) {
            if(str1Arr[i]==str2Arr[0])
                count++;
        }
        System.out.println(str2+"出现过"+count+"次");

    }
}
