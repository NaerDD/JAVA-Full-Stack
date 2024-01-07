import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        //生成中奖号码
        int[] luckNumbers = createLuckNumber();
        for (int luckNumber : luckNumbers) {
            System.out.print(luckNumber + "\t");
        }
        System.out.println();
        //生成用户号码
        int[] userNumbers = userInputNumber();
        for (int userNumber : userNumbers) {
            System.out.print(userNumber + "\t");
        }
        //调用判断是否中奖方法
        judge(luckNumbers,userNumbers);
    }

    //判断是否中奖
    private static void judge(int[] luckNumbers, int[] userNumbers) {
        if(luckNumbers[luckNumbers.length-1]==userNumbers[userNumbers.length-1]){
            //蓝色球相等的情况下
            int redNumberRight = 0;
            for (int i = 0; i < luckNumbers.length-1; i++) {
                for (int j = 0; j < userNumbers.length-1; j++) {
                    if (luckNumbers[i]==userNumbers[j]){
                        redNumberRight++;
                        break;
                    }
                }
            }
            System.out.println();
            //拿到红球中的个数
            System.out.println("红球命中个数:"+redNumberRight);
            //篮球已经中的情况下 统计红球个数
            switch (redNumberRight){
                case 1:
                case 2:
                    System.out.println("中了5元");
                    break;
                case 3:
                    System.out.println("中了10元");
                    break;
                case 4:
                    System.out.println("中了200元");
                    break;
                case 5:
                    System.out.println("中了3000元");
                    break;
                case 6:
                    System.out.println("中了6个红球 最高1000万!");
                    break;
            }
        }else{
            //蓝色球不相等的情况下
            int redNumberRight = 0;
            for (int i = 0; i < luckNumbers.length-1; i++) {
                for (int j = 0; j < luckNumbers.length-1; j++) {
                    if (luckNumbers[i]==userNumbers[j]){
                        redNumberRight++;
                    }
                }
            }
            System.out.println("______________");
            //拿到红球中的个数
            System.out.println(redNumberRight);
            switch (redNumberRight){
                case 4:
                    System.out.println("中了10元");
                    break;
                case 5:
                    System.out.println("中了200元");
                    break;
                case 6:
                    System.out.println("中了6个红球 最高500万!");
                    break;
            }
        }
    }
    //生成用户号码方法
    private static int[] userInputNumber() {
        Scanner sc = new Scanner(System.in);
        int[] userNumbers = new int[6];
        //用户依次输入6个 红色球
        for (int i = 0; i < userNumbers.length; i++) {
            System.out.println("请输入你要下注的号码:");
            userNumbers[i] = sc.nextInt();
                if(i>0){
                    for (int j = 0; j < i; j++) {
                        if(userNumbers[i]==userNumbers[j]){
                            i--;
                            System.out.println("有重复值! 请在当前位置重新输入!:");
                        }
                    }
                }
            }
        //用户依次输入1个 蓝色球
        System.out.println("输入你所选的蓝色球:");
        int blueNumber = sc.nextInt();
        if(blueNumber<1 | blueNumber>16){
            System.out.println("超出范围!重新输入!:");
            blueNumber = sc.nextInt();
        }
        //将红蓝球拼接 返回总数组回去
        int[] userTotalNumbers = new int[7];
            userTotalNumbers[userTotalNumbers.length-1] = blueNumber;
            for (int i = 0; i < userTotalNumbers.length-1; i++) {
                userTotalNumbers[i] = userNumbers[i];
            }
        return userTotalNumbers;}

    //随机生成一组中奖号码 1-33取6个
    private static int[] createLuckNumber() {
        int[] LuckNumbers = new int[6];
        //随机生成6个红色球
        for (int i = 0; i < LuckNumbers.length; i++) {
            LuckNumbers[i] = (int) (Math.random() * 34);
            if(i>0){
                for (int j = 0; j < i; j++) {
                    if(LuckNumbers[i]==LuckNumbers[j]){
                        i--;
                    }
                }
            }
        }
        //随机生成一个蓝色球
        int blueNumber = (int)(Math.random() * 16)+1;
        int[] luckTotalNumbers = new int[7];
        luckTotalNumbers[luckTotalNumbers.length-1] = blueNumber;
        for (int i = 0; i < luckTotalNumbers.length-1; i++) {
            luckTotalNumbers[i] = LuckNumbers[i];
        }
        return luckTotalNumbers;
    }
}
