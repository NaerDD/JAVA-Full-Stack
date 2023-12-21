public class category {
    private int id;
    private String title;
    private int parentid;

    public category() {
    }

    @Override
    public String toString() {
        return "category{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", parentid=" + parentid +
                '}';
    }

    public category(int id, String title, int parentid) {
        this.setId(id);
        this.setTitle(title);
        this.setParentid(parentid);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getParentid() {
        return parentid;
    }

    public void setParentid(int parentid) {
        this.parentid = parentid;
    }
}
