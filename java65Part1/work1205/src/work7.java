public class work7 {
    public static void main(String[] args) {
//        1、将一字符串中的字符变为其后一个字符：如：z3acyd@2->a3bdze@2
        String str = "z3acyd@2";
        char[] strArr = str.toCharArray();
        for (int i = 0; i < strArr.length; i++) {
            //如果是a-z之间
            if(strArr[i]>=97 & strArr[i]<122){
                strArr[i]+=1;
                //如果是z
            }else if(strArr[i]==122){
                strArr[i]-=25;
            }
        }
        for (int i = 0; i < strArr.length; i++) {
            System.out.print(strArr[i]);
        }
    }
}
