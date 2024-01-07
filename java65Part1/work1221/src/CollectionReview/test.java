package CollectionReview;

import java.util.*;

public class test {
    public static void main(String[] args) {
        //简单确认一下Collection集合的特点
        //list分支下  有序 可重复 有索引
        ArrayList<String> arrayList = new ArrayList<>(); //   ArrayList检索快 增删慢
        arrayList.add("java1");
        arrayList.add("java2");
        arrayList.add("java3");
        arrayList.add("java4");
//        System.out.println(arrayList);

        LinkedList<String> linkedlist = new LinkedList<>(); //   linkedlist检索慢 增删快
        linkedlist.add("java1");
        linkedlist.add("java2");
        linkedlist.add("java3");
        linkedlist.add("java4");
//        System.out.println(linkedlist);

        //set分支下 无序 不重复 无索引
        //--HashSet：存取顺序不一致，set自动去重
        //根据hash值计算是否重复 所以对类要进行重写equals 根据对象的哪个属性计算hash值，无索引
        //根据hash值生成位置(不是随机位置) 自动去重复
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("java1");
        hashSet.add("java2");
        hashSet.add("java2");
        hashSet.add("java3");
        hashSet.add("java3");
        hashSet.add("java4");
//        System.out.println(hashSet);

            //HashSet下的 ---LinkedHashSet 有序
            LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
            linkedHashSet.add("java1");
            linkedHashSet.add("java2");
            linkedHashSet.add("java2");
            linkedHashSet.add("java3");
            linkedHashSet.add("java3");
            linkedHashSet.add("java4");
//            System.out.println(linkedHashSet);


        //TreeSet：按照大小默认升序排序、不重复、无索引。
            //ClassCastException异常 类没有实现Comparable接口。
            //--TreeSet<>中的泛型 或者对象 要存入TreeSet 必须要实现comparable这个接口 以实现 它加入元素后的重新排序 通过-1 0 1来确定是小于 等于 大于
            //这里String已经实现了 所以不会报错
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("java1");
        treeSet.add("java2");
        treeSet.add("java2");
        treeSet.add("java3");
        treeSet.add("java3");
        treeSet.add("java4");
        //输出
        System.out.println(treeSet);

        //遍历方式
        Iterator<String> it = treeSet.iterator();
        while(it.hasNext()){
            String e = it.next();
            System.out.println(e);
        }

    }
}