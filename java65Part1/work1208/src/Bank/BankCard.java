package Bank;

import java.util.ArrayList;
import java.util.Scanner;

public class BankCard {
    //本行卡 非本行卡
    private String Account_name;
    //卡号
    private long cardNumber;
    //余额
    private double Balance;
    //密码
    private int Password;
    Scanner sc = new Scanner(System.in);

    public BankCard() {
    }
    //公有方法
    //查询余额
    public void queryBalance(){
        System.out.println("余额还有:"+this.getBalance());
    }

    //存款
    public void addBalance(){
        System.out.println("请输入要存款的金额:");
        int number= sc.nextInt();
        if(number<=0){
            System.out.println("存款金额不能小于0!");
        }else{
            setBalance(this.getBalance()+number);
            System.out.println("存款成功!");
        }
    }
    //取款
    public void decreamBalance(){
        System.out.println("请输入要取款的金额:");
        double number = sc.nextDouble();

        if(number>getBalance()){
            System.out.println("余额不足!");
        }else{
            if(this.Account_name.equals("非本行卡")){
                //多收2%手续费
                setBalance(this.getBalance()-number-number*0.02);
                System.out.println("取款成功!");
            }else {
                setBalance(this.getBalance()-number);
                System.out.println("取款成功!");
            }
        }
    }
    //转账
    public void transifer2(ArrayList<BankCard> bankCardList){

    };


    public BankCard(String account_name, long cardNumber, int balance, int password) {
        setAccount_name(account_name);
        setBalance(balance);
        setCardNumber(cardNumber);
        setPassword(password);
    }

    public String getAccount_name() {
        return Account_name;
    }

    public void setAccount_name(String account_name) {
        Account_name = account_name;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
            Balance = balance;
    }

    public int getPassword() {
        return Password;
    }

    public void setPassword(int password) {
        Password = password;
    }
}
