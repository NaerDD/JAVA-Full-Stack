package exam.bean;

import java.util.Date;

public class User {
    private Integer userId;
    private String loginName;
    private String loginPwd;
    private String email;
    private Integer roleId;
    private Integer state;
    private Date last_logintime;

    @Override
    public String toString() {
        return "UserInfo{" +
                "userId=" + userId +
                ", loginName='" + loginName + '\'' +
                ", loginPwd='" + loginPwd + '\'' +
                ", email='" + email + '\'' +
                ", roleId=" + roleId +
                ", state=" + state +
                ", last_logintime=" + last_logintime +
                '}';
    }

    public User() {
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getLast_logintime() {
        return last_logintime;
    }

    public void setLast_logintime(Date last_logintime) {
        this.last_logintime = last_logintime;
    }
}
