package ProductManager.test;

import ProductManager.bean.category;
import ProductManager.bean.product;
import ProductManager.dao.impl.categoryDaoImp;
import ProductManager.dao.impl.productDaoImp;

import java.util.List;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        menu();
    }

    public static void menu(){
        System.out.println("欢迎使用商品管理系统:1.添加类别 2.查看所有类别 3.添加商品 4.退出");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        categoryDaoImp cate = new categoryDaoImp();
        productDaoImp pro = new productDaoImp();
        switch (num){
            case 1:
                /**
                 * 1. 添加类别功能，用户无法添加顶级类别，
                 * 请提前在数据库添加2~3个顶级类别，用户选择添加功能后，
                 * 先展示现有的顶级类别信息给用户，用户输入新类别名称，选择顶级类别后完成添加操作(15分)
                 */
                //展示所有父类 新增类的第三个参数是父类中的一个
                List<category> arr =  cate.queryAll();
                for (category category : arr) {
                    System.out.println(category);
                }
                System.out.println("输入你要添加的类的名称");
                String name = sc.next();
                System.out.println("输入你要添加的类的父类ID");
                Integer parentId = sc.nextInt();
                category c1 = new category(null,name,parentId);
                System.out.println("添加成功"+cate.add(c1)+"行");
                menu();
                break;
            case 2:
                List<category> arr2 =  cate.queryAll();
                for (category category : arr2) {
                    System.out.println(category);
                }
                menu();
                break;
            case 3:
                /**
                 * 2. 添加商品功能, 提示用户输入商品名称，价格，发布人名称，颜色，数量
                 * 自动获取当前时间为添加时间，向用户展示所有二级类别供用户选择，完成添加操作(15分)
                 */
                product p = new product();
                p.setId(null);
                System.out.println("输入新增商品名称:");
                System.out.println("输入新增商品价格:");
                System.out.println("输入新增商品发布人名称:");
                System.out.println("输入新增商品颜色:");
                System.out.println("输入新增商品数量:");
                //时间
                //展示二级类别
                System.out.println("输入新增商品类别:");
                pro.add(p);
                menu();
                break;
            case 4:
                break;
        }
        System.out.println("");
    }
}
