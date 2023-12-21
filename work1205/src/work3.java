import java.util.Scanner;

public class work3 {
    public static void main(String[] args) {
        System.out.println("请输入一个网站的地址:");
        Scanner sc = new Scanner(System.in);
        String str  = sc.next();
//        Com: 商业网站
//        Net: 网络服务机构的网站
//        Org: 非盈利组织的网站
//        Gov: 政府机构的网站
//        Edu: 教育机构的网站
//        否则就属于其他类型.
        if(str.endsWith(".com")){
            System.out.println("商业网站");
        }else if(str.endsWith(".Net")){
            System.out.println("网络服务机构的网站");
        }else if(str.endsWith(".Org")){
            System.out.println("非盈利组织的网站");
        }else if(str.endsWith(".Gov")){
            System.out.println("政府机构的网站");
        }else if(str.endsWith(".Edu")){
            System.out.println("教育机构的网站");
        }else{
            System.out.println("其他类型的网站");
        }
    }
}
