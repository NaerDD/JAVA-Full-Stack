public class work11 {
    public static void main(String[] args) {
//      5. 1至50中是7的倍数的数值之和
        int sum = 0;
        for (int i = 1; i < 51; i++) {
            if(i%7==0){
                sum+=i;
            }
        }
        System.out.println(sum);
    }

}
