package Bank;

import java.util.ArrayList;
import java.util.Scanner;

public class BankCardManager {
    public static void main(String[] args) {
        //先初始化两张本行卡 和非本行卡
        inBankCard a1 = new inBankCard("本行卡",10001,10000,222222);
        inBankCard a2 = new inBankCard("本行卡",10002,10000,333333);
        outBankCard b1 = new outBankCard("非行卡",20002,10000,333333);
        outBankCard b2 = new outBankCard("非行卡",20002,10000,333333);
        ArrayList<BankCard> bankCardList = new ArrayList<>();
        //将四张卡添加到集合中去 方便后续遍历拿到卡信息
        bankCardList.add(a1);
        bankCardList.add(a2);
        bankCardList.add(b1);
        bankCardList.add(b2);

        Scanner sc = new Scanner(System.in);
        System.out.println("欢迎来到人民银行!请输入你的银行卡号:");
        long BankCard = sc.nextLong();
        while (true){
            int number =0;
            int flag = -1;
            String account_name= "";
            for (int i = 0; i < bankCardList.size(); i++) {
                if(BankCard==bankCardList.get(i).getCardNumber()){
                    flag = i;
                    account_name = bankCardList.get(i).getAccount_name();
                }
            }
            //在卡集合中找到了卡
            if(flag!=-1){
                //卡是本行卡
                if(account_name.equals("本行卡")){
                    System.out.println("请输入你要进行的操作:");
                    System.out.println("1.余额查询 2.存款 3.取款 4.转账 5.退出");
                    number = sc.nextInt();
                }else{
                    System.out.println("请输入你要进行的操作:");
                    System.out.println("1.余额查询 2.存款 3.取款");
                    number = sc.nextInt();
                    if(number>3){
                        System.out.println("输入有误!请重新输入!");
                    }
                }
            }else {
                //在卡集合中没有找到
                System.out.println("没有该卡!!");
            }

            switch (number){
                case 1:
                    //查询功能 --来自父类
                    bankCardList.get(flag).queryBalance();
                    break;
                case 2:
                    //存款功能 --来自父类
                    bankCardList.get(flag).addBalance();
                    break;
                case 3:
                    //取款功能 --来自父类
                    bankCardList.get(flag).decreamBalance();
                    break;
                case 4:
                    //转账功能 --本行卡子类自带功能
                    //方法一 强制类型转换成子类对象 拆箱
//                    inBankCard localBankCard = (inBankCard) bankCardList.get(flag);
//                    把集合传给子类去操作
//                    localBankCard.transifer1(bankCardList);
                    //方法二 重写 override
                    //父类中写一个空的transifer2方法 以达到子类重写父类的方法
                    // 将子类中的transifer2传递给父类 而避免了改动指针指向 无需拆箱操作
                    bankCardList.get(flag).transifer2(bankCardList);
                    break;
                case 5:
                    System.out.println("欢迎下次使用");
                    return;
            }

        }
    }
}
