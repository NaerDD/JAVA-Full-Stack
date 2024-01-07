import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HashSetTest {
    public static void main(String[] args) {
        Set<Object> set = new HashSet<>();
        // 每次向集合中添加元素时，必定会执行元素的hashCode方法
        set.add(new Item(1));
        set.add(new Item(2));
        // 当对象的hash值相同时，会调用对象的equals方法，来比较两个对象的属性值是否相等
        set.add(new Item(2));

        System.out.println("set集合的长度： " + set.size());
    }

    private static class Item{
        int i;

        public Item(int i) {
            this.i = i;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Item item = (Item) o;
            System.out.println("equals被执行了，当前对象和目标对象是否相等: " + (i == item.i));
            return i == item.i;
        }

        @Override
        public int hashCode() {
            int hash = Objects.hash(i);
            System.out.println("hashCode被执行了，hash值 = " + hash);
            return hash;
        }
    }
}
