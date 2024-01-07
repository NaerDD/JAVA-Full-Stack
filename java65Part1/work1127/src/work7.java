import java.util.Scanner;

public class work7 {
    public static void main(String[] args) {
//        7. 完成数据交换程序,现有一组数{13,6,75,22,11,8,5,7,1},请用户输入2个需要交换的元素位置，然后将这2个位置的元素交换，输出交换后的数组
        int[] arr = {13,6,75,22,11,8,5,7,1};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个元素的位置:");
        int positon1 = sc.nextInt();
        System.out.println("请输入第二个元素的位置:");
        int positon2 = sc.nextInt();
        int positonTemp = 0;
        positonTemp = arr[positon1];
        arr[positon1] = arr[positon2];
        arr[positon2]= positonTemp;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
