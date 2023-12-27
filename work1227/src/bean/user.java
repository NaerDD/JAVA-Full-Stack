package bean;

public class user {
    private String u_name;
    private String loginId;
    private String loginPwd;

    public user() {
    }

    public user(String u_name, String loginId, String loginPwd) {
        this.setU_name(u_name);
        this.setLoginId(loginId);
        this.setLoginPwd(loginPwd);
    }


    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    @Override
    public String toString() {
        return "user{" +
                ", u_name='" + u_name + '\'' +
                ", loginId='" + loginId + '\'' +
                ", loginPwd='" + loginPwd + '\'' +
                '}';
    }
}
