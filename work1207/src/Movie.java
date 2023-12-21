public class Movie {
    private String movieName;
    private double score;
    private int year;
    private String director;

    public Movie(String movieName, double score, int year, String director) {
        setMovieName(movieName);
        setScore(score);
        setYear(year);
        setDirector(director);
    }

    public Movie() {

    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieName='" + movieName + '\'' +
                ", score=" + score +
                ", year=" + year +
                ", director='" + director + '\'' +
                '}';
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
