package bean;

public class book {
    private Integer b_id;
    private String b_name;
    private String author_name;
    private Integer b_t_id;
    private String b_des;

    public book() {
    }

    @Override
    public String toString() {
        return "book{" +
                "b_name='" + b_name + '\'' +
                ", author_name='" + author_name + '\'' +
                ", b_t_id=" + b_t_id +
                ", b_des='" + b_des + '\'' +
                '}';
    }

    public book(Integer b_id, String b_name, String author_name, Integer b_t_id, String b_des) {
        this.setB_id(b_id);
        this.setB_name(b_name);
        this.setAuthor_name(author_name);
        this.setB_t_id(b_t_id);
        this.setB_des(b_des);
    }

    public Integer getB_id() {
        return b_id;
    }

    public void setB_id(Integer b_id) {
        this.b_id = b_id;
    }

    public String getB_name() {
        return b_name;
    }

    public void setB_name(String b_name) {
        this.b_name = b_name;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public Integer getB_t_id() {
        return b_t_id;
    }

    public void setB_t_id(Integer b_t_id) {
        this.b_t_id = b_t_id;
    }

    public String getB_des() {
        return b_des;
    }

    public void setB_des(String b_des) {
        this.b_des = b_des;
    }
}
