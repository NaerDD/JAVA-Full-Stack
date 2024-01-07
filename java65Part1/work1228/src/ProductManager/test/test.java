package ProductManager.test;

import ProductManager.bean.category;
import ProductManager.bean.product;
import ProductManager.dao.impl.categoryDaoImp;
import ProductManager.dao.impl.productDaoImp;

import java.util.*;

public class test {
    public static void main(String[] args) {
        menu();
    }

    public static void menu(){
        System.out.println("欢迎使用商品管理系统:1.添加类别 2.查看所有类别 3.添加商品 4.查询商品 5.商品修改 6.退出");
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
                arr.forEach(System.out::println);
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
                String name2 = sc.next();
                System.out.println("输入新增商品价格:");
                Float price2 = sc.nextFloat();
                System.out.println("输入新增商品发布人名称:");
                String name3 = sc.next();
                System.out.println("输入新增商品颜色:");
                String color = sc.next();
                System.out.println("输入新增商品数量:");
                Integer count = sc.nextInt();
                //展示二级类别
                List<category> list = cate.querySec();
                for (category category : list) {
                    System.out.println(category);
                }
                System.out.println("输入新增商品类别:");
                Integer cl = sc.nextInt();
                p.setProdName(name2);
                p.setProPrice(price2);
                p.setPublisher(name3);
                p.setProdColor(color);
                p.setProdCount(count);
                p.setCateId(cl);
                //时间
                Date time = new Date();
                p.setDate(new java.sql.Date(time.getTime()));
                //将封装好的对象 调用 添加方法
                pro.add(p);
                menu();
                break;
            case 4:
                /**
                 * 3. 提供添加时间范围，颜色，数量范围，类别名称，商品名称作为筛选条件查询商品，
                 * 查询结果需展示商品类别，商品名称，商品数量，颜色，添加时间，发布人名称，商品单价(20分)
                 */
                //通用查询 前置条件提供
                Map<String,Object> pars = new HashMap<>();

                System.out.println("输入要查找的商品添加日期:(*表示不输入 yyyy-MM-dd)");
                String date = sc.next();
                if(!date.equals("*")){
                    //用户输入的日期信息
                    pars.put("createTime",date);
                }

                System.out.println("输入要查找的商品颜色:(*表示不输入)");
                String color2 = sc.next();
                if(!color2.equals("*")){
                    //用户输入的日期信息
                    pars.put("prodColor",color2);
                }

                System.out.println("输入要查找的商品数量:(*表示不输入)");
                String count2 = sc.next();
                if(!count2.equals("*")){
                    //用户输入的日期信息
                    pars.put("prodCount",count2);
                }

                System.out.println("输入要查找的商品类型ID:(*表示不输入)");
                String cateId = sc.next();
                if(!cateId.equals("*")){
                    //用户输入的日期信息
                    pars.put("cateId",cateId);
                }

                System.out.println("输入要查找的商品名:(*表示不输入)");
                String prodName = sc.next();
                if(!prodName.equals("*")){
                    //用户输入的日期信息
                    pars.put("prodName",prodName);
                }

                List<Object> obj = pro.generateQuery(pars);
                for (Object o : obj) {
                    System.out.println(o);
                }
                menu();
                break;
            case 5:
                // 4. 商品修改功能，根据用户提供的商品编号，对商品的名称，单价，剩余数量，发布人姓名，颜色及商品类别进行修改(20分)
                System.out.println("输入你要修改商品的id");
                Integer id = sc.nextInt();
                product p2 = pro.soloQueryPro(id);
                System.out.println(p2);
                if(p2==null){
                    System.out.println("没有你要修改的商品信息");
                }else{
                    System.out.println("输入修改后的名称:");
                    String proName4 = sc.next();
                    System.out.println("输入修改后的单价:");
                    Float price4 = sc.nextFloat();
                    System.out.println("输入修改后的数量:");
                    Integer count4 = sc.nextInt();
                    System.out.println("输入修改后的发布人姓名:");
                    String pubName = sc.next();
                    System.out.println("输入修改后的颜色:");
                    String afterColor = sc.next();
                    System.out.println("输入修改后的类别:");
                    Integer cateID = sc.nextInt();

                }
                menu();
                break;
            case 6:

                break;
        }
    }
}
