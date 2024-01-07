public class work7 {
    public static void main(String[] args) {
//        10. 使用 a b c d四个字符可以组成哪些各位不重复的3位字符串 ****
        String a = "a";
        String b = "b";
        String c = "c";
        String d = "d";
        String sum = "";
        sum = sum + a;
        sum = sum + b;
        sum = sum + c;
        sum = sum + d;
        while (true){
            if(sum.indexOf(0)!=sum.indexOf(1) & sum.indexOf(0)!=sum.indexOf(2)){
                System.out.println(sum);
            }
            sum = "";
        }
    }
}
