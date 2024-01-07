import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();

        /*
        * 底层将键和值封装为一个Node对象
        * Node类的有参构造方法，没有无参构造
        * Node(int hash, K key, V value, Node<K,V> next)
        * hash: 键经过计算后得到的hash值，本质上调用的key的hashCode方法
        *       HashSet底层维护的是一个HashMap，因此保存到HashSet中的对象必须要重写
        *       hashCode方法和equals方法
        * */
        map.put("小陈", 1);
        map.put("小赵", 1);
        map.put("小刘", 1);
        map.put("大陈", 1);

    }
}
