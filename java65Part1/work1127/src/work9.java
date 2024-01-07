public class work9 {
    public static void main(String[] args) {
//        9、在一个字符串中找第一个只出现过一次的字符
//        如：输入”azbaccdeff”,显示第一个出现过一次的字符是： z
        String str = "azbaccdeff";
        String[] arr = str.split("");
        int flag = 0;
        a:for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i].equals(arr[j])){
                    flag = 1;
                    break;
                }else{
                    flag = i;
                }
            }
            if(flag != 0){
                System.out.print(arr[flag]);
                break a;
            }

        }
    }
}
