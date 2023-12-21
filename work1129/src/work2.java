import java.util.Scanner;

public class work2 {
    public static void main(String[] args) {
        System.out.println("********************");
        System.out.println("**     猜拳，开始   **");
        System.out.println("********************");
        System.out.println("出拳规则:1.剪刀 2.石头 3.布");
        System.out.println("请选择对方角色(1:刘备 2:孙权 3:曹操):");
        Scanner sc = new Scanner(System.in);
        int roleNum = sc.nextInt();
        System.out.println("请输入你的姓名:");
        String yourNum = sc.next();
        System.out.println(yourNum+"VS"+roleNum+"对战");
        System.out.println("要开始吗? (y/n)");
        String yesOrNo = sc.next();
        if(yesOrNo.equals("y")){
            System.out.println("请出拳:1.剪刀 2.石头 3.布(输入相应数字):");
            int hand = sc.nextInt();
            switch (hand){
                case 1:
                    System.out.println("你出拳:剪刀");
                    break;
                case 2:
                    System.out.println("你出拳:石头");
                    break;
                case 3:
                    System.out.println("你出拳:布");
                    break;
            }
            System.out.println("");
            race(hand,roleNum);
        }
    }
    public static void race(int hand,int roleNum){
        switch (roleNum){
            case 1:
                //对战刘备 刘备出拳 剪刀
                switch (hand){
                    //你出剪刀
                    case 1:
                        System.out.println("刘备出拳:剪刀");
                        System.out.println("结果说:平局!");
                        break;
                    //你出石头
                    case 2:
                        System.out.println("刘备出拳:剪刀");
                        System.out.println("结果说:你赢了!真厉害!");
                        break;
                   //你出布
                    case 3:
                        System.out.println("刘备出拳:剪刀");
                        System.out.println("结果说:你输了真笨!");
                        break;
                }
                break;
            case 2:
                //对战孙权 孙权出拳 石头
                switch (hand){
                        //你出剪刀
                    case 1:
                        System.out.println("孙权出拳:石头");
                        System.out.println("结果说:你输了真笨!");
                        break;
                        //你出石头
                    case 2:
                        System.out.println("孙权出拳:石头");
                        System.out.println("结果说:平局!");
                        break;
                        //你出布
                    case 3:
                        System.out.println("孙权出拳:石头");
                        System.out.println("结果说:你赢了!真厉害!");
                        break;
                }
                break;
            case 3:
                //对战曹操 曹操出拳 布
                switch (hand){
                    //你出剪刀
                    case 1:
                        System.out.println("曹操出拳:布");
                        System.out.println("结果说:你赢了!真厉害!");
                        break;
                        //你出石头
                    case 2:
                        System.out.println("曹操出拳:布");
                        System.out.println("结果说:你输了真笨!");
                        break;
                        //你出布
                    case 3:
                        System.out.println("曹操出拳:布");
                        System.out.println("结果说:平局!");
                        break;
                }
                break;
        }
    };
}
