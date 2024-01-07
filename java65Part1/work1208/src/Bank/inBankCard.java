package Bank;

import java.util.ArrayList;
import java.util.Scanner;

public class inBankCard extends BankCard{
    //本行卡有转账方法
//    public void transifer1(ArrayList<BankCard> bankCardList){
//        //子类拿到ArrayList<BankCard> 进行遍历操作找到要转账的卡号
//        System.out.println("输入你要转账的卡号:");
//        Scanner sc = new Scanner(System.in);
//        long number =sc.nextLong();
//        int flag = -1;
//        for (int i = 0; i < bankCardList.size(); i++) {
//            if(bankCardList.get(i).getCardNumber()==number){
//                flag = i;
//            }
//        }
//        //找到了
//        if(flag!=-1){
//            //在集合中找到了 可以进行转账操作
//            System.out.println("输入你要转账的金额:");
//            double money = sc.nextDouble();
//            //对方加金额
//            bankCardList.get(flag).setBalance(bankCardList.get(flag).getBalance()+money);
//            //自己减少金额
//            this.setBalance(this.getBalance()-money);
//            System.out.println("转账成功!");
//        }else{
//                //没找到 不能转账
//                System.out.println("没有找到你要转账的卡号!");
//        }
//    }
    //本行卡有转账方法 通过重写父类方法来实现
    public void transifer2(ArrayList<BankCard> bankCardList){
        //子类拿到ArrayList<BankCard> 进行遍历操作找到要转账的卡号
        System.out.println("输入你要转账的卡号:");
        Scanner sc = new Scanner(System.in);
        long number =sc.nextLong();
        int flag = -1;
        for (int i = 0; i < bankCardList.size(); i++) {
            if(bankCardList.get(i).getCardNumber()==number){
                flag = i;
            }
        }
        //找到了
        if(flag!=-1){
            //在集合中找到了 可以进行转账操作
            System.out.println("输入你要转账的金额:");
            double money = sc.nextDouble();
            //对方加金额
            bankCardList.get(flag).setBalance(bankCardList.get(flag).getBalance()+money);
            //自己减少金额
            this.setBalance(this.getBalance()-money);
            System.out.println("转账成功!");
        }else{
            //没找到 不能转账
            System.out.println("没有找到你要转账的卡号!");
        }
    }

    public inBankCard() {
    }

    public inBankCard(String account_name, long cardNumber, int balance, int password) {
        super(account_name, cardNumber, balance, password);
    }

}
