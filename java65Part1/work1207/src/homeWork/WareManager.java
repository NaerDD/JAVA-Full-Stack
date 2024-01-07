package homeWork;

import java.util.ArrayList;
import java.util.Scanner;

public class WareManager {
    public WareManager(){
        arr.add(new Ware("旺旺",10,"A001",20));
        arr.add(new Ware("红牛",5,"A002",10));
        arr.add(new Ware("香烟",15,"A003",30));
        arr.add(new Ware("红茶",3,"A004",40));
        arr.add(new Ware("绿茶",3,"A005",40));
    }
    //库存数据源
    ArrayList<Ware> arr = new ArrayList<>();
    //购物车数据源
    ArrayList<Ware> cart = new ArrayList<>();
    //接收用户输入
    Scanner sc = new Scanner(System.in);
    //展示所有商品
    public void  findAll(ArrayList<Ware> xxxx){
        System.out.println("商品名称\t\t商品价格\t\t商品编号\t\t剩余数量");
        for (Ware m : xxxx) {
            //展示不美观
            //System.out.println(m.toString());
            System.out.println(m.getWareName() + "\t\t" + m.getPrice() + "\t\t" + m.getId() + "\t\t" + m.getCount());
        }
    }

    //通过ID条码查找商品信息 返回Ware对象  传集合对象是为了确认在哪个集合中(购物车/商店库存)去查
    public Ware findById(String GetID,ArrayList<Ware> x){
        for (Ware m : x) {
            if (GetID.equals(m.getId())) {
                System.out.println(m.getWareName() + "\t\t" + m.getPrice() + "\t\t" + m.getId() + "\t\t" + m.getCount());
                return m;
            }
        }
        return null;
    }

    //菜单
    public void menu(){
        System.out.println("1.查看商品 2.购物(存到购物车) 3.查看购物车 4.调整购物车 5.结算购物车 6.退出");
        while (true){
            int choose = sc.nextInt();
            switch (choose){
                case 1:
                    findAll(arr);
                    break;
                case 2:
                    System.out.println("输入要找/购买商品ID:");
                    String GetID = sc.next();
                    //库存实体类
                    System.out.println("仓库中的数量:");
                    Ware m1 = findById(GetID,arr);
                    //商品实体类 在购物车中查询
                    System.out.println("购物车中的数量:");
                    Ware m2 = findById(GetID,cart);
                    if(m2  != null){
                        //购物车已有 修改操作
                        System.out.println("输入要修改的数量:");
                        int num = sc.nextInt();
                        m2.setCount(num);
                    }else{
                        //购物车没有 新增操作
                        Ware w3 = new Ware();
                        w3.setId(m1.getId());
                        w3.setWareName(m1.getWareName());
                        w3.setPrice(m1.getPrice());
                        System.out.println("输入要购买的数量:");
                        int num = sc.nextInt();
                        if(num > m1.getCount()){
                            System.out.println("数量超出!");
                        }else{
                            w3.setCount(num);
                            cart.add(w3);
                            System.out.println("添加到购物车成功!");
                        }
                    }
                    break;
                case 3:
                    System.out.println("购物车:");
                    findAll(cart);
                    break;
                case 4:
                    System.out.println("输入你要修改的商品的ID");
                    String str = sc.next();
                    System.out.println("输入你修改后的值(0从购物车删除):");
                    int markNum = sc.nextInt();
                    Ware ware = findById(str,cart);
                    if(markNum == 0){
                        //执行从购物车删除操作
                        if(ware != null){
                            cart.remove(ware);
                            System.out.println("删除成功");
                        }else {
                            System.out.println("没有该商品!");
                        }
                    }else{
                        //执行在购物车中修改数量操作
                        ware.setCount(markNum);
                    }
                    break;
                case 5:
                    //结算购物车/清空购物车/调整库存数量
                    findAll(cart);
                    double sum = 0;
                    for (Ware value : cart) {
                        sum = sum + value.getPrice() * value.getCount();
                    }
                    System.out.println("总价格:"+sum+"元");
                    //从库存中删除
                    for (int j = 0; j < cart.size(); j++) {
                        arr.get(j).setCount(arr.get(j).getCount()-cart.get(j).getCount());
                    }
                    System.out.println("从库存中删除成功");
                    //购物车清空 这里不能使用如下方法 因为会触发跳删
//                    for (int i = 0; i < cart.size(); i++) {
//                        cart.remove(cart.get(i));
//                    }
                    //清空方法
                    cart.clear();
                    break;
                case 6:
                    System.out.println("欢迎下次光临");
                    return;
                default:
                    System.out.println("错误的选择!请重新输入!");
                    break;
            }

        }
    }
}
