package CollectionReview.movie;

public class Movie implements Comparable{
    private String name;
    private Double score;
    private String actor;

    public Movie(String name, Double score, String actor) {
        setName(name);
        setScore(score);
        setActor(actor);
    }

    public Movie() {
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", actor='" + actor + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    //如果需要使用TreeSet来排序 如何比较的问题
    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
