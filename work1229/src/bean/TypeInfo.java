package bean;

public class TypeInfo {
    private int t_id;
    private String t_name;
    private int t_parentId;
    private String t_des;

    public TypeInfo() {
    }

    public TypeInfo(int t_id, String t_name, int t_parentId, String t_des) {
        this.setT_id(t_id);
        this.setT_name(t_name);
        this.setT_parentId(t_parentId);
        this.setT_des(t_des);
    }

    public int getT_id() {
        return t_id;
    }

    @Override
    public String toString() {
        return "TypeInfo{" +
                "t_id=" + t_id +
                ", t_name='" + t_name + '\'' +
                ", t_parentId=" + t_parentId +
                ", t_des='" + t_des + '\'' +
                '}';
    }

    public void setT_id(int t_id) {
        this.t_id = t_id;
    }

    public String getT_name() {
        return t_name;
    }

    public void setT_name(String t_name) {
        this.t_name = t_name;
    }

    public int getT_parentId() {
        return t_parentId;
    }

    public void setT_parentId(int t_parentId) {
        this.t_parentId = t_parentId;
    }

    public String getT_des() {
        return t_des;
    }

    public void setT_des(String t_des) {
        this.t_des = t_des;
    }
}
