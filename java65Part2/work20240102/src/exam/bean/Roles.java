package exam.bean;

public class Roles {
    private Integer roleId;
    private String roleName;

    public Roles() {
    }

    public Roles(Integer roleId, String roleName) {
        this.setRoleId(roleId);
        this.setRoleName(roleName);
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
