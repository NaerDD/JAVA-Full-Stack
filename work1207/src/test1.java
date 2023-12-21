import java.util.ArrayList;

public class test1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        list.add(98);
        list.add(23);
        list.add(25);
        list.add(25);
        list.add(25);
        list.add(25);
        System.out.println(list);
//        for (int i = list.size()-1; i >= 0;) {
//            list.remove(i);
//        }
        for (int i = 0; i < list.size();) {
            list.remove(i);
        }
        System.out.println(list);

    }
}
