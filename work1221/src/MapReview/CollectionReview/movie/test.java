package MapReview.CollectionReview.movie;

import java.util.HashMap;
import java.util.Map;

public class test {
    public static void main(String[] args) {
        Map<Integer,Movie> movies = new HashMap<>();
        Movie m1 = new Movie(1,"《肖生客的救赎》",9.7,"罗宾斯");
        Movie m2 = new Movie(2,"《霸王别姬》",9.6,"张丰毅");
        Movie m3 = new Movie(3,"《阿甘正传》",9.5,"汤姆汉克斯");
        Movie m4 = new Movie(3,"《阿甘正传》",9.5,"汤姆汉克斯");
        movies.put(m1.getId(),m1);
        movies.put(m2.getId(),m2);
        movies.put(m3.getId(),m3);
        //此时 id相同 -> k相同 无法添加
        movies.put(m4.getId(),m4);

        System.out.println(movies);
        movies.forEach((integer, movie) -> {
            System.out.println(integer);
            System.out.println("Movie Name: " + movie.getName());
            System.out.println("Movie Rating: " + movie.getScore());
            System.out.println("Movie Actor: " + movie.getActor());
        });
        //问题二 如何理解 是Integer对应HashSet String对应Collection吗?
        //        1. HashMap<Integer,String> = HashSet + Collection
        //        2. TreeMap = TreeSet + Collection
        //        3. LinkedHashMap = LinkedHashSet + Collection
    }
}
