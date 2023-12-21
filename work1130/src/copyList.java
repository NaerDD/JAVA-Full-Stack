public class copyList {
    public static void main(String[] args) {
        //浅拷贝方法
        int[] arr1 ={1,2,3,4,5};
        int[] arr2 = new int[arr1.length];
        copyArr(arr1,arr2);
        System.out.println(arr1);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
        }

        System.out.println("\n"+arr2);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);
        }
    }
    public static void copyArr(int[] arr1,int[] arr2){
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
    }
}
