import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class mode1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("bdc");
        list.add("ccc");
        //Character char类型的引用数据类型
        Map<Character,Integer> counts= new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            char[] cs = list.get(i).toCharArray();
            for (int j = 0; j < cs.length; j++) {
                if(counts.containsKey(cs[j])){
                    counts.put(cs[j],counts.get(cs[j])+1);
                }else{
                    counts.put(cs[j],1);
                }
            }
        }
        for (Character c : counts.keySet()) {
            System.out.println(c+":"+counts.get(c));
        }
    }
}
