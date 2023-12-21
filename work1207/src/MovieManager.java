import java.util.ArrayList;

public class MovieManager {
    public MovieManager(){
        arr.add(new Movie("肖生克的救赎",9.7,1994,"弗兰克"));
        arr.add(new Movie("霸王别姬",9.6,1993,"张国荣"));
        arr.add(new Movie("阿甘正传",9.5,1994,"罗伯特"));
    }
        ArrayList<Movie> arr = new ArrayList<>();
        public void  query(){
            for (int i = 0; i < arr.size(); i++) {
                System.out.println(arr.get(i));
            }
        }
    }

