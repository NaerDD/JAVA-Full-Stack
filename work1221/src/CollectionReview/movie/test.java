package CollectionReview.movie;

import java.util.ArrayList;
import java.util.Collection;

public class test {
    public static void main(String[] args) {
        Collection<Movie> movies = new ArrayList<>();
        movies.add(new Movie("《肖生客的救赎》",9.7,"罗宾斯"));
        movies.add(new Movie("《霸王别姬》",9.6,"张丰毅"));
        movies.add(new Movie("《阿甘正传》",9.5,"汤姆汉克斯"));
//        System.out.println(movies);
        for (Movie movie : movies) {
            System.out.print("电影名:"+movie.getName()+" ");
            System.out.print("评分:"+movie.getScore()+" ");
            System.out.print("演员:"+movie.getActor()+" ");
            System.out.println("\n");
        }
    }
}
