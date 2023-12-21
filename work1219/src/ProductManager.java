import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager {

    Scanner sc = new Scanner(System.in);
    int index = 3;
    //商品id 已经存在3个
    int x = 3;
    //查看所有类别功能
    public void queryAll(){
        System.out.println("已有类别:");
        for (int i = 0; i < Data.cates.size(); i++) {
            System.out.print(Data.cates.get(i).getTitle()+" ");
        }
        System.out.println("\n");
    }
    //添加类别功能
    public void addCate(){
        System.out.println("输入你要添加的新类别:");
        String temp  = sc.next();
        int flag = -1;
        for (int i = 0; i < index; i++) {
            if(temp.equals(Data.cates.get(i).getTitle())){
                flag = i;
            }
        }
        if(flag==-1){
            //准备添加 父级是哪个类?
            System.out.println("这个类别是哪个类的子类?输入下标:");
            queryAll();
            int inX  = sc.nextInt();
            if(inX>Data.cates.size()){
                System.out.println("下标超出!");
            }else{
                //可以添加
                Data.cates.add(new category(index+1,temp,inX));
                System.out.println("添加完成");
                index++;
            }
        }else{
            System.out.println("类别已存在!无法重复添加!");
        }
    }
    //添加商品功能
    public void addPro(){
        System.out.println("输入你要添加的商品名称:");
        String proName  = sc.next();
        System.out.println("输入你要添加的商品价格:");
        int proPrice  = sc.nextInt();
        System.out.println("输入发布人名称:");
        String publisher  = sc.next();
        System.out.println("输入商品颜色:");
        String prodColor  = sc.next();
        System.out.println("输入商品数量:");
        int prodCount  = sc.nextInt();
        //展示二级类别 给用户选择 商品添加到二级类别下 完成操作
        System.out.println("有以下二级类别供选择:");
        for (int i = 0; i < Data.cates.size(); i++) {
            //有以下二级类别供选择
            if(Data.cates.get(i).getParentid()!=0){
                System.out.println(Data.cates.get(i).getTitle()+" ID是 "+Data.cates.get(i).getId());
            }
        }
        System.out.println("输入你要添加到的二级类别ID:");
        int parentId  = sc.nextInt();
        Data.produ.add(new productinfo(x+1,proName,proPrice,publisher,prodColor,prodCount,x+1));
        x++;
        System.out.println("添加成功!");
    }
    //根据id查商品
    public int queryProById(){
        System.out.println("输入你要查询的商品ID:");
        int proId  = sc.nextInt();
        int flag = -1;
        for (int i = 0; i < Data.produ.size(); i++) {
            if (Data.produ.get(i).getId()==proId) {
                flag = i;
            }
        }
        return flag;
    }
    //商品修改
    public void modifyPro(int flag2){
        if(flag2==-1){
            System.out.println("没有你要查询的商品!");
        }else{
            System.out.println("输入你要修改的商品名称:");
            String proName  = sc.next();
            System.out.println("输入你要修改的商品价格:");
            int proPrice  = sc.nextInt();
            System.out.println("输入修改后的发布人名称:");
            String publisher  = sc.next();
            System.out.println("输入修改后商品颜色:");
            String prodColor  = sc.next();
            System.out.println("输入修改后商品数量:");
            int prodCount  = sc.nextInt();
            System.out.println("输入修改后商品类别ID:");
            int prodID  = sc.nextInt();
            Data.produ.set(flag2,new productinfo(x++,proName,proPrice,publisher,prodColor,prodCount,prodID));
            System.out.println("修改完成!");
        }
    }
    //删除商品
    public void deletePro(int flag3){
        if(flag3==-1){
            System.out.println("没有你要删除的商品");
        }else{
            Data.produ.remove(flag3);
            System.out.println("删除成功");
        }

    }

    //菜单
    public void menu() {
        System.out.println("1.添加类别功能 2.查看所有类别 3.添加商品 4.根据id查商品 5.商品修改 6.商品删除 7.退出");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                queryAll();
                addCate();
                menu();
            case 2:
                queryAll();
                menu();
            case 3:
                addPro();
                menu();
            case 4:
                int flag = queryProById();
                if(flag==-1){
                    System.out.println("没有你要查询的商品!");
                }else{
                    System.out.println(Data.produ.get(flag));
                }
                menu();
            case 5:
                int flag2 = queryProById();
                modifyPro(flag2);
                menu();
            case 6:
                int flag3 = queryProById();
                deletePro(flag3);
                menu();
            case 7:
                System.out.println("谢谢使用");
                break;
        }
    }
}

