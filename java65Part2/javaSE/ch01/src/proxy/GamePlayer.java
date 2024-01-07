package proxy;

public class GamePlayer implements IGame {
    private String nickName;

    public GamePlayer(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public void login(String userName, String password) {
        System.out.println("登录游戏，用户名：" + userName + "，密码: " + password);
        System.out.println("欢迎：" + this.nickName);
    }

    @Override
    public void killBoss() {
        System.out.println(this.nickName + "开始打怪。。。");
    }

    @Override
    public void upgrade() {
        System.out.println(this.nickName + "又升了一级。。。");
    }
}
