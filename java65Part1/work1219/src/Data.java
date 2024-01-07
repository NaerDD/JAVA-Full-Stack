import java.util.ArrayList;

public class Data {
        //类别集合
        public static ArrayList<category> cates = new ArrayList<>();

        //商品集合
        public static ArrayList<productinfo> produ = new ArrayList<>();

        static {
                //默认类 没有父级id
                cates.add(new category(1,"玩具类",0));
                cates.add(new category(2,"酒水类",0));
                cates.add(new category(3,"洗漱类",0));
                //默认几个二级类别
                cates.add(new category(4,"火车类",1));
                cates.add(new category(5,"红酒类",2));
                cates.add(new category(6,"洗碗类",3));
                //默认几个商品
                produ.add(new productinfo(1,"小火车",20,"cz","红色",20,1));
                produ.add(new productinfo(2,"白酒",20,"cz","白色",20,2));
                produ.add(new productinfo(3,"洗发液",20,"cz","绿色",20,3));
        }

}
