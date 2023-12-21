public class work3 {
    public static void main(String[] args) {
//        5: 车牌号码4位，前两位数相同，后两位数相同，且这4位数是个整数的平方，车牌是多少？1234
        int i = 1000;
        while (i < 10000){
            int ge = i%10;
            int shi = i/10%10;
            int bai = i/100%10;
            int qian = i/1000;
            if (ge==shi & bai==qian){
                double num2 = Math.floor(Math.sqrt(i));
                if(Math.pow(num2,2)==i){
                    System.out.println(i);
                    break;
                }
            }
            i++;
        }
    }
}