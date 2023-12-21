public class sushu {
    public static void main(String[] args) {
        //判断101-200之间有多少个素数,并输出所有素数
        int count = sushu();
        System.out.println("有"+count+"个素数");
    }

    public static int sushu(){
        int count = 0;
        for (int i = 101; i <=200  ; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                    if(i%j==0){
                        flag =false;
                        break;
                    }
            }
            if(flag){
                System.out.println(i+" ");
                count++;
            }

        }
        return count;
    }


}
