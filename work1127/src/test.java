public class test {
    public static void main(String[] args) {
        int[] nums=new int[3];//0  2  4
        for(int i=1;i<nums.length;i++){
            nums[i]=i*2;
        }

        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]);
        }


    }
}
