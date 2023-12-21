import java.util.Scanner;

public class work3 {
    public static void main(String[] args) {
//        5.实现选择启动游戏功能:
        System.out.println("请选择想玩的游戏:");
        System.out.println("1.魔兽世界 2.DNF 3.传奇 4.CS2:");
        Scanner sc = new Scanner(System.in);
        int game = sc.nextInt();
        switch (game){
            case 1:
                System.out.println("魔兽世界启动了");
                break;
            case 2:
                System.out.println("DNF启动了");
                break;
            case 3:
                System.out.println("传奇启动了");
                break;
            case 4:
                System.out.println("CS2启动了");
                break;
        }
    }
}
