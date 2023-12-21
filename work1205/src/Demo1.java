public class Demo1 {
    public static void main(String[] args) {
        String[] str = {"hello","admin","bus","hill","just","but","test","demo"};
        String temp2;
        for (int i = 0; i < str.length; i++) {
            for (int j = i+1; j < str.length; j++) {
                if(str[i].compareTo(str[j])>0){
                    temp2 = str[j];
                    str[j]= str[i];
                    str[i] = temp2;
                }
            }
        }
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
        //按照顺序打印所有的字符串
//        int[] nums = {22,12,3,5,21,7};
//        int temp;
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i+1; j < nums.length; j++) {
//                if (nums[i]>nums[j]){
//                    temp = nums[i];
//                    nums[i] = nums[j];
//                    nums[j] = temp;
//                }
//            }
//        }
//        for (int i = 0; i < nums.length; i++) {
//            System.out.print(nums[i]+" ");
//        }
    }
}
