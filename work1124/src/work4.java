public class work4 {
    public static void main(String[] args) {
//        7：有一个长阶梯，
//        每步上2阶，最后剩1阶；
//        若每步上3阶，最后剩2阶；
//        若每步上5阶，最后剩4阶；
//        若每步上6阶，最后剩5阶；
//        只有每步上7阶，最后一阶也不剩。
//        请问该阶梯至少有多少阶。编写一个Java程序解决该问题。
        for (int i = 7; i < 200; i++) {
            if(i%2==1 && i%3==2 && i%5==4 && i%7==0){
                System.out.println(i);
                break;
            }
        }
    }
}
