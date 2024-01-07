public class work6 {
    public static void main(String[] args) {
//        6.现有一组数{3,12,5,6,11,8,7}请编写Java程序求租该组数的最大值和最小值.(请编写2种方法实现)
        int[] arr = {3,12,5,6,11,8,7};
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]>arr[i]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
        System.out.println("最大值:"+arr[0]+" 最小值:"+arr[arr.length-1]);
    }
}
