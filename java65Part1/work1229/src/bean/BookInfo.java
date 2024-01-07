package bean;

public class BookInfo {
    private int b_id;
    private String b_name;
    private String author_name;
    private int b_t_id;
    private String b_des;

    private TypeInfo type = new TypeInfo();

    public TypeInfo getType() {
        return type;
    }

    public void setType(TypeInfo type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "BookInfo{" +
                "b_id=" + b_id +
                ", b_name='" + b_name + '\'' +
                ", author_name='" + author_name + '\'' +
                ", b_t_id=" + b_t_id +
                ", b_des='" + b_des + '\'' +
                ", type=" + type.toString() +
                '}';
    }

    public BookInfo() {
    }

    public BookInfo(int b_id, String b_name, String author_name, int b_t_id, String b_des) {
        this.setB_id(b_id);
        this.setB_name(b_name);
        this.setAuthor_name(author_name);
        this.setB_t_id(b_t_id);
        this.setB_des(b_des);
    }

    public int getB_id() {
        return b_id;
    }

    public void setB_id(int b_id) {
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

    public int getB_t_id() {
        return b_t_id;
    }

    public void setB_t_id(int b_t_id) {
        this.b_t_id = b_t_id;
    }

    public String getB_des() {
        return b_des;
    }

    public void setB_des(String b_des) {
        this.b_des = b_des;
    }
}
