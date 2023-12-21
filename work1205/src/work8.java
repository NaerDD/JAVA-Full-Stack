public class work8 {
    public static void main(String[] args) {
        //2、用户输入一些字符串，然后把里面的所有数字输出整数，如：
        //     “你好呀1,你在吗23”     结果为：123
        String str = "你好呀1,你在吗23";
        char[] strArr = str.toCharArray();
        for (int i = 0; i < strArr.length; i++) {
            if(strArr[i]>='0'&strArr[i]<='9'){
                System.out.print(strArr[i]);
            }
        }

    }
}
