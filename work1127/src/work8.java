public class work8 {
    public static void main(String[] args) {
//        扩展题
//        8、有一个数组  int[] arr={123, 12, 3445,2178};
//        请分解每一个数字后计算和，如果是偶数就输出来
//        如： 123=1+2+3=6    6是偶数，显示123
        int[] arr={123, 12, 3445,2178};
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int sum = 0;
            while (num!=0){
                sum = sum + num%10;
                num = num/10;
            }
            if (sum%2==0){
                System.out.println(sum+"是偶数"+arr[i]);
            }
        }
    }
}
