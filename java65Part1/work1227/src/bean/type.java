package bean;

public class type {
    private Integer t_id;
    private String t_name;
    private Integer t_parentId;
    private String t_des;

    public type() {
    }

    public type(Integer t_id, String t_name, Integer t_parentId, String t_des) {
        this.setT_id(t_id);
        this.setT_name(t_name);
        this.setT_parentId(t_parentId);
        this.setT_des(t_des);
    }

    public Integer getT_id() {
        return t_id;
    }

    public void setT_id(Integer t_id) {
        this.t_id = t_id;
    }

    public String getT_name() {
        return t_name;
    }

    public void setT_name(String t_name) {
        this.t_name = t_name;
    }

    public Integer getT_parentId() {
        return t_parentId;
    }

    public void setT_parentId(Integer t_parentId) {
        this.t_parentId = t_parentId;
    }

    public String getT_des() {
        return t_des;
    }

    public void setT_des(String t_des) {
        this.t_des = t_des;
    }
}
