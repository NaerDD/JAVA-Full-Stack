import java.util.ArrayList;
import java.util.Scanner;

public class Manager{
        static {
        //初始化三个项目
        item i1= new item("头部检测","扫描头部",2000);
        item i2= new item("胸部检测","扫描胸部",1000);
        item i3= new item("扫描腿部","扫描腿部",1000);
        Data.allItems.add(i1);
        Data.allItems.add(i2);
        Data.allItems.add(i3);
        ArrayList<item> items = new ArrayList<>();
        items.add(i1);
        items.add(i2);
        items.add(i3);
        //将项目集合 添加到套餐1这个套餐中去
        Data.thalis.add(new thali("套餐1",items));
        //加一个空的套餐2
        Data.thalis.add(new thali("套餐2",items));
        }
        Scanner sc = new Scanner(System.in);

        //添加项目 添加到所有item中 并不直接添加到套餐
        public void addItem(){
                System.out.println("输入你要添加的项目名称:");
                String name = sc.next();
                System.out.println("输入你要添加的项目细节:");
                String details = sc.next();
                System.out.println("输入你要添加的项目价格:");
                double price = sc.nextDouble();
                //将项目放到全部item中
                Data.allItems.add(new item(name,details,price));
        }
        //删除项目
        public void  removeItem(){
                System.out.println("输入你要删除的项目名称:");
                String name = sc.next();
                int flag = -1;
                for (int i = 0; i < Data.allItems.size(); i++) {
                        if(Data.allItems.get(i).getName().equals(name)){
                                flag = i;
                        }
                }
                if(flag==-1){
                        System.out.println("没找到你要删除的项目");
                }else{
                        Data.allItems.remove(flag);
                        System.out.println("删除成功");
                }
        }
        //从套餐中移除项目
        public void removeItemFromThail(){
                System.out.println("输入你要删除的项目名称:");
                //在全局中找
                String name = sc.next();
                int flag = -1;
                for (int i = 0; i < Data.allItems.size(); i++) {
                        if(Data.allItems.get(i).getName().equals(name)){
                                flag = i;
                        }
                }
                if(flag==-1){
                        System.out.println("没找到你要删除的项目");
                }else{
                        //找到了 再在套餐中去找
                        System.out.println("输入你要从哪个套餐中删除:");
                        String name1 = sc.next();
                        int flag2 = -1;
                        for (int i = 0; i < Data.thalis.size(); i++) {
                                if(Data.thalis.get(i).getTname().equals(name1)){
                                        flag2 = i;
                                }
                        }
                        if(flag2!=-1){
                                //有这个套餐
                                int flag3 = -1;
                                for (int i = 0; i < Data.thalis.size(); i++) {
                                        for (int j = 0; j < Data.thalis.get(i).getItem().size(); j++) {
                                                if(Data.thalis.get(j).getItem().get(j).getName().equals(name1)){
                                                        flag3 = j;
                                                        Data.thalis.get(j).getItem().remove(flag3);
                                                        break;
                                                }
                                        }
                                }
                                if(flag3==-1){
                                        System.out.println("该套餐中没有这个项目!");
                                }else{
                                        System.out.println("删除成功");
                                }
                        }else{
                                System.out.println("没有这个套餐!");
                        }
                        Data.allItems.remove(flag);
                        System.out.println("删除成功");
                }
        }

        //添加套餐 添加到所有套餐集合中
        public void addthali(){
                System.out.println("输入你要添加的套餐的名称:");
                String name = sc.next();
                Data.thalis.add(new thali(name));
                System.out.println("添加成功");
        }

        //查询所有项目集合
        public void queryAllItem(){
            System.out.println(Data.allItems+"\n");
        }

        //查询所有套餐集合
        public void queryAllThail(){
                int sum = 0;
                for (int i = 0; i < Data.thalis.size(); i++) {
                        for (int j = 0; j < Data.thalis.get(i).getItem().size(); j++) {
                                sum += Data.thalis.get(i).getItem().get(j).getPrice();
                        }
                        System.out.println(Data.thalis.get(i).getTname() + "价格为:" + sum);
                        sum = 0;
                }
        }
        //将项目复制到套餐的集合当中去
        public void MoveItemToThail(){
                queryAllItem();
                System.out.println("选择你要添加到套餐中去的项目下标:");
                int flag1 = sc.nextInt();
                System.out.println("你要将该项目添加到哪个套餐中去?输入下标:");
                queryAllThail();
                int flag2 = sc.nextInt();
                Data.thalis.get(flag2).getItem().add(Data.allItems.get(flag1));
        }
        //菜单
        public void menu() {
                System.out.println("1.查询所有项目 2.查询所有套餐 3.将项目移动到套餐 4.添加项目 5.删除项目 6.添加套餐 7.从套餐中移除项目 8.退出");
                int choose = sc.nextInt();
                switch (choose) {
                        case 1:
                                queryAllItem();
                                menu();
                                break;
                        case 2:
                                queryAllThail();
                                menu();
                                break;
                        case 3:
                                MoveItemToThail();
                                menu();
                                break;
                        case 4:
                                addItem();
                                menu();
                                break;
                        case 5:
                                removeItem();
                                menu();
                                break;
                        case 6:
                                addthali();
                                menu();
                                break;
                        case 7:
                                removeItemFromThail();
                                menu();
                                break;
                        case 8 :
                                System.out.println("欢迎下次使用!");
                                break;

                }
        }

}
