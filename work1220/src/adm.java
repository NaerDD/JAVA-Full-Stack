import java.util.*;

//管理员类
public class adm {
    static Scanner sc = new Scanner(System.in);
    //初始化套餐列表 所有套餐的集合
    public static Map<Integer, checkBands> list = new HashMap();

    static {
        //默认添加三个套餐
        list.put(1, new checkBands("套餐一"));
        list.put(2, new checkBands("套餐二"));
        list.put(3, new checkBands("套餐三"));
    }

    //套餐K值
    static int flag = 4;

    //添加项目到套餐
    public static void addItem() {
        System.out.println("添加到几号套餐:");
        Integer num = sc.nextInt();
        if (list.containsKey(num)) {
            //如果存在该项目
            System.out.println("输入要添加的项目名:");
            String name = sc.next();
            System.out.println("输入要添加的项目信息:");
            String info = sc.next();
            System.out.println("输入要添加的项目价格:");
            int price = sc.nextInt();
            checkItem c1 = new checkItem(name, info, price);
            //调用set方法 向目标套餐中的items添加项目  这里的K值是该项目名字的hashcode c1重写hashcode如果itemName相同则认定相同
            list.get(num).setCheckItem(name.hashCode(), c1);
        } else {
            System.out.println("没有该套餐!");
        }
    }

    //新增套餐
    public static void addBands() {
        System.out.println("输入你要添加的套餐名称:");
        String name = sc.next();
        list.put(flag, new checkBands(name));
        flag++;
    }

    //删除套餐
    private static void removeBand() {
        System.out.println("输入你要删除的套餐id");
        int id = sc.nextInt();
        if (list.containsKey(id)) {
            //如果有该套餐
            list.remove(id);
        } else {
            System.out.println("没有该套餐!");
        }
    }

    //删除指定套餐中的项目
    public static void removeItem() {
        System.out.println("输入你要删除的项目所属套餐id");
        int id = sc.nextInt();
        if (list.containsKey(id)) {
            //如果有该套餐
            System.out.println("输入你要删除该套餐中的哪个项目?输入项目名:");
            String id2 = sc.next();
            checkBands pkg = list.get(id);
            if (pkg.getCheckItem().containsKey(id2.hashCode())) {
                //如果有这个对象
                //方法 1总价要先从对象中减去 如果先删对象 会空指针
                //list.get(id).setBandsSumPrice(pkg.getBandsSumPrice() - pkg.getCheckItem().get(id2.hashCode()).getItemPrice());

                // 再删除对象
                pkg.getCheckItem().remove(id2.hashCode());
                System.out.println("删除成功");
                //方法 2 重新统计总价
                resetSummoney();
            }
        } else {
            System.out.println("没有该套餐!");
        }
    }

    //重新统计金额
    public static void resetSummoney() {
        list.forEach((id, checkBands) -> {
            checkBands.setBandsSumPrice(0);
            checkBands.getCheckItem().forEach((itemName, checkItem) ->
                    checkBands.setBandsSumPrice(checkBands.getBandsSumPrice() + checkItem.getItemPrice()));
        });
    }

    //修改项目
    public static void modify() {
        System.out.println("输入你要修改的项目所属套餐id");
        int id2 = sc.nextInt();
        if (list.containsKey(id2)) {
            //如果有该套餐
            System.out.println("输入你要修改该套餐中的哪个项目?输入项目名:");
            String id4 = sc.next();
            checkBands pkg = list.get(id2);
            if (pkg.getCheckItem().containsKey(id4.hashCode())) {
                //有这个项目
                System.out.println("你要进行什么操作?:1.修改说明 2.修改价格");
                int xx = sc.nextInt();
                switch (xx) {
                    case 1:
                        //修改说明
                        System.out.println("输入你要修改的说明：");
                        pkg.getCheckItem().get(id4.hashCode()).setItemInfo(sc.next());
                        System.out.println("修改成功");
                        break;
                    case 2:
                        //修改价格
                        System.out.println("输入修改后的价格：");
                        pkg.getCheckItem().get(id4.hashCode()).setItemPrice(sc.nextInt());
                        //总价格中也发生变动 调方法直接重新遍历
                        resetSummoney();
                        break;
                }

        } else {
                //没有这个项目
                System.out.println("没有该项目！");
            }
        }else{
            System.out.println("没有这个套餐！");
        }
}

    //查看所有项目
    public static void queryAllItem() {
        list.forEach((s, checkBands) -> System.out.println(checkBands));
    }

    //菜单
    public void menu() {
        System.out.println("1.添加项目到套餐 2.查看所有套餐中的项目 3.新增套餐 4.删除套餐 5.删除项目 6.修改项目 7.退出");
        int choose = sc.nextInt();
        switch (choose) {
            case 1:
                addItem();
                menu();
                break;
            case 2:
                queryAllItem();
                menu();
                break;
            case 3:
                addBands();
                menu();
                break;
            case 4:
                removeBand();
                menu();
                break;
            case 5:
                removeItem();
                menu();
                break;
            case 6:
                modify();
                menu();
                break;
            case 7:
                System.out.println("欢迎下次使用!");
                break;
        }
    }
}

