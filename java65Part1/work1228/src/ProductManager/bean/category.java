package ProductManager.bean;

public class category {
    private Integer id;
    private String title;
    private Integer parentId;

    public category() {
    }

    public category(Integer id, String title, Integer parentId) {
        this.setId(id);
        this.setTitle(title);
        this.setParentId(parentId);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getParentId() {
        return parentId;
    }

    @Override
    public String toString() {
        return "category{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", parentId=" + parentId +
                '}';
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }
}
