package proxy;

/**
 * 定义了玩游戏的方法
 */
public interface IGame {
    /**
     * 登录方法
     * @param userName
     * @param password
     */
    void login(String userName,String password);

    /**
     * 打怪的方法
     */
    void killBoss();

    /**
     * 升级的方法
     */
    void upgrade();
}
