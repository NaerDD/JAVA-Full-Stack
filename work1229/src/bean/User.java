package bean;

public class User {
    private int u_id;
    private String u_name;
    private String loginId;
    private String loginPwd;

    public User() {
    }

    public User(String u_name, String loginId, String loginPwd) {
        this.u_name = u_name;
        this.loginId = loginId;
        this.loginPwd = loginPwd;
    }

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
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
}
